package collection4;
import java.util.Comparator;

public class StudentIdSorter implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		//ternary operator (? :)
		return (o1.getStudentId() < o2.getStudentId()) ? 1 : -1;
	}
}