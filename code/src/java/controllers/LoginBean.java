import entities.User;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import services.UserFacade;

@ManagedBean
@SessionScoped
public class LoginBean {
    private String username;
    private String password;
    private UserFacade userFacade;
  @PersistenceContext(unitName = "test22PU")
    private EntityManager em;

    public LoginBean() {
        userFacade = new UserFacade(); // Initializing UserFacade
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserFacade getUserFacade() {
        return userFacade;
    }

    public void setUserFacade(UserFacade userFacade) {
        this.userFacade = userFacade;
    }


    public String login() {
         
        TypedQuery<User> query = em.createQuery("SELECT u FROM User u WHERE u.username = :username", User.class);
        query.setParameter("username", username);
        User user=null;
        try{
         user= query.getSingleResult();
        }catch(Exception e){
            return "errorlog.xhtml";
        }
        if (user != null && user.getPassword().equals(password)) {
            System.out.println("===================yes");
            return "chart.xhtml"; // Redirect to success page on successful login
        } else {
             System.out.println("===================no");
            return "errorlog.xhtml"; // Redirect to error page on failed login
        }
    }
}
