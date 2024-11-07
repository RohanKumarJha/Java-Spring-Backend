public class Intern implements Student {
    int marksSecured;
    int projectMarks;

    Intern(int marksSecured,int projectMarks) {
        this.marksSecured = marksSecured;
        this.projectMarks = projectMarks;
    }

    public void calcPercentage() {
        System.out.println((double)(marksSecured+projectMarks)*100/TOTAL_MAXIMUM_MARKS);
    }
}
