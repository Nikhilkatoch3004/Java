package oopsPractice;

import java.util.ArrayList;
import java.util.List;

public class ProductManagementSystem {
	
	

	public static void main(String[] args) {
		
		List<Double> li = new ArrayList<>();
		
		Electronics ele = new Electronics("5", 101, "abc", 200, 10) ;
		ele.displayProductDetails();
		System.out.println(ele.calculateDiscount());
		double var1 =(ele.getPrice() -ele.calculateDiscount())*ele.getQuantity();
		li.add(var1);
		
		Groceries go = new Groceries("30", 34, "asd", 200, 60);
		go.displayProductDetails();
		System.out.println(go.calculateDiscount());
		double var2 =(go.getPrice()- go.calculateDiscount()) * go.getQuantity();
		li.add(var2);
		
		Furniture fur = new Furniture("qwe", 40, "rty", 460, 58);
		fur.displayProductDetails();
		System.out.println(fur.calculateDiscount());
		System.out.println();
		double var3 =(fur.getPrice()- fur.calculateDiscount()) * fur.getQuantity();
		li.add(var3);
		double total =0.0 ;
		for(double d : li) {
			total += d ;
		}
		System.out.println("Total Inventory Value = "+total);

	}

}
