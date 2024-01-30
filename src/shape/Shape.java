package shape;

public abstract class Shape {

	private double xCoords;
	private double yCoords;

	public Shape(double xCoords, double yCoords) {
		super();
		this.xCoords = xCoords;
		this.yCoords = yCoords;
	}

	public double getxCoords() {
		return xCoords;
	}

	public void setxCoords(double xCoords) {
		this.xCoords = xCoords;
	}

	public double getyCoords() {
		return yCoords;
	}

	public void setyCoords(double yCoords) {
		this.yCoords = yCoords;
	}

	public abstract double calculateCircumference();

	public abstract double calculateArea();

}
