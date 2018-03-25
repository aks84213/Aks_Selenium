package com.java.harsha.day3;

public class CallingOfMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = accessPublicVariable();
		System.out.println(accessPublicVariable());
		
	}
	
	public static int accessPublicVariable() {
		//System.out.println("test");
		return MethodsAndVariables.instanceVariable;
	}
	

}
