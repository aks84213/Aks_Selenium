package FreshPractise;

import java.awt.GradientPaint;

public class ifStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ifStatement();
		//IfStatement1();
		//IfStatement2();
		//NestedIf();
		//nestedIf1();
		//nestedif2();
		//nestedif3();
		//nestedIf4();
		//nestedIf5(); 
		//nestedIf5();
		//nestedIf6();
		//elseIf1();
		//switchStatement1();
		//switchStatement2();
		//switchStatement3();
		switchStatement4();
	}
	public static void ifStatement(){
		int num = 10;
		if (num > 8){
			System.out.println("The value " + num + " is greater than 8");
		}
	}
	public static void IfStatement1(){
		int Num1 = 25;
		int Num2 = Num1*4;
		int Num3 = Num1+Num2/2;
		
		if (Num3 >= 50) {
			System.out.println("The value is True");
		}else{
			System.out.println("The value is False");
		}
		
	}
	public static void IfStatement2(){
		int empid =1124;
		double empsalary = 250.34;
		char empGrade = 'C';
		
		if (empsalary > 250) {
			System.out.println("The salary of " +empid+ " with employee Grade " + empGrade + " is greter");
		}
	}
	public static void NestedIf(){
		int num = 1;
		if (num > 5){
			if (num < 20){
				System.out.println(num +" is greater than 5 but lesser than 20");
				
			}else {
				System.out.println(num + " is greater than 5 and greater 20");
			}
		}else{
			System.out.println(num+ " is less than 5");
		}
	}
	public static void nestedIf1(){
		int age = 29;
		if (age < 13){
			System.out.println("You entered the Teenage, Congradulations!!");
		}//end if for age 13
		else if (age < 19 ){
			System.out.println(" End of Teenage :( ") ;
		}// end else if for age 19
		else if (age < 65){
			System.out.println("You are an Adult");
		}//end if for age 65
		else{
			System.out.println("You are a Senior Citizen, take care of ur health");
		}//End if for nested else
			System.out.println("Program Ends");
		
	}//End of final else
	public static void nestedif2(){
		int x = 30;
		int y = 20;
		if (x == 30){
			if (y > 10){
				System.out.println("The Value of Y is greater than 10");
			}else{
				System.out.println("The value of Y is 20");
			}
		}
			
	}
	public static void nestedif3(){
		int Balance = 20000;
		int withdraw = 10000;
		if (Balance >= withdraw){
			System.out.println("The withdrawn amount is less than Available Balance");
		}else{
			System.out.println("The Amount withdrown is Equal ");
		}
		
	}
	public static void nestedIf4(){
		int Balance = 20000;
		int withdraw = 10000;
		if (Balance > withdraw){
			Balance = Balance-withdraw; // tried something on my own to see if this works and it works
			System.out.println("Remaining balance is "+ Balance);
}else{
	System.out.println("insufficient Balance");
}
	}
	public static void nestedIf5(){
		int Bal = 20000;
		int withdraw = 2000;
		if (Bal <= withdraw)
		{
			System.out.println("Insufficient Balance");
		}else{
			Bal = Bal - withdraw;
			System.out.println("Remaining Balance is "+Bal);
			System.out.println("Amount withdrawn is "+ withdraw);
		}
	}
	public static void nestedIf6(){
		// if statement without curly braces
		int num1 = 10;
		if (num1 > 8 )
			System.out.println(num1 +" is greter than 8");
			System.out.println("Since no curly braces are used, both the statements are printed");
	}
	public static void elseIf1(){
		char Grade = 'A';
		if (Grade == 'A'){
			System.out.println("First Class With Distinction");
		}
		else if (Grade == 'B'){
			System.out.println("First Class");
		}
		else if (Grade == 'C'){
			System.out.println("Second Class");
		}
		else{
			System.out.println("Fail");
		}
		System.out.println("Program Ends");
	}
	public static void switchStatement1(){
		int age =4;
		switch (age){
		case 1:
			System.out.println(" You can Crawl");
			break;
		case 2:
			System.out.println("You Can Walk");
			break;
		case 3:
			System.out.println("You go to School");
			break;
		case 4 :
			System.out.println("You wil have to play and study");
			break;
		case 5 :
			System.out.println("You wil have to eat play and study");
			break;	
			default:
			System.out.println("The age specified is not in the desired group");
		
		}
	}
	public static void switchStatement2(){
		char Grade = 'B';
		switch (Grade)
		{
		case 'A':
			System.out.println("First class with Distinction");
			break;
		case 'B':
		System.out.println("First Class");
		break;
		case 'C':
			System.out.println("SecondClass");
			break;
		default:
			System.out.println("ThIs CannOT be GraDed");
		}
	}
	public static void switchStatement3(){
	 int Balance=30000, withdraw=30000, RemainingBal=Balance-withdraw;
	 switch (withdraw){
	 case 10000:
		 System.out.println("The remaining Balance is "+RemainingBal);
		 break;
	 case 20000:
		 System.out.println("The remaining Balance is "+RemainingBal);
		 break;
	 case 30000:
		 System.out.println("The remaining Balance is "+RemainingBal + " Pls Deposit money to avoid a/c cancelation");
		 break;
	 case 40000:
		 System.out.println("There's No sufficient Balance, please enter amount less than "+Balance);
		 break;
		 
		 default:
			 System.out.println("Invalid Amount");
			 break;
	 }
	 
	 switch (RemainingBal){
	 case 20000:
		 System.out.println("Remaining Balance for 2nd switrch  is "+RemainingBal);
		 break;
	 case 30000:
		 System.out.println("Remaining balance is Empty "+RemainingBal);
	 }
	 switch (Balance){
	 case (30000):
		 System.out.println("OPening Balance is "+Balance);
	 break;
	
	 }
	 
	}
	public static void switchStatement4(){
		int empid = 1125;
		double empSalary = 250.25;
		char empGrade = 'A';
		
		switch(empid){
		case (1120):
			System.out.println("This Employee does not fal under Grade "+empGrade);
		break;
		case (1122):
			System.out.println("This Employee belongs to Grade 'A' and does not belongs to "+empGrade);
		break;
		case (1124):
			System.out.println("The Employee belongs to Grade- "+empGrade +" and the salary of the emploee is "+empSalary);
		break;
		
		default:
		System.out.println("Incorrect Employee ID");
		}
		switch (empGrade){		
			case ('A'):
				System.out.println("The Employee grade does not fall under '"+empGrade + "' Category");
			break;
			case ('B'):
				System.out.println("The Employee does not fall under "+empGrade);
break;
			case ('C'):
				System.out.println("The Employee belongs to Grade - '"+empGrade +"' - Category");
			
			break;
			
			default:
			System.out.println("Incorrect Employee Grade");
	}
	}
}
