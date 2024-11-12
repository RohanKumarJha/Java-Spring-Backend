public class Applicant extends Validator {
    private String applicantName;
    private String postApplied;
    private int applicantAge;

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }
    public String getApplicantName() {
        return applicantName;
    }

    public void setPostApplied(String postApplied) {
        this.postApplied = postApplied;
    }
    public String getPostApplied() {
        return postApplied;
    }

    public void setApplicantAge(int applicantAge) {
        this.applicantAge = applicantAge;
    }
    public int getApplicantAge() {
        return applicantAge;
    }
}