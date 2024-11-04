class Tester {

	public static void main(String[] args) {
		Address addressOne = new Address("11","Oxford Street");
		Address addressTwo = new Address("11","Oxford Street");

        if (addressOne == addressTwo) {
			System.out.println("The address objects are same!");
		} else {
			System.out.println("The address objects are different!");
		}
		
		if (addressOne.equals(addressTwo)) {
			System.out.println("The address objects are same!");
		} else {
			System.out.println("The address objects are different!");
		}
	}
}