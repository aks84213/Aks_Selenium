package relationaloperators;

import mywork.EnumUserStatus;

public class Switchop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String userStatus = "ACTIVE"; //ACTIVE,INACTIVE,DELETED,ENROLLED,RESIGNED,RELEAVED 
		EnumUserStatus userStatus = EnumUserStatus.RELEAVED; //ACTIVE,INACTIVE,DELETED,ENROLLED,RESIGNED,RELEAVED 
		int userId = 1;
		switchEg(userStatus, userId);
	}
	
	public static void switchEg(EnumUserStatus empStatus, int empId)
	{
		switch(empStatus){
			case ACTIVE:
				System.out.println("User status is Active for empId = " + empId);
				break;
			case INACTIVE:
				System.out.println("User status is InActive for empId = " + empId);
				break;
			case DELETED:
				System.out.println("User status is Deleted for empId = " + empId);
				break;
			default :
				System.out.println("Undefined status for empId = " + empId);
		}
	}
	
//	public static void switchEg(String empStatus, int empId)
//	{
//		switch(empStatus){
//			case "ACTIVE":
//				System.out.println("User status is Active for empId = " + empId);
//				break;
//			case "INACTIVE":
//				System.out.println("User status is InActive for empId = " + empId);
//				break;
//			case "DELETED":
//				System.out.println("User status is Deleted for empId = " + empId);
//				break;
//			default :
//				System.out.println("Unknown status for empId = " + empId);
//		}
//	}

}
