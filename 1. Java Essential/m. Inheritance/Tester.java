public class Tester {
    public static void main(String[] args) {
        PermanentEmployee emp1 = new PermanentEmployee(101,"Anil");
        emp1.setBasicPay(10000);
        emp1.setHra(1500);
        emp1.setExperience(3);
        emp1.calculateSalary();
        System.out.println("Final salary is "+emp1.getSalary());

        ContractEmployee emp2 = new ContractEmployee(102,"Ankit");
        emp2.setWages(500);
        emp2.setHours(10);
        emp2.calculateSalary();
        System.out.println("Final salary is "+emp2.getSalary());
    }
}
