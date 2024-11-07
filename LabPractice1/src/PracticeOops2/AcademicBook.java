package PracticeOops2;

public class AcademicBook extends Book implements Fine{
	String subject ;
	public AcademicBook(String subject ,int bookId, String title, String author, boolean isAvailable) {
		super(bookId, title, author, isAvailable);
		this.subject =subject ;
	}
	public void displayBookDetails() {
		System.out.println(getBookId() +" "+getTitle()+" "+getAuthor()+" "+isAvailable()+" "+subject);
	}
	@Override
	public int calculateFine(int daysLate) {
		
		int fine = daysLate * 5 ;
		return fine ;
		
	}
}
class FictionBook extends Book implements Fine {
	String genre ;
	public FictionBook(String genre ,int bookId, String title, String author, boolean isAvailable) {
		super(bookId, title, author, isAvailable);
		this.genre = genre ;
	}
	
	public void displayBookDetails() {
		System.out.println(getBookId() +" "+getTitle()+" "+getAuthor()+" "+isAvailable()+" "+genre);
	}

	@Override
	public int calculateFine(int daysLate) {
		int fine = daysLate * 3 ;
		return fine ;
		
	}
}
class NonFictionBook extends Book implements Fine {
	String topic ;
	public NonFictionBook(String topic ,int bookId, String title, String author, boolean isAvailable) {
		super(bookId, title, author, isAvailable);
		this.topic =topic ;
	}
	public void displayBookDetails() {
		System.out.println(getBookId() +" "+getTitle()+" "+getAuthor()+" "+isAvailable()+" "+topic);
	}
	@Override
	public int calculateFine(int daysLate) {
		int fine = daysLate * 4 ;
		return fine ;
		
	}
	
}

