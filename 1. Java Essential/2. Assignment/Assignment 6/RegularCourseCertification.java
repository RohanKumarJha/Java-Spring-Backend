public class RegularCourseCertification extends RRTechnicalCertification {
    private int courseDuration;

    public RegularCourseCertification(String studentName,String courseName,int admissionTestMarks,int courseDuration) {
        super(studentName, courseName, admissionTestMarks);
        this.courseDuration = courseDuration;
    }

    public int getCourseDuration() {
        return courseDuration;
    }
    public void setCourseDuration(int courseDuration) {
        this.courseDuration = courseDuration;
    }

    @Override
    public void generateRegistrationId() {
        setRegistrationId(1000+counter);
    }

    @Override
    public double calculateFee() {
        if(getAdmissionTestMarks()>=90) {
            return (REGULAR_COURSE_FEE*courseDuration - (REGULAR_COURSE_FEE*courseDuration)*0.1);
        } else if(getAdmissionTestMarks()>=75 && getAdmissionTestMarks()<90) {
            return (REGULAR_COURSE_FEE*courseDuration - (REGULAR_COURSE_FEE*courseDuration)*0.05);
        }
        return (REGULAR_COURSE_FEE*courseDuration + REGULAR_COURSE_FEE*courseDuration*0.1236);
    }
}
