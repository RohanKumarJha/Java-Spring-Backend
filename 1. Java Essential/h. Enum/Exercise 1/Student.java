public class Student {
    private int studentId;
    private String name;
    private int totalMarks;
    private Grades grade;
    private float scholarshipAmount;

    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getTotalMarks() {
        return totalMarks;
    }
    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public Grades getGrade() {
        return grade;
    }
    public void calculateGrade() {
        if(this.totalMarks>=250) {
            this.grade = Grades.A;
        } else if(this.totalMarks<250 && this.totalMarks>=200) {
            this.grade = Grades.B;
        } else if(this.totalMarks<200 && this.totalMarks>=175) {
            this.grade = Grades.C;
        } else if(this.totalMarks<175 && this.totalMarks>=150) {
            this.grade = Grades.D;
        } else {
            this.grade = Grades.E;
        }
    }

    public float getScholarshipAmount() {
        return scholarshipAmount;
    }
    public void calculateScolarshipAmount() {
        if(this.grade.equals(Grades.A)) {
            this.scholarshipAmount = 5000;
        } else if(this.grade.equals(Grades.B)) {
            this.scholarshipAmount = 4000;
        } else if(this.grade.equals(Grades.C)) {
            this.scholarshipAmount = 3000;
        } else if(this.grade.equals(Grades.D)) {
            this.scholarshipAmount = 2000;
        } else {
            this.scholarshipAmount = 0;
        }
    }
}