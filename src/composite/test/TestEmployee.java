package composite.test;

import composite.Employee;
import composite.Enterprise;
import composite.Responsable;
import composite.Role;

/**
 * @author Abdelghani Moussaid
 * 
 * The Client Class
 * Can be used to define a new Enterprise Hierarchy
 * New Possibility of test by using the role 
 * 
 */

public class TestEmployee {

    public static void main(final String[] args) {

	Enterprise e = new Enterprise();
	e.getEnterprise().elementAt(0).getSubordinates();
	System.out.println(e.getEnterprise().elementAt(0).getName()
    		+ " has salary equal to "
    		+ new Integer(e.getEnterprise().elementAt(0).getSalaries())
    			.toString());
	
	
	// Nouvelle possibilit� de test :
	
	Role RVP = new Responsable("RH VP", 35000); // Ajout d'un role de r�sponsable
	Role FMgr = new Responsable("Formations MNG", 29000); // Ajout d'un role de r�sponsable
	Role RMgr = new Responsable("Rectrutments MNG", 29000); // Ajout d'un role de r�sponsable
	Role Formateur1 = new Employee("F1",13000); // Ajout d'un role de employ�
	Role Formateur2 = new Employee("F2",13000); // Ajout d'un role de employ�
	Role Formateur3 = new Employee("F3",13000); // Ajout d'un role de employ�
	Role Chasseur1 = new Employee("R1",14000); // Ajout d'un role de employ�
	Role Chasseur2 = new Employee("R2",14000); // Ajout d'un role de employ�
	
    
	
	RVP.add(FMgr);
	RVP.add(RMgr);
    FMgr.add(Formateur1);
    FMgr.add(Formateur2);
    FMgr.add(Formateur3);
    
    RMgr.add(Chasseur1);
    RMgr.add(Chasseur2);
    
    
    e.add(RVP); // Va ajouter le d�partement RH li� directement au CEO 
    
    // Affichage 
    
    System.out.println("\n\n******************************************\n\n");
    e.getSubordinates();
    System.out.println(RVP.getName()
    		+ " has salary equal to "
    		+ RVP.getSalaries());
    
    }
         
    
    
    
    
}