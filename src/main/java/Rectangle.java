public class Rectangle {
	/*
	 * Design a class named Rectangle to represent a rectangle. It should contains
	 *  - Two double data fields named width and height. The default values for both is 1.
	 *  - A no-arg constructor that creates a default rectangle
	 *  - A constructor that creates a rectangle with the specified width and height
	 *  - Getter methods for the width and height
	 *  - A method named getArea() that returns the area of this rectangle A = l*w
	 *  - A method named getPerimeter() that returns the perimeter of this rectangle P = 2 * (l+w)
	 */
	private double width;
	private double height;

	public Rectangle(){
		this.width = 1;
		this.height = 1;
	}

	public Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public double getArea(){
		return width * height;
	}

	public double getPerimeter(){
		return width + height + width + height;
	}

}
