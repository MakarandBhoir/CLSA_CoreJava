package collection4;
import java.util.Comparator;

public class StudentScoreSorter implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return (o1.getStudentScore() > o2.getStudentScore()) ? 1 : -1;
	}

}