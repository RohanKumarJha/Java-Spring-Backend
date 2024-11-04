package package2;

import package1.Student;

public class StudentDetails {
    float percentage = 0;
    public void calculatePercentage(Student student) {
        percentage = ((student.getTotalMarksObtained()*100)/student.totalMarks);
    }

    public void displayStudentDetails(Student s) {
        System.out.println("Student Details:");
        System.out.println("Student ID: "+s.getStudentId());
        System.out.println("Student Name: "+s.studentName);
        System.out.println("Student Marks: "+s.getTotalMarksObtained());
        System.out.println("Total Marks: "+s.totalMarks);
        System.out.println("Student Percentage: "+percentage+"%");
    }
}


// Student Details:
// Student ID: 101
// Student Name: Alan
// Student Marks: 400.0
// Total Marks: 500.0
// Student Percentage: 80.0%