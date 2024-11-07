package PracticeArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
	Scanner sc = new Scanner(System.in);
	
	List<Book> list = new ArrayList<>();
	
	public void addBook() {
		System.out.println();
		Book b = new Book("abc", "xyz", "lmo", 200, true);
		list.add(b);
	}
	public void viewBook() {
		for(Book b : list) {
			System.out.println(b);
		}
	}
	public void searchBook() {
		System.out.print("Enter the Book Title :");
		String tit =sc.next();
		for(Book b : list) {
			if(b.title.equals(tit)) {
				System.out.println(b);
			}
		}
	}
	public void borrowBook() {
		System.out.print("Enter the Book Title :");
		String tit =sc.next();
		for(Book b : list) {
			if(b.title.equals(tit)&& b.isAvailable == true) {
				System.out.println(b);
				b.isAvailable = false ;
				System.out.println("Book Borrowed");
				
			}
		}
	}
	public void returnBook() {
		System.out.print("Enter the Book Title :");
		String tit =sc.next();
		for(Book b : list) {
			if(b.title.equals(tit)&& b.isAvailable == false) {
				
				b.isAvailable = true ;
				System.out.println(b);
				System.out.println("Book Returned");
				
			}
		}
	}
	public void isBookAvailable() {
		System.out.print("Enter the Book Title :");
		String tit =sc.next();
		for(Book b : list) {
			if(b.title.equals(tit)&& b.isAvailable == true) {
				
				
				System.out.println(b);
				System.out.println("Book Available");
				
			}
		}
	}
	public static void main(String[] args) {
		Library lib = new Library();
		Book b1 = new Book("dfg", "ert", "yui", 300, false);
		lib.list.add(b1);
		

		
		boolean check = true ;
		while(check) {
			
			System.out.println("1:View\n2:Add\n3:Search\n4:Borrow\n5:Return\n6:Available\n6:Exit");
			System.out.println("Enter Your Choice");
			int choice = lib.sc.nextInt();
			switch(choice) {
			case 1: lib.viewBook();
				break ;
			case 2: lib.addBook();
				break ;
			case 3: lib.searchBook();
				break ;
			case 4: lib.borrowBook();
				break ;
			case 5: lib.returnBook();
				break ;
			case 6 : lib.isBookAvailable();
				break ;
			case 7 : System.out.println("Exiting....");
				check = false ;
				break ;
			
			}
		}
	}
}
