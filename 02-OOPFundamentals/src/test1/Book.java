package test1;

public class Book {
	// instance variables
	long bookId;
	String bookName;
	double bookPrice;
	
	// aceess_specifier return_type method_name(type var_name, ... )
	public void display() {
		System.out.println("Book Id = "+bookId);
		System.out.println("Book Name = "+bookName);
		System.out.println("Book Price = "+bookPrice);
	}
}