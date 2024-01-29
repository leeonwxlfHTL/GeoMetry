package shape;

public class Triangle extends Shape{
	
	private double length;
	private double width;
	private double heigth;

	
	public Triangle(double xCoords, double yCoords, double length, double width, double heigth) {
		super(xCoords, yCoords);
		this.length = length;
		this.width = width;
		this.heigth = heigth;
	}

	@Override
	public double calculateCircumference() {
		
		return length + heigth + width;
	}

	@Override
	public double calculateArea() {
		return (heigth * width)/2;
	}
	
	public String toString() {
		return "Shape - Triangle [x=" + this.getxCoords() + ", y=" + this.getyCoords() + ", length=" + length + ", width=" + width + ", height=" + heigth ;
	}

}
