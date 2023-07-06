package test2;

public class Test {
	
	public static void checkAge(int age) throws InvalidAgeException {
		if(age>=18 && age<=60) {
			System.out.println("Valid Age.");
		}
		else {
			throw new InvalidAgeException();
		}
	}
	
	public static void main(String[] args) {
		int age = 20;
		try {
			checkAge(age);
		}
		catch(Exception e) {
			System.out.println("Exception");
		}
	}
}
