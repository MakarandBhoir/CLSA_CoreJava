package test2;

public class Book extends Object{
	// instance variables
	private long bookId;
	private String bookName;
	private double bookPrice;
	
	public Book(long bookId, String bookName, double bookPrice) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
	
	// aceess_specifier return_type method_name(type var_name, ... )
	public void display() {
		System.out.println("Book Id = "+bookId);
		System.out.println("Book Name = "+bookName);
		System.out.println("Book Price = "+bookPrice);
	}
	
	public void finalize() {
		System.out.println("Object is about to delete...");
	}
}