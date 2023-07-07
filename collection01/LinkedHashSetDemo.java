package collection01;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<Object> set = new LinkedHashSet<Object>();
		
		int x = 1000; // primitive type
		Integer obj = 100; // reference type
		
		set.add(100);
		set.add(x);
		set.add(obj);
		set.add("Hello");
		set.add("Hello");
		
		System.out.println(set);
		
	}
}
