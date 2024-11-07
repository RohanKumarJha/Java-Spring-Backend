public class Trainee implements Student {
    int marksSecured;

    public Trainee(int marksSecured) {
        this.marksSecured = marksSecured;
    }

    public void calcPercentage() {
        System.out.println((double)(marksSecured*100/TOTAL_MAXIMUM_MARKS));
    }
}
