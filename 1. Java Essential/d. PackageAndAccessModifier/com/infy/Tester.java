import package1.Student;
import package2.StudentDetails;

public class Tester {
	public static void main(String[] args) {
		Student s1=new Student(101,"Alan",400.0f,500.0f);
		StudentDetails d=new StudentDetails();
		d.calculatePercentage(s1);
		d.displayStudentDetails(s1);
	}
}
