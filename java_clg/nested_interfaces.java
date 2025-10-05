interface First
{
	void f1();
	interface Second
	{
		void s1();
	}
}

class A implements First
{
	public void f1()
	{
		System.out.println("I am from outer Interface");
	}
}

class BCD implements First.Second
{
	public void s1()
	{
		System.out.println("I am from inner Interface");
	}
}

class Mainclass
{
	public static void main (String arg[])
	{
		A a1 = new A();
		a1.f1();
		BCD c = new BCD();
		c.s1();
	}
}