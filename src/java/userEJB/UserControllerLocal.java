/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userEJB;

import java.util.List;
import javax.ejb.Local;


/**
 *
 * @author muratmenevse
 */
@Local
public interface UserControllerLocal {


    public void add(userEJB.User t);

    public void delete(userEJB.User t);

    
    public List<userEJB.User> list();

    
    
}
