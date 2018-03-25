package mywork;

public class Employee {
	// fields
	private int empID;
	private double empSalary;
	public String empName;
	public EnumUserStatus empStatus;
	
	public void getEmployeeDetails(){
		System.out.println("Employee iD = " + empID);
		System.out.println("EmployeeName = " + empName);
		System.out.println("EmployeeSalary = "+ empSalary);
		System.out.println("EmployeeStatus = "+ empStatus);
	}
	
	public void setEmployeeDetails() {
		empID = 123;
		empName = "Mohan S";
		empSalary = 250000;
		empStatus = EnumUserStatus.ACTIVE;
	}

	void printPaySlip()
	{
		System.out.println("Employee ID : " + empID);
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Salary: " + empSalary);
	}
	
}