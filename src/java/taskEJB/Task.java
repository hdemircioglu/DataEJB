/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taskEJB;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import userEJB.User;

/**
 *
 * @author HD
 */
@Entity
public class Task implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    //priority, a title, optional notes, a due date, a completion flag, 
    //requesting user and an assigned user

    private int priority;
    private String title;
    private String optionalNote;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dueDate;
    private boolean completionFlag;
    
    private User requestingUser;
    private User assignedUser;
    //requesting user and an assigned user
    
    public Task(){
        
    }
    
    public Task(int priority, String title, String optionalNote, Date dueDate, boolean completionFlag, User requestingUser, User assignedUser ){
        
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOptionalNote() {
        return optionalNote;
    }

    public void setOptionalNote(String optionalNote) {
        this.optionalNote = optionalNote;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isCompletionFlag() {
        return completionFlag;
    }

    public void setCompletionFlag(boolean completionFlag) {
        this.completionFlag = completionFlag;
    }

    public User getRequestingUser() {
        return requestingUser;
    }

    public void setRequestingUser(User requestingUser) {
        this.requestingUser = requestingUser;
    }

    public User getAssignedUser() {
        return assignedUser;
    }

    public void setAssignedUser(User assignedUser) {
        this.assignedUser = assignedUser;
    }
    
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Task)) {
            return false;
        }
        Task other = (Task) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "taskEJB.Task[ id=" + id + " ]";
    }
    
}
