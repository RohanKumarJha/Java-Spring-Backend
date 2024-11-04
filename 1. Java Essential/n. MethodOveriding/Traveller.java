public class Traveller {
    private String name;
	private String id;
	private double fare=2000;

    public Traveller(String name,String id) {
        this.name = name;
        this.id = id;
    }

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}

    public void calculateFare() {
        fare = fare+(fare*11.36)/100;
    }

    public void displayDatails() {
        System.out.println("Traveller Details");
        System.out.println("*****************");
        System.out.println("Traveller name : "+name);
        System.out.println("Traveller Id : "+id);
        System.out.println("Cost of Travel : "+fare);
    }
}