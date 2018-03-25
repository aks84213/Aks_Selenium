package mywork;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Program Starts....");

//		int a = 30;
//		System.out.println(a);
//		
//		int b = 50;
//		System.out.println(b);
//		
		Employee esEmp = new Employee();
		esEmp.empName = "Prem";
		System.out.println(esEmp.empName);

		esEmp = new Employee();
		esEmp.empName = "Mohan";
		System.out.println(esEmp.empName);
		
		Employee esEmp1 = new Employee();
		esEmp1.empName = "Mohan Rao";
		System.out.println(esEmp1.empName);
		
		System.out.println(esEmp.empName);
		System.out.println(esEmp1.empName);
		
//		Employee esEmp = new Employee();
//		
//		Employee esEmp ; //= new Employee();
//		esEmp = new Employee();
		
//		Employee emp1 = new Employee ();
//		emp1.setEmployeeDetails();
//		emp1.getEmployeeDetails();
		//emp1.printPaySlip();
		//emp1.setEmployeeDetails(501,"Prem",15999.24);
		//emp1.printPaySlip();
		

		System.out.println("Program Ends....");
	}
	
	
	
}
