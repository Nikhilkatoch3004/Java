package oopsPractice;

public class Electronics extends Product implements Discountable {

	String warrantyperiod;

	public Electronics(String warrantyperiod, int productId, String productName, double price, int quantity) {
		super(productId, productName, price, quantity);
		this.warrantyperiod = warrantyperiod;
	}

	public void displayProductDetails() {
		System.out.println(getProductId() + getProductName() + getPrice() + getQuantity() + warrantyperiod);
	}

	@Override
	public double calculateDiscount() {
		double pri = getPrice() * 0.10 ;
		return pri;
	}

}

class Groceries extends Product implements Discountable  {
	String expiryDate ;
	public Groceries(String expiryDate , int productId, String productName, double price, int quantity) {
		super(productId, productName, price, quantity);
		this.expiryDate = expiryDate ;
	}
	public void displayProductDetails() {
		System.out.println(getProductId() + getProductName() + getPrice() + getQuantity() +expiryDate );
	}
	@Override
	public double calculateDiscount() {
		double pri = getPrice() * 0.05 ;
		return pri;
	}

}
class Furniture extends Product implements Discountable{
	String material ;
	public Furniture(String material,int productId, String productName, double price, int quantity) {
		super(productId, productName, price, quantity);
		this.material =material ;
	}
	public void displayProductDetails() {
		System.out.println(getProductId() + getProductName() + getPrice() + getQuantity() +material);
	}
	@Override
	public double calculateDiscount() {
		double pri =getPrice() * 0.15 ;
		return pri;
	}
}
