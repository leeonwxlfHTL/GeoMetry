package shape;

import java.util.ArrayList;

public class Group {

	private ArrayList<Shape> shapes;

	public double calculateAllArea() {
		double sum = 0;
		for (Shape s : shapes) {
			sum += s.calculateArea();
		}
		return sum;

	}

	public double calculateAllCirumference() {
		double sum = 0;
		for (Shape s : shapes) {
			sum += s.calculateCircumference();
		}
		return sum;

	}

	public void printAllShapes() {
		for (Shape s : shapes) {
			System.out.println(s);
		}

	}

	public Shape findBiggestShape() {
		Shape biggestShape = null;
		for (Shape s : shapes) {
			double current = s.calculateArea();
			if (current > biggestShape.calculateArea()) {
				biggestShape = s;
			}

		}
		return biggestShape;
	}

}
