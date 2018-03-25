package com.operator.thiskeyword.example;

public class Employee {
	// fields
	static int numberOfVisiters = 0;
	
	private int empID;
	private double empSalary;
	public String empName;
	
	
//	// constructor
//	public void setEmp() {
//		// TODO Auto-generated constructor stub
//		empID=-1;
//		empSalary=-100.0;
//		empName = "Unknown";
//	}
	
	
	public static void incNumOfVisiters(){
		numberOfVisiters++;
	}
	
	public static void dispNumOfVisiters(){
		System.out.println("Number of visiters are " + numberOfVisiters );
	}
	
	// constructor
	public Employee() {
		// TODO Auto-generated constructor stub
		empID=-1;
		empSalary=-100.0;
		empName = "Unknown";
		incNumOfVisiters();
	}
	
	public Employee(int id, String name, double salary) {
		// TODO Auto-generated constructor stub
		empID=id;
		empSalary=salary;
		empName = name;
		incNumOfVisiters();
	}
	
//	public void setEmployeeDetails(int x, String y, double z) {
//		empID = x;
//		empName = y;
//		empSalary = z;
//	}

	public void setEmployeeDetails(int empID, String empName, double empSalary) {
//		empID = empID;
//		empName = empName;
//		empSalary = empSalary;
		
		this.empID = empID;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	// accessors or getters
	public int getEmpID() {
		return this.empID;
	}

	public double getEmpSalary() {
		return this.empSalary;
	}
	
	public String getEmpName() {
		return this.empName;
	}

	// mutators or setters
	public void setEmpSalary(double salinc) {
		this.empSalary = this.empSalary + salinc;
	}
	
	void printPaySlip()
	{
		System.out.println("Employee ID : " +this.getEmpID());
		System.out.println("Employee Name: " + this.getEmpName());
		System.out.println("Employee Salary: " + this.getEmpSalary());
	}
	
}