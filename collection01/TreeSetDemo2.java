package collection02;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo2 {
	public static void main(String[] args) {
		Set<Double> set = new TreeSet<>();
		
		set.add(100.5);
		//set.add(10);
		set.add(45.5);
		set.add(84.6);
		set.add(24.0);
		set.add(7.7);
		set.add(100.2);

		System.out.println(set);
		
	}
}
