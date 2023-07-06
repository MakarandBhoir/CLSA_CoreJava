package test4;

public class Test2 {
	public static void main(String[] args) {
		Account ref = null;
		Saving s = new Saving(123456, "Atharva", 500000, 4.5);
		Current c = new Current(2345679, "CLSA Ltd", 50000000, 200000);
		
		if(Math.random() > 0.5) {
			ref = s;
		}else {
			ref = c;
		}
		
		ref.deposite(1000);
	}
}
