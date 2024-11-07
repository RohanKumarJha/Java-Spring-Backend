public class GraduateStudent extends Student {
    public GraduateStudent(String name) {
        super(name);
    }

    public void generateResult() {
        int n = getTest().length;
        int sum = 0;
        for(int i=0; i<n; i++) {
            sum += getTest()[i];
        }
        double answer = sum/n;
        if(answer>=70) setResult("Pass");
        else setResult("Fail");
        System.out.println(getName());
        System.out.println(getResult());
    }
}
