package FreshPractise;

import java.util.Scanner;

import bsh.org.objectweb.asm.Type;


public class loopingStatements {

	public static void main(String[] args) {
		System.out.println("***Program Starts from Main Method***");
		//forloop1();
		//forloop2();
		//forloop3();
		//forloop4();
		//forloop5();
		//forloopProg29();
		//forloopProg30();
		//forloopProg32();
		//forloopProg33();
		//whileLoopProg34();
		//whileLoopProg36();
	//	whileLoopProg37();
		//ifwhileLoopProg38();
		//ifwhileLoopProg();
		ifwhileLoopFactorial(121);
		
		
		System.out.println("***Program Ends***");
	}
public static void forloop1(){
	
	for (int i=0; i<=5; i++) //if i is less than or equal to 5 than will print **
	{
		System.out.println("*");
}
	
		}
public static void forloop2(){
	for (int i=0; i>5; i++){
		System.out.println("*");
	}
}
	public static void forloop3(){
		for (int i = 0; i<5; i++){
			System.out.println(i);
		}
	}
	
	public static void forloop4(){
		for(int i =0; i<5; i++){
			for (int j=1; j<=4; j++){
				System.out.print("*"); // Instead of println, only print has been used, this will print columns
			}
			System.out.println();
		}
		System.out.println("Program Ends");	
	}
	
	public static void forloop5(){
		for (int i=0; i<5; i++){
			System.out.println(i);
			
			for (int j=1; j<=5; j++){
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("Program Ends");
		
	}
		public static void forloopProg29(){
			for (int i = 0; i<5; i++){
				for (int j=1; j<=i; j++){
					System.out.print(j);
				}
				System.out.println();
			}
		}
		public static void forloopProg30(){
			for (int i=5; i>-1; i--){
				for (int  j=1; j<=i; j++)
				{
					System.out.print(j);
				}
				System.out.println();
		}
}
		public static void forloopProg32(){
			for (int i=0; i<=5; i++){
				for(int j =1; j<=i; j++){
					System.out.print(j);
				}
				System.out.println();
			}
			for (int i =5; i>-1; i--){
				for(int j=1; j<=i; j++){
					System.out.print(j);
				}
				System.out.println();
			}
		}
		public static void forloopProg33(){
			for (int i=5; i>=1; i--){
				for (int j=1; j<=i; j++){
					System.out.print(j);
				}
				System.out.println();
			}
			for (int i=0; i<=5; i++){
				for(int j=1; j<=i; j++){
					System.out.print(j);
				}
				System.out.println();
			}
		}
		public static void whileLoopProg34(){
			int k =1;
			while (k<=5){
				System.out.println("*");
				k++;
			}
		}
		public static void whileLoopProg36(){
			double curBal = 20000.00;
			int count = 1;
			System.out.println("The current balance is "+curBal);
			while (count<=5)
			{
				curBal = curBal-4000;
				System.out.println("Withdrawal successfull");
				System.out.println("remaining balance is : "+curBal);
			count++;
			}
		}
		public static void whileLoopProg37(){
			double curBal = 25000.00;
			int count =1;
			System.out.println("Current Balance is "+curBal);
			while (curBal>0){
				curBal = curBal-2500;
				System.out.println("Withdrawal success");
				System.out.println("The Remaining Balance is "+curBal);
				count++;
			}
		}
	public static void 	ifwhileLoopProg38(){
		double curBal = 25000.250;
		int count = 1;
		System.out.println("The current Balance is "+curBal);
		while (curBal>0)
		{
			if (curBal <=2000){
				System.out.println("Minimum Balanced reached, cannot withdraw beyond this");
				break;
			}
			curBal=curBal-2500;
			System.out.println("Withdrawal Sucess");
			System.out.println("the remaining Balance is "+curBal);
			
		}
	}
	public static void ifwhileLoopFactorial(int num){
		for(int i=0; i<=num; i++){
			if (i % 5 != 0){
				System.out.println("The 100 Even Numbers are "+i);
			}
			i++;
		}
	}
}


	
	


