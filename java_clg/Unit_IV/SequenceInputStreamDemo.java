import java.io.*;

public class SequenceInputStreamDemo
{
	public static void main(String Arg[]) throws FileNotFoundException, IOException
	{
		FileInputStream fis1 = new FileInputStream("Source.txt");
		FileInputStream fis2 = new FileInputStream("Destination.txt");
		SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
		FileOutputStream fos = new FileOutputStream("Merged.txt");
		int k;
		while((k = sis.read()) != -1)
		{
			fos.write(k);
			System.out.print((char)k);
		}
		fos.close();
		sis.close();
		fis1.close();
		fis2.close();
	}
}