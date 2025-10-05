public class str_except
{
	public static void main (String arg[])
	{
		String s = "Vardhaman";
		//System.out.println(x[2]);
		
		try
		{
			System.out.println("Char at " +s.charAt(22));
		}
		catch (StringIndexOutOfBoundsException ae)
		{
			System.out.println("Exception Caught!" +ae.toString());
		}
	}
}