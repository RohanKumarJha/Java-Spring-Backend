public class Tester {
    public static void main(String[] args) {
        CourseRegistration reg1 = new CourseRegistration();
        reg1.setStudentName("Peter");
        reg1.setRegistrationId(5001);
        reg1.setQualifyingMarks(58);
        reg1.setCourseId(1005);
        reg1.isHostelRequired();
        reg1.calculateCourseFee();
        System.out.println();

        CourseRegistration reg2 = new CourseRegistration();
        reg2.setStudentName("Peter");
        reg2.setRegistrationId(5001);
        reg2.setQualifyingMarks(68);
        reg2.setCourseId(1006);
        reg2.isHostelRequired();
        reg2.calculateCourseFee();
        System.out.println();

        CourseRegistration reg3 = new CourseRegistration();
        reg3.setStudentName("Peter");
        reg3.setRegistrationId(5001);
        reg3.setQualifyingMarks(78);
        reg3.setCourseId(1005);
        reg3.isHostelRequired();
        reg3.calculateCourseFee();
    }
}
