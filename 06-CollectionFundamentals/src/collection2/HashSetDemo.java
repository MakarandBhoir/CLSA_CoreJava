package collection2;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<Student> set = new HashSet<>();
		
		Student student1 = new Student(1, "Bhavesh", 92);
		Student student2 = new Student(2, "Eshan", 89);
		Student student3 = new Student(2, "Eshan", 89);
		
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		System.out.println(student3.hashCode());
		
		
		set.add(student1);
		set.add(student2);
		set.add(student3);
		
		Iterator<Student> itr = set.iterator();
		while(itr.hasNext()) {
			Student s = itr.next();
			System.out.println(s);
		}
	}
}
