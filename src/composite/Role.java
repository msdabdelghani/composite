package composite;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author Abdelghani Moussaid
 * 
 * Leaf Class 
 * Abstraction of Employee and "Responsable" classes
 * 
 */ 

public abstract class Role implements Division {

	protected String name;
	protected int salary;
	protected Vector<Role> subordinates;
	
	public Role(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
		
	}

	public abstract int getSalaries(); // cout

	public abstract void getSubordinates(); 

    
 // Adds a role(Employee, Responsable) as a subordinate  
    
    public void add(Role e) {
    	subordinates.addElement(e);
    }

    public void remove(Role e) {
    	subordinates.removeElement(e);
    }

    public Enumeration<Role> elements() {
    	return subordinates.elements();
    }

    // Getters to avoid duplication in subclasses 
    
    public String getName() {
    	return name;
    }
    
    public int getSalary() {
    	return salary;
    }




}