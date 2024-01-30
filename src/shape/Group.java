package shape;

import java.util.ArrayList;

public class Group {

	private ArrayList<Shape> shapes;

	public Group() {
		super();
		shapes = new ArrayList<Shape>();
	}

	/**
	 * Adds a shape to the list of shapes if it's not already present.
	 *
	 * @param shape The shape to be added.
	 */
	public void addShape(Shape shape) {
		if (!this.shapes.contains(shape)) {
			this.shapes.add(shape);
		}
	}

	/**
	 * Removes a shape from the list of shapes.
	 *
	 * @param shape The shape to be removed.
	 */
	public void removeShape(Shape shape) {
		this.removeShape(shape);
	}

	/**
	 * Calculates the total area of all shapes in the list.
	 *
	 * @return The total area of all shapes.
	 */
	public double calculateAllArea() {
		double sum = 0;
		for (Shape s : shapes) {
			sum += s.calculateArea();
		}
		return sum;

	}

	/**
	 * Calculates the total circumference of all shapes in the list.
	 *
	 * @return The total circumference of all shapes.
	 */
	public double calculateAllCirumference() {
		double sum = 0;
		for (Shape s : shapes) {
			sum += s.calculateCircumference();
		}
		return sum;

	}

	/**
	 * Prints all shapes in the list.
	 */
	public void printAllShapes() {
		for (Shape s : shapes) {
			System.out.println(s);
		}

	}

	/**
	 * Finds the biggest shape in the list based on its area.
	 *
	 * @return The biggest shape in the list.
	 */
	public Shape findBiggestShape() {
		Shape biggestShape = null;
		for (Shape s : shapes) {
			double current = s.calculateArea();
			if (current > biggestShape.calculateArea() || biggestShape == null) {
				biggestShape = s;
			}

		}
		return biggestShape;
	}

}
