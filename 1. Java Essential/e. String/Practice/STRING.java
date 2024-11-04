// import java.util.Scanner;
// input
// charAt(),length(),indexOf() and lastIndexOf()
// compareTo()
// contains()
// startsWith(), endsWith(), toLowerCase(), toUpperCase()
// concat()
// split(" ")

public class STRING {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the type");
        // String cusType = sc.nextLine();
        // System.out.println("The string you type is "+cusType);

        String name = "  Rohan";
        String name2 = "Rishabh";
        if(name.compareTo(name2) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
        for(int i=0; i<name.length(); i++) {
            System.out.println(name.charAt(i));
        }
        System.out.println(name.indexOf('a'));
        System.out.println(name2.lastIndexOf('i'));
        System.out.println(name.contains("han"));
        String names = name.replace(" ", "");
        System.out.println(names.startsWith("Rohan"));
    }
}