class Shape { 
	final private double length; 
	final private double breadth; 

	public Shape(double length, double breadth) { 
		this.length = length; 
		this.breadth = breadth; 
	} 
	
	public final double getLength() {
		return length;
	}

	public final double getBreadth() {
		return breadth;
	}

	double getArea() {
            return 0;
        } 
    } 
    
    class Rectangle extends Shape { 
    
        public Rectangle(double length, double breadth) { 
            super(length, breadth); 
        } 
        
        @Override
        final double getArea() { 
            return this.getLength() * this.getBreadth(); 
        }
        
    } 
    
    class Square extends Shape { 
        public Square(double side) { 
            // calling Shape class constructor 
            super(side, side); 
        } 
        
        @Override
        final double getArea() { 
            return this.getLength() * this.getBreadth(); 
        } 
	
} 
