// to copy from one file to another file using character strings

import java.io.*;
public class FileReaderWriterDemo
{
	public static void main(String args[])
	{
		try
		{
			FileReader fis = new FileReader("Source.txt");
			FileWriter fos = new FileWriter("Destination.txt");
			int k;
			while((k = fis.read()) != -1)
			{
				fos.write(k);
				System.out.print((char)k);
			}
			fos.close();
			fis.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}