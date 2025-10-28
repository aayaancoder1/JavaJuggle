// Reverse of a File

import java.io.*;

public class ReverseFile
{
	public static void main(String arg[]) throws FileNotFoundException, IOException
	{
		FileReader f = new FileReader("Source.txt");
		BufferedReader br = new BufferedReader(f);
		String s = "";
		StringBuffer sb = new StringBuffer();
		while((s = br.readLine()) != null){
			sb.append(s);
		}
		System.out.print(sb.reverse());
	}
}
