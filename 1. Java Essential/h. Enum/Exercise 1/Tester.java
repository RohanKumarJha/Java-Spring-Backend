public class Tester {
    public static void main(String[] args) {
        Student stud1 = new Student();
        stud1.setStudentId(101);
        stud1.setName("Rohan");
        stud1.setTotalMarks(208);
        stud1.calculateGrade();
        stud1.calculateScolarshipAmount();

        System.out.println("Student Id: "+stud1.getStudentId());
        System.out.println("Student Name: "+stud1.getName());
        System.out.println("Total Marks: "+stud1.getTotalMarks());
        System.out.println("Grade: "+stud1.getGrade());
        if(stud1.getScholarshipAmount()==0) {
            System.out.println("Not applicable to take scholarship");
        } else {
            System.out.println("Scholarship: "+stud1.getScholarshipAmount());
        }
    }
}
