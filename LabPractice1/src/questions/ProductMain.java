package questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductMain {

	Scanner sc = new Scanner(System.in);
	Map<Integer, Product> map = new HashMap<>();

	public void addProduct(Product product) {
		if(map.containsKey(product.getProductId())) {
			throw new Error("Product Id "+product.getProductId()+ " Already Exists ");
		}
		else
		{
		map.put(product.getProductId(), product);
		}

	}

	public void viewAllProduct() {
		
		if(map.isEmpty()) {
			throw new Error("Map Is Empty ");
			
		}
		else {
		for (Map.Entry<Integer, Product> entry : map.entrySet()) {
			System.out.println(entry.getValue());
		}
		}
	}

	public void updateProduct(int id) {

		
		if (map.containsKey(id)) {
			System.out.print("Enter New Price :");
			double pri = sc.nextDouble();
			Product product = map.get(id);
			product.setPrice(pri);
			System.out.println("Price Updated Successfully ;) ");
		} else {
			System.out.println("Product Not Found ");
		}

	}

	public void deleteProduct(int id) {

		if (map.containsKey(id)) {
			map.remove(id);
		}
		else
		{
			throw new Error("No Such Item With "+id+"Exists");
		}

	}
	public void claculateTotalInventoryValue() {
		
		double total = 0.0 ;
		for(Map.Entry<Integer, Product>entry : map.entrySet()) {
			Product product = entry.getValue();
			total += product.getPrice()*product.getQnatity();
		}
		System.out.println("TOtal Inventory Value = "+total);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ProductMain pm = new ProductMain();
		boolean test = true;
		while (test) {
			System.out.println(
					"Enter your Choice \n1:Add Product \n2:View Product \n3:Delete Product \n4:Update Product \n5:Total Inventory value \n6:Exit");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.print("Enter Id :");
				int id = sc.nextInt();
				System.out.print("Enter Name :");
				String naam = sc.next();
				System.out.print("Enter Price :");
				double pri = sc.nextDouble();
				System.out.print("Enter Quantity :");
				int quan = sc.nextInt();
				Product p1 = new Product(id, naam, pri, quan);
				p1.toString();
//				p1.displayProductDetails();
				pm.addProduct(p1);
				break;

			case 2:
				pm.viewAllProduct();
				break;

			case 3:
				System.out.print("Enter Id to delete :");
				int iid = sc.nextInt();
				pm.deleteProduct(iid);
				break;

			case 4:
				System.out.print("Enter Id to Update :");
				int pric = sc.nextInt();
				pm.updateProduct(pric);
				break;
			
			case 5 :
				pm.claculateTotalInventoryValue();
				break ;
			case 6:
				System.out.println("Exiting......");
				test = false;
				break ;
			default :
				System.out.println("Invalid Input Re-Enter...");
			}
		}
	}
}
