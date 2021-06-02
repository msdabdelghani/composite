package composite;

import java.util.Enumeration;

/**
 * @author Abdelghani Moussaid
 * 
 * The Component Class
 * 
 */

public interface Division {
	
	// methods implemented by Enterprise or Role

    public void add(Role e);

    public void remove(Role e);

    public Enumeration<Role> elements();
    
    public void getSubordinates();
    
}
