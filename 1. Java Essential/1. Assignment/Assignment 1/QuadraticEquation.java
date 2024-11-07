public class QuadraticEquation {
    public static void quad(double a,double b,double c) {
        double d = Math.sqrt(b*b-4*a*c);
        double ans1 = (-b-d)/(2*a);
        double ans2 = (-b+d)/(2*a);
        if(d>0) {
            System.out.println("The roots are "+ans1+" and "+ans2);
        } else if(d==0) {
            System.out.println("The root is "+ans1);
        } else {
            System.out.println("The equations does not have real roots.");
        }
    }
    public static void main(String[] args) {
        // double a=2, b=5, c=2;
        // double a=1, b=4, c=4;
        double a=1, b=4, c=6;
        quad(a,b,c);
    }
}