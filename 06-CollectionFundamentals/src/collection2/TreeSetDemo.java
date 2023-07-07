package collection2;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
		
		boolean flag1 = set.add(100);
		set.add(10);
		set.add(45);
		set.add(84);
		set.add(24);
		set.add(7);
		boolean flag2 = set.add(100);
		//System.out.println("Flag1: "+flag1);
		//System.out.println("Flag2: "+flag2);
		System.out.println(set);
		
	}
}