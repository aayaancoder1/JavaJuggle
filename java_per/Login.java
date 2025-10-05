import java.util.Scanner;
class authenticationException extends Exception
{
	public authenticationException(String msg)
	{
		super(msg);
	}
}

public class Login
{
	public static void main (String arg[]) throws authenticationException
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		if (s1.equals("VCE") && s2.equals("Isection"))
		{
			System.out.println("Login Successful!");
		}
		else
		{
			throw new authenticationException ("Invalid Username and Password");
		}
	}
}