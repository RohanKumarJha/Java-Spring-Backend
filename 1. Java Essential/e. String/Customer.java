public class Customer {
    private String name;
    private int discount;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getDiscount() {
        return discount;
    }
    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void findDiscountAndName(String inputString) {
        String newString = inputString.replace(" ", "");
        String nameString1 = newString.replace("Regular:", "");
        String nameString2 = newString.replace("Privileged:", "");
        if(newString.startsWith("Regular")) {
            System.out.println("Hi "+nameString1+" 10% discount is applicable for you");
        } else {
            System.out.println("Hi "+nameString2+" 20% discount is applicable for you");
        }
    }
}