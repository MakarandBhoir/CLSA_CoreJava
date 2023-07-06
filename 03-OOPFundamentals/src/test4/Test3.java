package test4;

import static java.lang.Math.*;

public class Test3 {
	public static void main(String[] args) {
		Account ref = null;
		Saving s = new Saving(123456, "Atharva", 500000, 4.5);
		Current c = new Current(2345679, "CLSA Ltd", 50000000, 200000);
		
		if(random() > 0.5) {
			ref = s;
		}else {
			ref = c;
		}
		
		if(ref instanceof Saving)
			System.out.println("Saving object is created.");
		
		if(ref instanceof Current)
			System.out.println("Current object is created.");
		
		if(ref instanceof Account)
			System.out.println("----------------------------------------------");
		
		ref.deposite(1000);
	}
}
