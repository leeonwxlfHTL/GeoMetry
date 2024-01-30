package shape;

public class Triangle extends Shape {

	private double length;
	private double width;
	private double heigth;

	public Triangle(double xCoords, double yCoords, double length, double width, double heigth) {
		super(xCoords, yCoords);
		this.length = length;
		this.width = width;
		this.heigth = heigth;
	}

	/**
	 * Calculates the circumference of the triangle.
	 *
	 * @return The circumference of the triangle.
	 */
	@Override
	public double calculateCircumference() {

		return length + heigth + width;
	}

	/**
	 * Calculates the area of the triangle.
	 *
	 * @return The area of the triangle.
	 */
	@Override
	public double calculateArea() {
		return (heigth * width) / 2;
	}

	public String toString() {
		return "Shape - Triangle [x=" + this.getxCoords() + ", y=" + this.getyCoords() + ", length=" + length
				+ ", width=" + width + ", height=" + heigth;
	}

}
