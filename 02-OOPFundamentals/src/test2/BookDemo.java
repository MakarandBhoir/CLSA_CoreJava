package test2;

public class BookDemo {
	public static void main(String[] args) {
		Book b1 = new Book(1, "C Programming", 250); // instance of class
		Book b2 = new Book(2, "Java", 650.50);
		
		b1.display();
		b2.display();
		
		b1 = b2;
		
		
		b1.display();
		b2.display();
		
		System.gc();
	}
}
