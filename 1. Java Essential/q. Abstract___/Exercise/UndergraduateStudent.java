public class UndergraduateStudent extends Student {
    public UndergraduateStudent(String name) {
        super(name);
    }

    public void generateResult() {
        int n = getTest().length;
        int sum = 0;
        for(int i=0; i<n; i++) {
            sum += getTest()[i];
        }
        double answer = sum/n;
        if(answer>=60) setResult("Pass");
        else setResult("Fail");
        System.out.println(getName());
        System.out.println(getResult());
    }
}
