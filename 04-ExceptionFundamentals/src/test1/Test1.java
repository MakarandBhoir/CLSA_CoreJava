package test1;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("Start of Program...");
		
		double result = 0;
		try {
			int n1 = Integer.parseInt( args[0] );
			int n2 = Integer.parseInt( args[1] );
			result = n1 / n2;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Please pass 2 argument to program.");
		}
		catch(ArithmeticException e) {
			System.out.println("Please pass correct arguments.");
		}
		System.out.println("Result = "+result);
		
		System.out.println("End of Program...");
	}
}
