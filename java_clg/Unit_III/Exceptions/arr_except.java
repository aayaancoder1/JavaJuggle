//ArrayIndexOutOfBoundsException

public class arr_except
{
	public static void main (String arg[])
	{
		int x[] = {1, 2, 3, 4, 5};
		System.out.println(x[2]);
		
		try
		{
			System.out.println(x[15] / 0);
		}
		catch (ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Exception Caught!" +ae.toString());
		}
	}
}