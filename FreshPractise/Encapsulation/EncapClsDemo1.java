package Encapsulation;

public class EncapClsDemo1 {
	static int Id = 1124;
	int Age = 34;
	static double stMarks = 56.65;
	static void test(){
		System.out.println("running test1()method..");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("id is: "+EncapClsDemo1.Id);
EncapClsDemo1.test();
EncapClsDemo1 obj = new EncapClsDemo1();
obj.Age=35;
System.out.println("The Age is "+obj.Age);
marks();
	}
public static void marks(){
	System.out.println("the marks is "+EncapClsDemo1.stMarks);
	EncapClsDemo1.stMarks=54.55;
	System.out.println("The New Marks scored by the user is "+stMarks);
}
}
