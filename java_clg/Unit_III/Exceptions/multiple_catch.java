// catching more than one error

public class multiple_catch
{
	public static void main(String arg[])
	{
		int a = 10, b = 0, c;
		int x[] = {1, 2, 3};

		try
		{
			c = a / b;
			System.out.println("Answer" +c);
			System.out.println("Element = " +x[5]);
		}

		catch(ArithmeticException ae)
		{
			System.out.println("Error: " +ae.toString());
		}

		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error: " +e.toString());
		}

		System.out.println("Example for multiple catch blocks!");
	}
}