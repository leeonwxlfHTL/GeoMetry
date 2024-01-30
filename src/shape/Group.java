package shape;

import java.util.ArrayList;

public class Group {
	
	private ArrayList<Shape> shapes;

	public Group() {
		super();
		shapes = new ArrayList<Shape>();
	}
	

	public void addShape(Shape shape) {
		if(!this.shapes.contains(shape)) {
			this.shapes.add(shape);
		}
	}
	
	public void removeShape(Shape shape) {
		this.removeShape(shape);
	}
	

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
