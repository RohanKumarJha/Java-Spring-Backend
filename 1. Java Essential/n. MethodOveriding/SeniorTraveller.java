public class SeniorTraveller extends Traveller {
    private int age;

    public SeniorTraveller(String name,String id) {
        super(name,id);
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void calculateFare() {
        if(age>=50 && age<=65) {
            setFare(getFare()-(getFare()*10)/100);
        } else if(age>65) {
            setFare(getFare()-(getFare()*15)/100);
        }
    }

    @Override
    public void displayDatails() {
        System.out.println("Traveller Details");
        System.out.println("*****************");
        System.out.println("Traveller name : "+getName());
        System.out.println("Traveller Id : "+getId());
        System.out.println("Cost of Travel : "+getFare());
    }
}
