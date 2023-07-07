package collection01;

import java.util.ArrayList;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("LTI");
		list.add("Capgemini");
		list.add("JPMorgen");
		list.add("ITC");
		list.add(0, "TCS");
		list.add("Atos");
		list.add("HSBC");
		list.remove(4);
		
		//System.out.println(list);
		for(String str : list) {
			System.out.println("Name: "+str);
			System.out.println("Length: "+str.length());
		}
		
	}
}
