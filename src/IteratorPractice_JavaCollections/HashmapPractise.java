package IteratorPractice_JavaCollections;

import java.util.HashMap;
import java.util.HashSet;

public class HashmapPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hashmappractise();
	}
public static void hashmappractise(){
	HashMap<String, Integer> courseduration = new HashMap<String, Integer>();
	courseduration.put("java", 45);
	courseduration.put("Aws", 35);
	courseduration.put("devops", 45);
	courseduration.put("devops", 55); // 
	courseduration.put("Jenkins", 43);
	courseduration.put("Dot Net", 43);
	
	System.out.println(courseduration);
	System.out.println(courseduration.containsKey("Python"));
	System.out.println(courseduration.get("devops")); //latest value wil be printed and will be printed once
	System.out.println(courseduration.remove("Dot Net"));
	
}
}
