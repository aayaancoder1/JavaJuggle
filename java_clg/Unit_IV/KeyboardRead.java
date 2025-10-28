// read data from the keyboard

import java.io.*;

public class KeyboardRead
{
	public static void main(String arg[]) throws IOException{
		DataInputStream dis = new DataInputStream(System.in);
		// or InputStreamReader
		System.out.println("Enter your name: ");
		String name = dis.readLine();
		System.out.println("Name is: " +name);

		System.out.println("Enter your Hobby: ");
		String hobby = dis.readLine();
		System.out.println("Your Hobby is: " +hobby);

		System.out.println("Enter a number: ");
		String numstr = dis.readLine();
		int num = Integer.parseInt(numstr);
		System.out.println("Number is: " +num);
	}
}