package FreshPractise;

public class TrailPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//looppRactise();
		//multiple();
		//Multipleswithparameters(12, 10);
		//factorial(5);
		//modulos(10);
		square(16);
		
	}
	public static void looppRactise(){
		for ( int i = 10; i>0; i--){
			for (int j=1; j<=i; j++){
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public static void multiple(){
		for(int i = 1; i<=10; i++)
			
		{
			System.out.println("6 x " + i + " = "+i *6);
		}
	}
	public static void Multipleswithparameters(int Table, int limit){
//		for(int i=1; i<=20; i++)
		for(int i=1; i<=limit;i++)
		{
			System.out.println(Table + " X " +i + " = " + i *Table);
		}
		
	}
	public static void factorial(int num){
		int result = 1;
		for(int i =num; i>=1; i--)
		
		{
		result =  i*result;
		}
		System.out.println("Factorial of \""  +num + "\" is " +result); 
	}
	public static void modulos(int num){
		int result = 1;
		for (int i=1; i<=num; i++){
			if (i % 5 != 0)// we can use != or == , we can change the number to get different out put
			{
				System.out.println("The numbers is " +i );
				//square(i);
			}
		}
	}
	public static void square(int num){
			for (int i =1; i<=num; i++){
				int result = i*i;	
				if (i % 5 != 0)
				{
					System.out.println("The Square of the given number " +i +" is "+result);
				}
	}
}
}

