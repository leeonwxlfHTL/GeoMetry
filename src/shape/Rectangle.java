package shape;

public class Rectangle extends Shape{
	
	private double length;
	private double width;

	
	public Rectangle(double xCoords, double yCoords, double length, double width) {
		super(xCoords, yCoords);
		this.length = length;
		this.width = width;
	}

	@Override
	public double calculateCircumference() {
		
		return ((length + width) *2);
	}

	@Override
	public double calculateArea() {
		
		return length * width;
	}
	
	public String toString() {
		return "Shape - Rectangle [x=" + this.getxCoords() + ", y=" + this.getyCoords() + ", length=" + length + ", width=" + width;
	}

}
