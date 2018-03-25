package FreshPractise;

public class Methods {

	static void test1(){
		System.out.println("running test1() method");
		return;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program starts from Main method");
		//test1();
		//squareroot(4);
		//squareroot(5);
		//squareroot(6);
		//squareroot(7);
		squareroot(8);
		System.out.println("Program Ends");
	}	
	public static void squareroot(int num){
		System.out.println("Calculating square root of a number "+num);
		int result;
		result = num * num;
			System.out.println("The sqare root of a number "+num + " is "+result);
		
	}
	
}
