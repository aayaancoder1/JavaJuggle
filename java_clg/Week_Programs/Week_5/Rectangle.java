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
	public void initialize(int base, int height)
	{
		this.base = base;
		this.height = height;
	}
	public abstract void shapeArea();
}

class Triangle extends Shape
{
	public void shapeArea()
	{
		System.out.println("The area of the Triangle is: " +(0.5 * base * height));
	}
}

public class Rectangle extends Shape
{
	public void shapeArea()
	{
		System.out.println("The area of the Rectangle is: " +(base * height));
	}
	public static void main(String arg[])
	{
		Triangle t = new Triangle();
		t.initialize(10, 20);
		t.shapeArea();

		Rectangle r = new Rectangle();
		r.initialize(10, 20);
		r.shapeArea();
	}
}