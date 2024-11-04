class Movie{
	final String name="The Godfather";
	void watchMovie(){
		// name="Chinatown";
		System.out.println("Movie Name: "+name);
	}
	
	final int shows;
	public Movie(){
		shows=400;   
		//The unassigned final variable can be assigned a value only in the constructor
		System.out.println("Total shows: "+shows);
	}
	
	static final float price;
	static{
		price=200.25f;
		// The unassigned static final variable can be assigned a value only in a static block
		System.out.println("Price: "+Movie.price);
	}
	
}