public class nullptr_except
{
	public static void main (String arg[])
	{
		String s = null;
		
		try
		{
			System.out.println("Length of the string " +s.length());
		}
		catch (NullPointerException ae)
		{
			System.out.println(ae.toString());
		}
		System.out.println("Excpetion Handled!");
	}
}