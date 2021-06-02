package composite;

import java.util.Vector;

/**
 * @author Abdelghani Moussaid
 * 
 */

public class Responsable extends Role {


    public Responsable(String name, int salary) {
		super(name, salary);
		// TODO Auto-generated constructor stub
		subordinates = new Vector<Role>();
	}


	public int getSalaries() {
	int sum = salary;
	for (int i = 0; i < subordinates.size(); i++)
	    sum += ((Role) subordinates.elementAt(i)).getSalaries();
	return sum;
    }

    public void getSubordinates() {
	System.out.println("-----------------------");
	System.out.print("Role " + this.getName() + " has "
		+ new Integer(this.subordinates.size()).toString()
		+ " subordinates : ");
	for (int i = 0; i < this.subordinates.size(); i++)
	    System.out.print(((Role) subordinates.elementAt(i)).getName()
		    + ", ");
	System.out.println("\n-----------------------");

	for (int i = 0; i < subordinates.size(); i++)
	    ((Role) subordinates.elementAt(i)).getSubordinates();
    }
    


}