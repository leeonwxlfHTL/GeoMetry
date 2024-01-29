package shape;

public class Circle extends Shape{
	
	private double radius;

	public Circle(double xCoords, double yCoords, double radius) {
		super(xCoords, yCoords);
		this.radius = radius;
	}


	@Override
	public double calculateCircumference() {
		
		return Math.PI*(radius*2);
	}

	@Override
	public double calculateArea() {
		
		return radius*radius*Math.PI;
	}
	
	public String toString() {
		return "Shape - Rectangle [x=" + this.getxCoords() + ", y=" + this.getyCoords() + ", radius=" + radius;
	}
	
}
