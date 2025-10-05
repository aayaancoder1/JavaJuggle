public class num_format_except
{
	public static void main (String arg[])
	{
		String s = "5.4";
		int x;
		
		try
		{
			x = Integer.parseInt(s);
		}
		catch (NumberFormatException ae)
		{
			System.out.println("Exception Caught!" +ae.toString());
		}
		System.out.println("Excpetion Handled!");
	}
}