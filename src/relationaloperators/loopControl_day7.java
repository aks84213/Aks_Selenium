package relationaloperators;

public class loopControl_day7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String [] tvList = {"Samsung lcd 40 inch", "Samsung lcd 49 inch 4k tv", 
					"samsung 42 inch samrt tv", "Samsung 42 inch led tv", "Samsung 59 inch curve TV"}; // application seach result
			
			int tvListCount  = tvList.length; //takes the count of tv-- its an array function
			for (int i =0; i<tvListCount; i++) {
				String tvName = "Samsung 59 inch curve TV";
				if (tvName.equals(tvList[i])){
					System.out.println("Pass - Tv purchased with name "+tvName+"");
					break ;
				}
					else {
						System.out.println("Fail - tv Name with "+tvName +"is not found");
						
					}
				
				}
		//	forloop();
			dowhileloopex();
		//	dowhileloop();
			
			
			}
	public static void forloop(){
		for (int a =20; a<40; a++){
			System.out.println("The number is : " +a);
		}
		for (int a = 100; a>=80; a--){
			System.out.println("The number is = "+a);
		}
		
	}
	
	public static void dowhileloopex(){
		
		int offerTime = 10;
		int dealStartTime = 0;
		int purchaseTimes =1;
		do {
			if(offerTime>0){
			System.out.println("Pass - Purchase redmi Phone for =" +purchaseTimes);
			purchaseTimes++;
			dealStartTime++;
			offerTime--;
			
		}else{
			System.out.println("Deal ended, cannot purchase");
		}
	}while (purchaseTimes<=0);

	}

	
public static void dowhileloop(){
	int x = 10;
	do {
		System.out.println("The Number is  "+x);
		x++;
	}while (x<=20);
	}
}