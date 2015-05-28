/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.util.Date;
import javax.ejb.Remote;

/**
 *
 * @author Stijn
 */
@Remote
public interface LoginStatefulSessionBeanRemote {
    
    public void setName(String newName);
    
    public String getName();
    
    public void setEmail(String newEmail);
    
    public void setBirthdate(Date newBirthdate);
    
    public void login(String name, String password);
    
    public void finish();
}
