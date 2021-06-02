package composite;

/**
 * @author Abdelghani Moussaid
 * 
 */

public class Employee extends Role {
    
    public Employee(String name, int salary) {
		super(name, salary);
		// TODO Auto-generated constructor stub
	}

    public int getSalaries() {
	return salary;
    }

    public void getSubordinates(){
    	System.out.println("[Testing a simple employee]");
    }

}
