// one third of the file content in one file and rest in other file.

import java.io.*;
public class FileSplitTask
{
	public static void main(String args[]) throws FileNotFoundException,IOException
	{
		File f=new File("Source.txt");
		FileInputStream fis=new FileInputStream(f);
		long n=f.length();
		int c=0;int k;
		FileOutputStream fos1=new FileOutputStream("First.java");
		FileOutputStream fos2=new FileOutputStream("Second.java");
		while((k=fis.read())!=-1)
		{
			c++;
			if(c<=n*0.75)
			{
				fos1.write(k);
			}
			else
			{
				fos2.write(k);
			}
		}
		fis.close();
		fos1.close();
		fos2.close();
	}
}