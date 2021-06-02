package composite;

import java.util.*;

/**
 * @author Abdelghani Moussaid
 * 
 * The Composite Class
 * Modified with the new collection of Roles
 * Implements the component interface
 * 
 */

public class Enterprise implements Division {

    Vector<Role> enterprise;

    public void createEnterprise() {
	String roles[] = { "CEO", "Marketing VP", "Production VP", "Sales Mgr",
		"Advt Mgr", "Prod Mgr", "Ship Mgr", "Sales", "Secy", "ManuF",
		"ShipClrk" };
	int salaries[] = { 200000, 100000, 100000, 50000, 50000, 40000, 35000,
		30000, 20000, 25000, 20000 };

	for (int i = 0; i < 7; i++)
	    enterprise.addElement(new Responsable(roles[i], salaries[i]));

	// Boss subordinates
	((Responsable) (enterprise.elementAt(0))).add((Responsable) (enterprise
		.elementAt(1)));
	((Responsable) (enterprise.elementAt(0))).add((Responsable) (enterprise
		.elementAt(2)));

	// marketVP subordinates
	((Responsable) (enterprise.elementAt(1))).add((Responsable) (enterprise
		.elementAt(3)));
	((Responsable) (enterprise.elementAt(1))).add((Responsable) (enterprise
		.elementAt(4)));

	// prodVP subordinates
	((Responsable) (enterprise.elementAt(2))).add((Responsable) (enterprise
		.elementAt(5)));
	((Responsable) (enterprise.elementAt(2))).add((Responsable) (enterprise
		.elementAt(6)));

	// salesMgr subordinates
	for (int i = 0; i < 5; i++) {
	    enterprise.addElement(new Employee(roles[7]
		    + new Integer(i).toString(), salaries[7]));
	    ((Responsable) (enterprise.elementAt(3))).add((Employee) (enterprise
		    .elementAt(7 + i)));
	}

	// Advt Mgr subordinates
	enterprise.addElement(new Employee(roles[8], salaries[8]));
	((Responsable) (enterprise.elementAt(4))).add((Employee) (enterprise
		.elementAt(12)));

	// 
	for (int i = 0; i < 4; i++) {
	    enterprise.addElement(new Employee(roles[9]
		    + new Integer(i).toString(), salaries[9]));
	    ((Responsable) (enterprise.elementAt(5))).add((Employee) (enterprise
		    .elementAt(13 + i)));
	}

	// shipMgr subordinates
	for (int i = 0; i < 3; i++) {
	    enterprise.addElement(new Employee(roles[10]
		    + new Integer(i).toString(), salaries[10]));
	    ((Responsable) (enterprise.elementAt(6))).add((Employee) (enterprise
		    .elementAt(17 + i)));
	}
    }

    public Vector<Role> getEnterprise() {
    	return enterprise;
    }

    public Enterprise() {
		enterprise = new Vector<Role>();
		createEnterprise();
    }
    
 // --------------------------------------
    public void add(Role r) {
    	enterprise.elementAt(0).add(r);
    }

    public void remove(Role r) {
    	enterprise.removeElement(r);
    }

    public Enumeration<Role> elements() {
    	return enterprise.elements();
    }
    
    public void getSubordinates() {
    		enterprise.elementAt(0).getSubordinates();
    }
}
