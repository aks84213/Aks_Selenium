package com.java.examples.oppconcepts;

public class Encapsulation {
	
	static int a = 10;
	public int b = 20;
	private int c = a+b;
	protected int d = a+b+c;
	
	public static void dispA(){
		System.out.println("The output of A " + a);
	}
	
	public void dispB(){
		 System.out.println("The value of B " + b);
	 }

	public void dispC(){
		sum();
	}
	
	private void sum(){
		// return c;
		System.out.println("The value of C " + c);
	}
	
}

