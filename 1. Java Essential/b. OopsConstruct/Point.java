class Point {
	
	private double x;
	private double y;

    public Point() {

    }
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double distance(){
        double answer = Math.sqrt(x*x+y*y);
        return answer;
	}

	public double distance(Point obj){
        double answer = Math.sqrt(((getX()-obj.x)*(getX()-obj.x))+(getY()-obj.y)*(getY()-obj.y));
        return answer;
	}

}
