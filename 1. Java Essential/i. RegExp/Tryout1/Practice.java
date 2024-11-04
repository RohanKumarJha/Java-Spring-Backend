public class Practice {
    public static void main(String[] args) {
        String str = new String("We are going to learn Regular Expression in Java");
        String regex1 = "[A-Z].*";
		String regex2 = ".*to.*";
        System.out.println("Does the string start with an Uppercase Letter? : "+str.matches(regex1));
        System.out.println("Does the string contain the word 'to'? : " +str.matches(regex2));
        String str2 = "Thomas45";
        String regex3 = "[A-Z]([a-z]+)\\d{2}";
        System.out.println("Does ("+str2+") match with required pattern ? : "+str2.matches(regex3));
    }
}