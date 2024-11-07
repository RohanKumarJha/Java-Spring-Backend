public class Tester {
    public static void main(String[] args) {
        RegularCourseCertification certification1 = new RegularCourseCertification("Rakesh", "J2EE", 85, 5);
        certification1.generateRegistrationId();
        System.out.println("Regular Course Registration Details");
        System.out.println("***********************************");
        System.out.println("Student Name : "+certification1.getStudentName());
        System.out.println("Course Name : "+certification1.getCourseName());
        System.out.println("Course Duration : "+certification1.getCourseDuration());
        System.out.println("Registration Id : "+certification1.getRegistrationId());
        System.out.println("Fees : "+certification1.calculateFee());
        System.out.println();

        CrashCourseCertification certification2 = new CrashCourseCertification("Roshan", "Angular", 71);
        certification2.generateRegistrationId();
        System.out.println("Regular Course Registration Details");
        System.out.println("***********************************");
        System.out.println("Student Name : "+certification2.getStudentName());
        System.out.println("Course Name : "+certification2.getCourseName());
        System.out.println("Registration Id : "+certification2.getRegistrationId());
        System.out.println("Fees : "+certification2.calculateFee());
    }
}
