package PracticeArrayList;

public class Book {
	String title ;
	String author ;
	String ISBN ;
	int numberofPages ;
	boolean isAvailable ;
	
	public Book(String title, String author, String iSBN, int numberofPages, boolean isAvailable) {
		
		this.title = title;
		this.author = author;
		ISBN = iSBN;
		this.numberofPages = numberofPages;
		this.isAvailable = isAvailable;
	}
	public String toString() {
		return title+" "+author+" "+ISBN+" "+numberofPages+" "+isAvailable;
		
	}
}
