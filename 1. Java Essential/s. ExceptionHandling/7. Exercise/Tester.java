public class Tester {
    public static void main(String[] args) {
        Applicant obj1 = new Applicant();
        obj1.setApplicantName("Jason");
        obj1.setPostApplied("Assistant");
        obj1.setApplicantAge(37);
        obj1.isValidApplicantName(obj1.getApplicantName());
        obj1.isValidPost(obj1.getPostApplied());
        obj1.isValidAge(obj1.getApplicantAge());
        obj1.validate(obj1);
    }
}
