public class CourseRegistration {
    private String studentName;
    private int registrationId;
    private float qualifyingMarks;
    private double courseFee;
    private int courseId;
    private boolean hostelRequired;

    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getRegistrationId() {
        return registrationId;
    }
    public void setRegistrationId(int registrationId) {
        this.registrationId = registrationId;
    }

    public float getQualifyingMarks() {
        return qualifyingMarks;
    }
    public void setQualifyingMarks(float qualifyingMarks) {
        this.qualifyingMarks = qualifyingMarks;
    }

    public double getCourseFee() {
        return courseFee;
    }
    public void setCourseFee(double courseFee) {
        this.courseFee = courseFee;
    }

    public int getCourseId() {
        return courseId;
    }
    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public boolean isHostelRequired() {
        return hostelRequired;
    }

    public boolean validateMarks() {
        if(getQualifyingMarks()>=65 && getQualifyingMarks()<=100) return true;
        return false;
    }

    public boolean validateCourseId() {
        if(getCourseId()==1001 || getCourseId()==1002 || getCourseId()==1003 || getCourseId()==1004 || getCourseId()==1005) return true;
        return false;
    }

    public void calculateCourseFee() {
        if(validateMarks()==false) {
            System.out.println("Marks is less than 65. You are not eligible for admission!!");
        } else if(validateCourseId()==false) {
            System.out.println("Invalid Course Id. Please try again!!");
        } else if(getCourseId()==1001) {
            if(getQualifyingMarks()>=65 && getQualifyingMarks()<=70) {
                setCourseFee(55000-(double)(55000*5)/100);
            } else if(getQualifyingMarks()>=70 && getQualifyingMarks()<=85) {
                setCourseFee(55000-(double)(55000*10)/100);
            } else if(qualifyingMarks>=85) {
                setCourseFee(55000-(double)(55000*15)/100);
            }
        } else if(getCourseId()==1002) {
            if(getQualifyingMarks()>=65 && getQualifyingMarks()<=70) {
                setCourseFee(35675-(double)(35675*5)/100);
            } else if(getQualifyingMarks()>=70 && getQualifyingMarks()<=85) {
                setCourseFee(35675-(double)(35675*10)/100);
            } else if(getQualifyingMarks()>=85) {
                setCourseFee(35675-(double)(35675*15)/100);
            }
        } else if(getCourseId()==1003) {
            if(getQualifyingMarks()>=65 && getQualifyingMarks()<=70) {
                setCourseFee(28300-(double)(28300*5)/100);
            } else if(getQualifyingMarks()>=70 && getQualifyingMarks()<=85) {
                setCourseFee(28300-(double)(28300*10)/100);
            } else if(qualifyingMarks>=85) {
                setCourseFee(28300-(double)(28300*15)/100);
            }
        } else if(getCourseId()==1004) {
            if(getQualifyingMarks()>=65 && getQualifyingMarks()<=70) {
                setCourseFee(22350-(double)(22350*5)/100);
            } else if(getQualifyingMarks()>=70 && getQualifyingMarks()<=85) {
                setCourseFee(22350-(double)(22350*10)/100);
            } else if(qualifyingMarks>=85) {
                setCourseFee(22350-(double)(22350*15)/100);
            }
        } else if(getCourseId()==1005) {
            if(getQualifyingMarks()>=65 && getQualifyingMarks()<=70) {
                setCourseFee(115000-(double)(115000*5)/100);
            } else if(getQualifyingMarks()>=70 && getQualifyingMarks()<=85) {
                setCourseFee(115000-((double)(115000*10)/100));
            } else if(getQualifyingMarks()>=85) {
                setCourseFee(115000-(double)(115000*15)/100);
            }
        System.out.println("********Course Allocation Details********");
        System.out.println("Student Name : "+getStudentName());
        System.out.println("CourseId : "+getCourseId());
        System.out.println("Qualifying Exam Marks : "+getQualifyingMarks());
        System.out.println("Student's Registration Id : "+getRegistrationId());
        System.out.println("Total course fee : "+getCourseFee());
        System.out.println("Hostel Required : "+((isHostelRequired())?"Yes":"No"));
        }
    }
}
