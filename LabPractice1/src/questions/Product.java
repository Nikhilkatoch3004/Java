package questions;

public class Product {
	private int productId;
	private String productName;
	private double price;
	private int quantity;

	public Product(int productId, String productName, double price, int quantity) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}

	int getProductId() {
		return productId;
	}

	String getProductName() {
		return productName;

	}

	double getPrice() {
		return price;

	}

	int getQnatity() {
		return quantity;
	}

	void displayProductDetails() {
		System.out.println(productId);
		System.out.println(productName);
		System.out.println(price);
		System.out.println(quantity);
	}

	public String toString() {
		return "Product Id: " + productId + ", Product Name: " + productName + ", Price: " + price + ", Quantity: "
				+ quantity;
	}

	public void setPrice(double pri) {
		
		this.price =pri ;
	}

}
