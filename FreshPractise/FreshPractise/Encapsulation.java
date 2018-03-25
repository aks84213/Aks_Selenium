package FreshPractise;

import org.apache.http.impl.auth.GGSSchemeBase;

public class Encapsulation {

	private String geekName;
	private String geekRole;
	private int geekID;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encapsulate();
	}
//get method for Age to access private variable geekAge
	public int getID(){
		return geekID;
	}
	// get method for name to access private variable getName
	public String getName(){
	 return geekName;
	}
	
	//get method to get role to access private variable geekRole.
	public String getRole(){
		return geekRole;
	}
	
	//Set method for age to access private variable geekAge.
	public void setID(int newID){
		geekID = newID;
	}
	
	public void setName(String newName){
		geekName = newName;
	}
public void setRole(String newRole){
	geekRole = newRole;
}

public static void encapsulate(){
	Encapsulation obj = new Encapsulation();
	 
	 obj.setName ("Mohan");
	 obj.setRole ("QA");
	 obj.setID  (24);
	 
	 System.out.println("Name is:  "+obj.getName());
	 System.out.println("Role is: "+obj.getRole());
	 System.out.println("Id is: "+obj.getID());
	  
}
}
