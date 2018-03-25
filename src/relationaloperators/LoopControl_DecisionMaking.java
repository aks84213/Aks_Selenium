package relationaloperators;

public class LoopControl_DecisionMaking {
	
	static int dealStartTime = 5; // tme at which deal starts
	static int CurrentTime = 1; // current system time
	String item = "OnePlusOne";
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			
		whileLoop();
	}
	
	public static void whileLoop() throws InterruptedException{
		
		while (!(CurrentTime == dealStartTime)){
			System.out.println("**************************************");
			System.out.println("Current time is not equal to deal start time");
			Thread.sleep(5000);
			CurrentTime++;
			System.out.println("Now The current time is: "+ CurrentTime+ "hours");
			System.out.println("**************************************");
		}
		System.out.println("OneplusOne phone is purchased at the "+CurrentTime+ "hours which"
				+ "is equal to "+dealStartTime);
	}

}
