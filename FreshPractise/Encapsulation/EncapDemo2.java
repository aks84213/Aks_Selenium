package Encapsulation;

public class EncapDemo2 {

	static double stMarks = 60.50;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		democls2();
		democls3();
	}
	public static void democls2(){
	System.out.println("The Marks defined in the global level is "+stMarks);
	EncapDemo2 obj = new EncapDemo2();
	
	obj.stMarks=65.75;
	System.out.println("The new marks defined inside the method is "+EncapDemo2.stMarks);
}
	public static void democls3(){
		EncapDemo2 obj = new EncapDemo2();
		obj.stMarks = 75.15;
		System.out.println("The Object Score is "+ obj.stMarks);
		
	}
	
}
