/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userEJB;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author muratmenevse
 */
@Stateless
public class UserController implements UserControllerLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    @PersistenceContext(unitName = "UserEJBPU")
    private EntityManager em;
    //@PersistenceContext(unitName = "CommentEJB-ejbPU")
    //private EntityManager em;
    //Query q = em.createQuery("SELECT c FROM Comment c");

    /**
     *
     * @param object
     */

    

    @Override
    public void add(User u) {
            
        em.persist(u);
    }
        

    @Override
    public void delete(User u){
        User managedT = em.merge(u);
        em.remove(managedT);
    }
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    /**
     *
     * @return
     */
  
    @Override
    public List<User> list() {
        Query findAll;
        findAll = em.createQuery("SELECT u FROM User as u");
        return findAll.getResultList();
    }

    

}
