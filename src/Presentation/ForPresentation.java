package Presentation;

public class ForPresentation {

	static int globalvar = 50;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5; //  initialization => declaration and assignment 
		int b ; // variable declaration // = 15;
		b = 5; // assignment of value to variable
		
		int sum = 0; 
		int multiplication = 0;
		
		
		//System.out.println(globalvar);
		//presentation(); // calling method without parameter 

	//sum = addition(a, b); // calling method with parameter a and b for addition
	//System.out.println("Sum of " + a + " and " + b + " is " + sum);
		
	//	Subtraction(a, b);
			
	//	multiplication = multiply(a, b);
	//	System.out.println("The output of the multiplication is " + multiplication);
		
			
		/* 
		 int a = 4, int b = 5;
		 a to power of b
		 4 to the power of 5
		 4 * 4 * 4 * 4 * 4
		 */
		
		// powerofB();
		
		//int result = aPowerofB(a, b);
		//System.out.println(a + " to the Power of " + b + " is " +result);
		
	 //sum = adding();
	 //System.out.println(" the output is "+sum);
		
		practise();
	}
	 
	public static int aPowerofB(int x, int y){
		int z = 1;
		for (int i = 1; i<=y; i++)
		{
			z= z*x;
		}
		
		return z;
	}

	/*
	public static void powerofB(){
		int a = 4;
		int b = 5;
		int c = 1;
		
		for (int i = 1; i<=b; i++)
		{
			c = c * a;
			System.out.println(c); 
		}
		System.out.println("A to the Power of B = "+c);
	}
	*/
	
	
	
	public static void presentation(){
		//System.out.println(globalvar);
		System.out.println("For today's Presentation");
	}
	
	public static int addition(int x, int y){
		int c = x + y;
		return c;		
	}
	
	public static void Subtraction(int i, int j){
		int diff = i - j;
		System.out.println("The difference is " +diff);
	}
	
	public static int multiply(int num1, int num2){
		// int prod = num1 * num2; return prod;
		return (num1*num2);
	}
	public static int adding(){
	 int p = 10;  int q = 25;
	 int r = p+q; return r;
	}
	 public static void practise(){
		 int p = 10;  int q = 25;
		 int r = p+q; int s = r+10; 
		int Sub = s-r;

	
	 if (Sub >s)
	 {
		 System.out.println(" The output of the value after Subtraction is "+Sub);
	 }else{
		 System.out.println("The Out put of S is ="+s);
	 }
	 System.out.println("the otput of r = "+r);
	 System.out.println("The output of S = "+s);
	 System.out.println("The output of Sub = "+Sub);
}
}
