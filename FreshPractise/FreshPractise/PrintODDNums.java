package FreshPractise;

public class PrintODDNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//generateOdds(5);
		generateEvenNo(15);
		//sqrNo(10);
	}

	public static void generateOdds(int num){
		int i =1;
		while (i <= num){
			if (i % 2 != 0){
				int res = sqr(i);
				System.out.println("The odd number is "+i+ " and the square is "+res);
				
		}
			i++;
		}
	}
	public static int sqr(int sqNo){
		int result = sqNo*sqNo;
		//System.out.println("The square of "+sqNo  +" is " +result);
		return (result);
	}
	public static void generateEvenNo(int num){
		int i = 1;
		while (i<=num){
			if(i % 2 == 0){
				int result = sqrNo(i);
				System.out.println("The numbers are "+i+" and the Square is "+result);
			}
			i++;
		}
	}
	public static int sqrNo(int sq){
		int result = sq*sq;
	//	System.out.println("The output is "+result);
		return (result);
	}
}
