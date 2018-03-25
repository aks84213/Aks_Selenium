package FreshPractise;

public class JoiningMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FnLn();
	}
public static void FnLn(){
int ID =1125;
String OP = dept("DB");
switch (ID)
{

case 1124:
	System.out.println("EmployeeID "+ID+" ; EmployeeName = Mohan S");
	break;
case 1125:
	System.out.println("EmployeeID "+ID+" ; EmployeeName = PremSagar");
	break;
}
}
public static String dept(String Dept){
	if (Dept == "QA"){
		System.out.println("The employee belongs to QA dept");
	}
	if( Dept == "DB"){
			System.out.println("The Employee belongs to DB team");
		}
	
	return Dept;
	}
}
