package test3;

public class Book {
	// instance variable
	private long isbn;
	private String title;
	private String author;
	private double price;
	
	// class variable
	private static double discount;
	
	public static void setDiscount(double discount) {
		Book.discount = discount;
	}
	static {
		Book.discount = 10.0;
	}
	public Book(long isbn, String title, String author, double price) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	private double calculateDiscount() {
		double ap = price - (discount/100)*price;
		return ap;
	}
	
	public void display() {
		System.out.println("Book Isbn = "+isbn);
		System.out.println("Book Title = "+title);
		System.out.println("Book Author = "+author);
		System.out.println("Book Price = "+price);
		System.out.println("Book Price after discount = " + this.calculateDiscount() );
		
	}
	public long getIsbn() {
		return isbn;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
}
