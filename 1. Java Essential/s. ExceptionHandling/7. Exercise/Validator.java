
public class Validator {
    public void validate(Applicant applicant) {
        try {
            if(!applicant.isValidApplicantName(applicant.getApplicantName())) {
                throw new InvalidNameException();
            }
            if(!applicant.isValidPost(applicant.getPostApplied())) {
                throw new InvalidPostException();
            }
            if(!applicant.isValidAge(applicant.getApplicantAge())) {
                throw new InvalidAgeException();
            }
            System.out.println("All the values are valid");
        } catch(InvalidNameException ine) {
            System.out.println("Invalid applicant name");
        } catch(InvalidPostException ipe) {
            System.out.println("Invalid post");
        } catch(InvalidAgeException iae) {
            System.out.println("Invalid age exception");
        } catch(Exception e) {
            System.out.println("Default Exception");
        }
    }

    public boolean isValidApplicantName(String name) {
        if(name!=null) return true;
        return false;
    }

    public boolean isValidPost(String post) {
        if(post=="Probationary Officer" || post=="Assistant" || post=="Special Cadre Officer") return true;
        return false;
    }

    public boolean isValidAge(int age) {
        if(age>18 && age<35) return true;
        return false;
    }
}
