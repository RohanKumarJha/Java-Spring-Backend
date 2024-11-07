public class CrashCourseCertification extends RRTechnicalCertification {

    public CrashCourseCertification(String studentName,String courseName,int admissionTestMarks) {
        super(studentName, courseName, admissionTestMarks);
    }

    @Override
    public void generateRegistrationId() {
        setRegistrationId(1000+counter);
    }

    @Override
    public double calculateFee() {
        if(getAdmissionTestMarks()>=90) {
            return (Certification.CRASH_COURSE_FEE - Certification.CRASH_COURSE_FEE*0.1);
        } else if(getAdmissionTestMarks()>=75 && getAdmissionTestMarks()<90) {
            return (Certification.CRASH_COURSE_FEE - Certification.CRASH_COURSE_FEE*0.05);
        }
        return (Certification.CRASH_COURSE_FEE + Certification.CRASH_COURSE_FEE*0.1236);
    }
}
