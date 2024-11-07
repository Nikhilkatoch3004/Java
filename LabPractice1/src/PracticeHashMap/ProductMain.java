package PracticeHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductMain {
	Scanner sc = new Scanner(System.in);
	HashMap<Integer, Product> map = new HashMap<>();

	public void addProduct() {
		System.out.print("Enter Id :");
		int id = sc.nextInt();
		System.out.print("Enter Name :");
		String naam = sc.next();
		System.out.print("Enter Price :");
		double pri = sc.nextDouble();
		System.out.print("Enter Quantity :");
		int quant = sc.nextInt();

		Product b = new Product(id, naam, pri, quant);
		map.put(b.getProductId(), b);
	}

	public void viewAllProduct() {
		for (Map.Entry<Integer, Product> ent : map.entrySet()) {
			if (ent.getKey() == null) {
				throw new Error(" Enpty Set ");
			} else {
				ent.getValue().displayProductDetails();
			}
		}
	}

	public void updateProduct(int id) {
		if (map.containsKey(id)) {

			System.out.print("Enter New Price :");
			double pri = sc.nextDouble();
			Product product = map.get(id);
			product.setPrice(pri);
		} else {
			throw new Error("Id " + id + "Doesn't Exists ");
		}
	}

	public void deleteProduct(int id) {
		if (map.containsKey(id)) {
			map.remove(id);
		} else {
			throw new Error("Id " + id + "Doesn't Exists ");
		}
	}

	public void calculatetotalInventory() {
		double total = 0.0;
		for (Map.Entry<Integer, Product> ent : map.entrySet()) {
			total += ent.getValue().getPrice() * ent.getValue().getQuantity();
		}
		System.out.println("Total Inventory value = " + total);
	}

	public static void main(String[] args) {
		ProductMain pm = new ProductMain();

		boolean check = true;
		while (check) {
			System.out.println("1:Add\n2:View\n3:Update\n4:Delete\n5:Total Inventory");
			int choice = pm.sc.nextInt();
			switch (choice) {
			case 1:
				pm.addProduct();
				break;
			case 2:
				pm.viewAllProduct();
				break;
			case 3:
				System.out.println("Enter Id to Update");
				int id = pm.sc.nextInt();
				pm.updateProduct(id);
				break;
			case 4:
				System.out.println("Enter Id to Delete");
				int idd = pm.sc.nextInt();
				pm.deleteProduct(idd);
				break;
			case 5:
				pm.calculatetotalInventory();
				break;
			case 6:
				check = false;
				System.out.println("Exiting.....");
				break;
			}
		}
	}
}
