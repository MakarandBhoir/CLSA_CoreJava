package collection01;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		//ArrayList<String> list = new ArrayList<String>();
		ArrayList<Object> list = new ArrayList<Object>();
		//ArrayList list = new ArrayList(); // default capacity is 10
		String str1 = new String("First");
		String str2 = "Second";
		Integer iObj = new Integer(100);
		Double dObj = new Double(10.50);
		int x = 10;
		
		list.add(str1);
		list.add(str2);
		list.add(iObj);
		list.add(dObj);
		list.add(x);

		list.add(str1);
		list.add(str2);
		list.add(iObj);
		list.add(dObj);
		list.add(x);
		
		list.add(x);
		
		System.out.println(list);
		
	}
}
