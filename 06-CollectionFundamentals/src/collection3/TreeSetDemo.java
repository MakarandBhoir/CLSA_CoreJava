package collection3;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Set<Student> set = new TreeSet<Student>();
		
		Student student1 = new Student(101, "Test1", 60); // 2121
		Student student2 = new Student(102, "Test2", 55); // 2142
		
		set.add(student1);
		set.add(student2);
		
		for(Student s : set) {
			System.out.println(s);
		}
	}
}