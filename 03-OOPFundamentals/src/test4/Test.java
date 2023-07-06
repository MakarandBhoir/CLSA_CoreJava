package test4;

public class Test {
	public static void main(String[] args) {
		Saving s = new Saving(123456, "Atharva", 500000, 4.5);
		Current c = new Current(2345679, "CLSA Ltd", 50000000, 200000);
		
		Account acc = s;
		acc.deposite(1000);
		acc.display();
	}
}
