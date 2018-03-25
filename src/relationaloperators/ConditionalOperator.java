package relationaloperators;

public class ConditionalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b;
		
		a = 10; b = 10;
		
//		if(a > b){
//			System.out.println("a is greater than b");
//		}
//		else if(a < b){
//			System.out.println("a is lesser than b");
//		}
//		else if(a == b){
//			System.out.println("a is equals to b");
//		}
//		else{
//			System.out.println("Invalid values");
//		}
		
		
		String empName = "Mohan";
		String empCompany = "Excelsoft";
		int empSalary = 5000;
		int empAge = 30;
		
		
		//if(empName == "Mohan" && empCompany == "Excelsoft" && empSalary == 5000 && empAge == 30)
		//if(empName == "Mohan1" || empCompany == "Excelsoft" || empSalary == 5000 || empAge == 30)
		if((empName == "Mohan Rao" && empCompany == "Excelsoft") || (empSalary == 5000 && empAge < 30))
		{
			System.out.println("Authorized...");
		}else{
			System.out.println("UnAuthorized...");
		}
		
//		// Nested If
//		if(empName == "Mohan")
//		{
//			if(empCompany == "Excelsoft")
//			{
//				if(empSalary > 15000)
//				{
//					if(empAge >= 30)
//					{
//						System.out.println("Authorized...");
//					}
//					else{
//						System.out.println("Invalid Age");
//					}
//				}
//				else{
//					System.out.println("Invalid Salary");
//				}
//			}
//			else{
//				System.out.println("Invalid Company");
//			}
//				
//		}
//		else{
//			System.out.println("Invalid Name");
//		}
	}

}
