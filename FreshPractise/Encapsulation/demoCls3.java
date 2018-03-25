package Encapsulation;

public class demoCls3 {
	
int ID = 1124;
int oID = 879237123;
static double marks = 324.43;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
//		System.out.println("Calling Test3 and Test4 from main method");
//		demoCls3.test3();
//		demoCls3 ref2 = new demoCls3();
//		ref2.test4(); // creating an object of the method test3 and calling test4 using the created object/.
//		System.out.println("Program Ends");
		
		test5();
	}
	static void test1(){
		demoCls3 ref1; //reference variable declaration
		ref1 = new demoCls3(); // creates the object of an class demoCls3
		System.out.println("The Id is "+ref1.ID);
		ref1.ID = 1125;
		System.out.println("The new ID is "+ref1.ID);
	}
	static void test2(){
		System.out.println("Program Starts");
		demoCls3 objRef = new demoCls3();
		objRef.oID = 6783;
		System.out.println("The new Obj ID is "+objRef.oID);
		test1();
	}
	public static void test3(){ //Static method
		System.out.println("Running Test3 method");
		int j = 10;
		System.out.println("J value is "+j);
	}
	public void test4(){ //non static method
		System.out.println("Running non static method");
		int k = 20;
		System.out.println("The value of K is "+k);
		
	}
	public static void test5(){
		System.out.println("Running Static test5 method");
		demoCls3 objRef4 = new demoCls3();
		objRef4.test6(); // calling test 7 method inside test6 method
	}
	public void test6(){
		System.out.println("This is a non static method");
		int k= 10;
		System.out.println("The value of K is "+k);
	}
}
