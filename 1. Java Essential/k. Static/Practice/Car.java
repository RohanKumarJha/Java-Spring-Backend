public class Car {
    private String color;
	private static int numberOfCars = 0;

    public Car(String color) {
        numberOfCars++;
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public static int getNumberOfCars() {
        return numberOfCars;
    }

    public void displayColor() {
		System.out.println("Color of the car : "+this.color);
	}
}
