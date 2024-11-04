class Practice {
	public static void displayCar() {
	    System.out.println("Displaying Car details");
	}
	
	public static void main(String[] args) {
        displayCar();
		Car c1 = new Car("Red");
		Car c2 = new Car("Green");
		Car c3 = new Car("Blue");
        
        System.out.println("Number of cars created: "+Car.getNumberOfCars());
        System.out.println("Color of the cars:");
        System.out.println("Color of the car : "+c1.getColor());
        System.out.println("Color of the car : "+c2.getColor());
        System.out.println("Color of the car : "+c3.getColor());
	}
	
}