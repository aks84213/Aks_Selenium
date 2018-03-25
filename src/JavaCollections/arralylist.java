package JavaCollections;

import java.util.ArrayList;

public class arralylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arraylistex();
	}
public static void arraylistex(){
	
	ArrayList<String> users = new ArrayList<>();
	
	String [] userArray = new String[5];
	
	users.add("Mohan");
	users.add("Prem");
	users.add("Aks");
	users.add("sagar");
	
	ArrayList<String> remainingUsers = new ArrayList<>();
	remainingUsers.add("IMA");
	remainingUsers.add("Inspiration");
	remainingUsers.add("AmBest");
	
	
	System.out.println(users.size()); // gives the size or count of the values presentin the array list
	System.out.println(users.contains("Mohan"));//checks the valuein the aray list
	System.out.println(users.get(3));// gets the value based on the index
	System.out.println(users.isEmpty());
	System.out.println(users.addAll(remainingUsers));
	System.out.println(users.size());
	
	// Use debugger so tht can understand clearly, 
	for (String var1 : remainingUsers) {
		System.out.println(var1.equals("Java"));
		
	}
	
//	for (int i=0; i<users.size(); i++){
//		System.out.println(users.get(i));
//	}
	//for each loop
	for (String printUsers: users){
		if (printUsers.equalsIgnoreCase("Mohan"))
		{
			System.out.println("User Found");
		}
		System.out.println(printUsers);
	}
	
}
}
