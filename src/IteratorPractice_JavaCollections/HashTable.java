package IteratorPractice_JavaCollections;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hashtable();
	}
public static void hashtable(){
	
	Hashtable<String, String> teamNames = new Hashtable<>();
	teamNames.put("India", "IND");
	teamNames.put("Sri Lanka", "Sl");
	teamNames.put("Sounth Africa", "SA");
	teamNames.put("Auastralia", "Aus");
	teamNames.put("Pakistan", "PAK");

	
System.out.println(teamNames);
System.out.println(teamNames.get("Auastralia"));
System.out.println(teamNames.remove("Pakistan"));
System.out.println(teamNames.contains("Sri"));
System.out.println(teamNames.containsKey("Sri lanka"));
System.out.println(teamNames.replace("Sounth Africa", "RSA"));
System.out.println(teamNames);

}
}
