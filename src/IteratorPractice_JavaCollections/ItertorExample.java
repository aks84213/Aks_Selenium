package IteratorPractice_JavaCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ItertorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iteratorPractice();
	}
	
	public static void iteratorPractice(){
		ArrayList<String> courses = new ArrayList<>();
		courses.add("Java");
		courses.add("Selenium");
		courses.add("Dotnet");
		courses.add("Python");
		courses.add("AWS");
		
		Iterator<String> iterator = courses.iterator();
		// System.out.println(iterator.hasNext());
		
		while(iterator.hasNext()){ // it will check the next element present and if yes then returns true
			//System.out.println(iterator.next()); // fetch the data 
			//System.out.println(iterator.next().equals("AWS"));
			System.out.println(iterator.next().equalsIgnoreCase("AWS"));
			iterator.remove(); // it removes the active element 
			
		}
		
		System.out.println(courses.size());
		
	}

}
