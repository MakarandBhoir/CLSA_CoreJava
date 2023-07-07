package collection4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		
		Student student1 = new Student(101, "Sachin", 90);
		Student student2 = new Student(102, "Virat", 92);
		Student student3 = new Student(103, "Mahendra", 80);
		Student student4 = new Student(104, "Yuvraj", 85);
		
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		
		displayList(list);
		
		//Collections.sort(list); //it expecte us to implement Comparator interface in Student class 
		Collections.sort(list, new StudentIdSorter());
		displayList(list);
		
		Collections.sort(list, new StudentScoreSorter());
		displayList(list);
	}

	private static void displayList(List<Student> studentList) {
		Iterator<Student> itr = studentList.iterator();
		while( itr.hasNext() ) {
			Student stu = itr.next();
			System.out.println(stu);
		}
		System.out.println("-----------------------------------------------------");
	}
}