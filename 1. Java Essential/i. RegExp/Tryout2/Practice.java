public class Practice {
    public static void main(String[] args) {
        String name = "Rohan Kumar Jha";
        String email = "rohan.jha0107@gmail.com";
        String userId = "rohan#28jha";
        String accSerialId = "WoW-abcDefg01293abcDefg_12cd5";

        String[] arr = name.toLowerCase().split(" ");
        String nameRegex = "^([A-Za-z ]+)$";
        String emailRegex = arr[0]+"[.]"+arr[2]+"\\d{4}[@](gmail|email)[.](com|in)";
        String userIdRegex = arr[0]+"[#]\\d{2}"+arr[2];
        String accSerialIdRegex = "^([WoW]+)[-]([a-zA-Z]{7})\\d{5}([a-zA-Z]{7})[_]([0-9A-Za-z]{5})$";

        System.out.println(name.matches(nameRegex));
        System.out.println(email.matches(emailRegex));
        System.out.println(userId.matches(userIdRegex));
        System.out.println(accSerialId.matches(accSerialIdRegex));
    }
}