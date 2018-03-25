package Encapsulation;

public class FlipkrtItemData {
		
		private String electronicItem = "Laptop";
		private String FurnitureItem ="Chair;";
		private String FashionItem = "jeans";
		private double electronicprice = 10000.50;
		private int fashionprice = 500;
		private int furnitureprice = 1000;
		
		
		public String getElectronicItem() {
			return electronicItem;
		}
		public void setElectronicItem(String electronicItem) {
			this.electronicItem = electronicItem;
		}
		public String getFurnitureItem() {
			return FurnitureItem;
		}
		public void setFurnitureItem(String furnitureItem) {
			FurnitureItem = furnitureItem;
		}
		public String getFashionItem() {
			return FashionItem;
		}
		public void setFashionItem(String fashionItem) {
			FashionItem = fashionItem;
		}
		public double getElectronicprice() {
			return electronicprice;
		}
		public void setElectronicprice(int electronicprice) {
			this.electronicprice = electronicprice;
		}
		public int getFashionprice() {
			return fashionprice;
		}
		public void setFashionprice(int fashionprice) {
			this.fashionprice = fashionprice;
		}
		public int getFurnitureprice() {
			return furnitureprice;
		}
		public void setFurnitureprice(int furnitureprice) {
			this.furnitureprice = furnitureprice;
		}

	}


