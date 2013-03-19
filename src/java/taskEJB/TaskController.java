/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taskEJB;

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
public class TaskController implements TaskControllerLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    @PersistenceContext(unitName = "TaskEJBPU")
    private EntityManager em;
    //@PersistenceContext(unitName = "CommentEJB-ejbPU")
    //private EntityManager em;
    //Query q = em.createQuery("SELECT c FROM Comment c");

    /**
     *
     * @param object
     */

    

    @Override
    public void add(Task t) {
            
        em.persist(t);
    }
        

    @Override
    public void delete(Task t){
        Task managedT = em.merge(t);
        em.remove(managedT);
    }
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    /**
     *
     * @return
     */
  
    @Override
    public List<Task> list() {
        Query findAll;
        findAll = em.createQuery("SELECT t FROM Task as t");
        return findAll.getResultList();
    }

    

}
