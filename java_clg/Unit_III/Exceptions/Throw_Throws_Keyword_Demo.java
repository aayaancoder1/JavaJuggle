//Throw and Throws Keyword Demo

import java.util.Scanner;
class NumException extends Exception
{
	public NumException(String msg)
	{
		super(msg);
	}
}

public class Throw_Throws_Keyword_Demo
{
	public static void main(String arg[]) throws NumException
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num > 0)
			System.out.println("Poisitive num!");
		else
			throw new NumException("Negative num!");
	}
}