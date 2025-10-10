// (b)
// Write a Java program that create an abstract base class Shape with two members base and height,
// a member function for initialization and a function to compute shapeArea().
// Derive two specific classes Triangle and Rectangle which override the function
// shapeArea().
// Write a driver classes (main) to display the area of the triangle and rectangle.
// (Use super keyword).

abstract class Shape
{
	int base;
	int height;
	Shape(int base, int height)
	{
		this.base = base;
		this.height = height;
	}
	public abstract void shapeArea();
}

class Triangle extends Shape
{
	Triangle(int base, int height)
	{
		super(base, height);
	}
	public void shapeArea()
	{
		System.out.println("The area of the Triangle is: " +(0.5 * base * height));
	}
}

public class Driver
{
	public static void main(String arg[])
	{
		Triangle t = new Triangle(2, 3);
		t.shapeArea();
	}
}