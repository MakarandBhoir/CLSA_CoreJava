package test1;

public class BookDemo {
	public static void main(String[] args) {
		Book b1 = new Book(); // instance of class
		Book b2 = new Book();
		
		b1.bookId = 1;
		b1.bookName = "C Programming";
		b1.bookPrice = 250;
		
		b2.bookId = 2;
		b2.bookName = "Java Programming";
		b2.bookPrice = 650.50;
		
		b1.display();
		b2.display();
	}
}
