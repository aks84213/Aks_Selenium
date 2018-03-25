package FreshPractise;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		square(5);
	//	modulos(10);
	}
public static void square(int sqr){
	int i = sqr;
		int result = i*i;
		System.out.println("The square of the number " +i+" is "+result);
		add();
	}
	
	
public static void modulos(int mod){
	int result ;
	
	for(int i=1; i<=mod; i++ ){
		if (i % 2 != 0){
			result =i;
			System.out.print(" the result is " +result);
		}
		square(i);
	}
}
public static void add(){
	int a=5;
	int b=5;
	int C=a-b;
	System.out.println("the outPut is "+C);
		
}
}
