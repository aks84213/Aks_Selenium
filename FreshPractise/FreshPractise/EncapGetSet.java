package FreshPractise;

public class EncapGetSet {
private String geekName;
private String geekRole;
private int geekId;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encapsulate();
	}
public String getName(){
	return geekName;
}
public String getRole(){
	return geekRole;
}
public int getId(){
	return geekId;
}

public void setName(String newName){
	geekName = newName;
}
public void setRole(String newRole){
	geekRole = newRole;
}
public void setId(int newId){
	geekId = newId;
}
public static void encapsulate(){
	EncapGetSet obj = new EncapGetSet();
	
	obj.setName("Aks");
	obj.setRole("Martial Artist");
	obj.setId(1124);
	
	System.out.println("Name is: "+obj.getName());
	System.out.println(obj.getName() + " is an "+ obj.getRole());
	System.out.println("The ID is: "+obj.getId());
		
}


}
