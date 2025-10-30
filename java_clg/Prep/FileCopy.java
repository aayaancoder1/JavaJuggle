// write a java program to copy the content of one file to another file.

import java.io.*;

public class FileCopy
{
	public static void main (String arg[]) throws IOException, FileNotFoundException
	{
		FileInputStream fis = new FileInputStream("Source.txt");
		FileOutputStream fos = new FileOutputStream("Destination.txt");
		int k;
		while ((k = fis.read()) != -1){
			fos.write(k);
			System.out.print((char)k);
		}
		fis.close();
		fos.close();
	}
}