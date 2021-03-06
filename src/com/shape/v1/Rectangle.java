package com.shape.v1;

public class Rectangle extends Shape {
	private int width;
	private int height;
	public static final int ANGLES;
	private static int count;

	static {
		count = 0;
		ANGLES = 4;
	}

	{
		count++;

	}

	public Rectangle() {
		this(0, 0);
	}

	public Rectangle(int width, int height) {
		this(width, height, 0, 0);
	}

	public Rectangle(int width, int height, int x, int y) {
		super();
		setWidth(width);
		setHeight(height);
		setX(x);
		setY(y);
		count++;
	}

	public Rectangle(Rectangle rect) {
		this(rect.width, rect.height, rect.getX(), rect.getY());
	}

	public void setWidth(int width) {
		this.width = (width < 0) ? -width : width;
	}

	public int getWidth() {
		return width;
	}

	public void setHeight(int height) {
		this.height = (height < 0) ? -height : height;
	}

	public int getHeight() {
		return height;
	}

	public void setPosition(int x, int y) {
		setX(x);
		setY(y);
	}

	public void grow(int d) {
		setHeight(height + d);
		setWidth(width + d);
	}

	public void scale(int factor) {
		setHeight(factor * height / 100);
		setWidth(factor * width / 100);

	}

	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		return (2 * width) + (2 * height);
	}

	public static int getCount() {
		return count;
	}

	@Override
	public String toString() {

		return "[Rectangle with x: " + getX() + " y: " + getY() + " height: " + getHeight() + " width: " + getWidth()
				+ "]";
	}

}