

import java.io.*;
public class BufferedInputOutputStream
{
	public static void main(String args[]) throws FileNotFoundException,IOException
	{
			FileInputStream fis = new FileInputStream("Source.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			FileOutputStream fos = new FileOutputStream("Destination.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			int k;
			while((k = bis.read()) != -1)
			{
				bos.write(k);
				System.out.print((char)k);
			}
			bos.close();
			bis.close();
			fis.close();
			fos.close();
	}
}
