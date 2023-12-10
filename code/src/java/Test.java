
import services.UserFacade;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Test {
    public static void main(String[] args) {
        UserFacade uf =new UserFacade();
        System.out.println(uf.findByUsername("admin"));
    }
}
