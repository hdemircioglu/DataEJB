/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taskEJB;

import java.util.List;
import javax.ejb.Local;


/**
 *
 * @author muratmenevse
 */
@Local
public interface TaskControllerLocal {


    public void add(taskEJB.Task t);

    public void delete(taskEJB.Task t);

    
    public List<taskEJB.Task> list();

    
    
}
