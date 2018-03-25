package com.operator.thiskeyword.example;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program Starts....");

//		setEmployeeDetails(501,"Prem",15999.24);
		
//		int num1 = 2523;
//		char name = 'p';
//		System.out.println(num1);

		
//		int pr1 = 2523;
//		System.out.println(pr1);
		
//		Employee pr0;
		
//		Employee emp0 = new Employee();
//		//emp0.setEmp();
//		emp0.printPaySlip();
		
//		Employee emp1 = new Employee();
//		emp1.printPaySlip();
//		emp1.setEmployeeDetails(501,"Prem",15999.24);
//		emp1.printPaySlip();
//		
		Employee emp2 = new Employee(101,"Mohan",20000.00);
		emp2.printPaySlip();
		emp2.setEmployeeDetails(501,"Prem",15999.24);
		emp2.printPaySlip();
		
		emp2.numberOfVisiters = 1;
		Employee.numberOfVisiters = 5;
		
		Employee.dispNumOfVisiters();
		//		
//		emp1.setEmpSalary(1000);
//		
		
		//pr0.printPaySlip();
		//pr1.printPaySlip();
		
		System.out.println("Program Ends....");
	}
	
	
	
}
