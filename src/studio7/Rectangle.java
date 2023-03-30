package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	public double getArea() {
		double area = length * width;
		return area;
	}
	
	public double getPerimeter() {
		double perimeter = (2 * length) + (2 * width);
		return perimeter;
	}

	public boolean isSmaller( Rectangle other) {
		if (this.getArea() < other.getArea()) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isSquare() {
		if (length == width) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Rectangle firstRectangle = new Rectangle(.4, .2);
		Rectangle secondRectangle = new Rectangle(.8, .8);
	    System.out.println("First area: " + firstRectangle.getArea());
	    System.out.println("Second area: " + secondRectangle.getArea());
	    System.out.println("First perimeter: " + firstRectangle.getPerimeter());
	    System.out.println("Second perimeter: " + secondRectangle.getPerimeter());
	}
}


