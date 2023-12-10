package services;
import entities.User;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class UserFacade extends AbstractFacade<User> {
    @PersistenceContext(unitName = "test22PU")
    private EntityManager em;

    public UserFacade() {
        super(User.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public User findByUsername(String username) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<User> cq = cb.createQuery(User.class);
        Root<User> root = cq.from(User.class);

        cq.select(root).where(cb.equal(root.get("username"), username));

        try {
            return em.createQuery(cq).getSingleResult();
        } catch (NoResultException e) {
            // Handle if no user found with the provided username
            return null;
        }
    }
}
