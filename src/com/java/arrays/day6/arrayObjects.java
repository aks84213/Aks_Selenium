package com.java.arrays.day6;

public class arrayObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		int a = 10; // declaration and initialization 
		
		int a; // declaration 
		a = 10; // assignment 
		*/
		
		/*
		int a = 10;
		int b = 9;
		int c = 6, d = 5, e = 7;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);

		System.out.println(a+b+c+d+e);
		System.out.println(a+","+b+","+c+","+d+","+e);
		*/
		
		/*
		int a1 = 10, a2 = 9, a3 = 6, a4 = 5, a5 = 7;
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		*/
		
		/*
		int a[] = new int[5];
		
		a[0]=15;
		a[1]=20;
		a[2]=53;
		a[3]=7;
		a[4]=10;
		//a[5]=32;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		//System.out.println(a[5]);
		 
		 */
		
		/*
		int a[] = {55,66,7,28,29,10,69}; // initialization
		
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(a[3]);
//		System.out.println(a[4]);
//		System.out.println(a[5]);
		
		
		for(int i=0; i<7;i++)
		{
			System.out.println(a[i]);
		}
		*/
		
		/*
		int a[] = {55,66,67,28,29,10,69,84,23}; // initialization
		
		for(int i=0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		*/
		
		String LogOutJSON = String.format("{\"actor\": "
				+ "{\"account\": "
				+ "{\"homePage\": \"http://pearsonsuccessnet.com\","
				+ "\"name\": \""+"mohan"+"\"}},"
				+ "\"verb\": "
				+ "{\"id\": \"http://adlnet.gov/expapi/verbs/exited\"},"
				+ "\"result\": {\"duration\": \"PT0H5M2S\"},"
				+ "\"timestamp\": \""+"2017-01-01"+"\","
				+ "\"object\": "
				+ "{\"id\": \"http://Pearsonsuccessnet.com\","
				+ "\"definition\": "
				+ "{\"type\": \"http://school.pearsoned.com/expapi/activities/application-session\"},"
				+ "\"objectType\": \"Activity\"},"
				+ "\"context\": "
				+ "{\"platform\": \"Ipad\","
				+ "\"registration\": \""+"asdfadsfas fasdfadfa sdfadf"+"\"}}");	
		
		System.out.println(LogOutJSON);
		
	}
	
	
	
	
	
	
	
	public static void arrayExample(){
		
		String product[] = new String [5];
		int cost[] = {5000, 10000, 15000, 20000, 25000}; 		// int [] cost = new int[5]; 
		boolean [] branded = new boolean[] {true, false, true, false, true};
		boolean [] availability = {true, false, true, false, true};
		
		product[0] = "TV";
		product[1] = "Flat TV";
		product[2] = "Curve Tv";
		product[3] = "LED TV";
		product[4] = "Smart TV";
		
		System.out.println(availability.length);
		
		for(int i=0;i<product.length;i++)
		{
			System.out.println("Product is "+product[i] + ":" + cost[i]);
		}
		
		
	}

}
