import java.io.*;
public class CopyFile
{
	public static void main(String args[]) //throws FileNotFoundException,IOException
	{
		try
		{
			FileInputStream fis = new FileInputStream("Source.txt");
			FileOutputStream fos = new FileOutputStream("Destination.txt");
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