package PracticeOops2;

import java.util.ArrayList;
import java.util.List;

public class ManagementMain {
	
	public static void main(String[] args) {
		
		List<AcademicBook> ab = new ArrayList<>();
		ab.add(new AcademicBook("qwe", 10, "rty", "uio", false));
		ab.add(new AcademicBook("abc", 10, "rty", "uio", false));
		ab.add(new AcademicBook("xyz", 10, "rty", "uio", false));
		
		for(AcademicBook book : ab) {
			book.displayBookDetails();
			System.out.println("Fine On Academic Book : "+book.calculateFine(10));
			
		}
		
		System.out.println("--------------------------------------------------");
		
		List<FictionBook> fb = new ArrayList<>();
		fb.add(new FictionBook("abc", 20, "xyz", "lmn", true));
		fb.add(new FictionBook("abc", 20, "xyz", "lmn", true));
		fb.add(new FictionBook("abc", 20, "xyz", "lmn", true));
		
		for(FictionBook book1 : fb) {
			book1.displayBookDetails();
			System.out.println("Fine On Academic Book : "+book1.calculateFine(10));
		}
		
		System.out.println("--------------------------------------------------");
		
		List<NonFictionBook> nfb = new ArrayList<>();
		nfb.add(new NonFictionBook("rst", 34, "uxw", "ilu", false));
		nfb.add(new NonFictionBook("vcx", 74, "uxw", "ilu", false));
		nfb.add(new NonFictionBook("xmr", 44, "uxw", "ilu", false));
		
		for(NonFictionBook book2 : nfb) {
			book2.displayBookDetails();
			System.out.println("Fine On Academic Book : "+book2.calculateFine(10));
		}
		
		System.out.println("--------------------------------------------------");
		
		List<List> boo = new ArrayList<>();
		boo.add(nfb);
		boo.add(ab);
		boo.add(fb);
		for(List l : boo) {
		System.out.println();
		}
	}
}
