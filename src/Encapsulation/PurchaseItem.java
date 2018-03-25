package Encapsulation;

public class PurchaseItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		buyItem();
	}
	
	public static void buyItem(){
		
		FlipkrtItemData flipkartdata = new FlipkrtItemData ();
		System.out.println("Electronic"+flipkartdata.getElectronicItem()+" is purchased");
		System.out.println("Price "+ flipkartdata.getElectronicprice()+ " Paid");
		
       flipkartdata.setElectronicItem("Fridge");
       System.out.println("New Electronic Item"+flipkartdata.getElectronicItem() + " is purchased");
	}
		

}
