package FreshPractise;

public class FreshPractiseFromBeginingVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//StringConcat();
		//VarInitilization();
		//VarInitDecl();
		//NoVarInit();
		//varDecInt();
		//asgnReAsgn();
		//finalKeyword();
		//intWitOperators();
		varDouble();
		
	}
	public static void StringConcat(){
		System.out.println("Program Starts.");
		System.out.println(20+30);
		System.out.println("The result is "+20+30);
		System.out.println("The output is "+(20+30));
		System.out.println("***Program Ends***");
	}
	public static void VarInitilization(){
		//Variable Declaration
		int empid;
		double empsalary;
		char empgrade;
		
		//Variable Initialization
		empid= 1234;
		empsalary=2000.30;
		empgrade= 'A';
		
		//variable Utilization
		System.out.println("Program Starts..");
		System.out.println("The employee ID is "+empid );
		System.err.println("The salary of the employee is "+empsalary);
		System.out.println("The Grade of the employee is "+empgrade);
		System.out.println("Program Ends.");	
		}
	
	public static void VarInitDecl(){
		//Variable Declaration
		System.out.println("***Program Starts***");
		int empid;
		double empsalary;
		char empgrade;
		
		
		//Variable Initialization
		empid= 1234;
		empsalary=2000.30;
		empgrade= 'A';
		
		System.out.println("We have just Declared and initialized the Variables, they are not Utilized");
		System.out.println("***Program Ends***");
		
		}
	public static void NoVarInit(){
		System.out.println("**Program Starts**");
		int empid = 0;
		double empSalary = 0;
		char empGrade = 0;
		System.out.println("The variables are declared and Utilized but not Initialized");
		System.out.println("the EmployeeID is "+empid); //since the variables are not initialized, this will throw an error
		System.out.println("The Salary is "+empSalary); //since the variables are not initialized, this will throw an error
		System.out.println("The Employee Grade is "+empGrade); //since the variables are not initialized, this will throw an error
		System.out.println("**Program Ends**");
	}
	
	public static void varDecInt(){
		//variable declaration and initialization in single line
		int empid = 1124;
		double empsalary = 25000.200;
		char empGrade = 'A';
		
		System.out.println("**Program Starts**");
		System.out.println("The employeeID = "+empid);
		System.out.println("Employee with employeeID "+ empid + " has salary of "+empsalary );
		System.out.println("Employee with employeeID "+ empid + " has salary of "+empsalary + " belongs to the Grade "+empGrade);
		System.out.println("**Program Ends**");
	}
	
	public static void asgnReAsgn(){
		int var1;// We just need to declare the variable and initialize it
		var1 = 25; //assignment
		System.out.println("The Value of Var1 is "+ var1);
		var1 = 50; //re-assignment
		System.out.println("The value of Var1 after re-assgnment is "+ var1);
		var1 = 100; //re-Assignment
		System.out.println("The value for the Var1 after reassigning it for the 2nd time is "+var1);
	}
	
	public static void finalKeyword(){
		final int Var1;
		Var1 = 25; // assignment
		System.out.println("The value of the variable declared as final is "+Var1);
		//Var1 = 50; // Re assignment, but this should not be printed.
		System.out.println("The value of Var1 is  "+Var1);
		//Var1 = 100; //Re assignment for the second time and even this wil not be printed.
		System.out.println("The value is  "+Var1);
	}
	public static void intWitOperators(){
		int Var1 = 25 + 15;
		System.out.println("The output of Var1 is "+Var1);
		int Var2 = 25 + 15 - 5;
		System.out.println("the output of Var2 (25 + 15 - 5) is "+Var2);
		int Var3 = 25*4+25-10;
		System.out.println("The output of Var3 (25*4+25-10) is "+Var3);
		int Var4 = 25*(5-1);
		System.out.println("The output of Var4 (25*(5-1)) is "+Var4);
	}
	public static void varDouble(){
		double simpleintrest;
		double principle = 2000.00;
		double time = 2.5;
		double rate = 7.5;
		
		simpleintrest = (principle*time*rate)/100;
		System.out.println("SimpleInterest = "+simpleintrest);
		
	}
	
}
