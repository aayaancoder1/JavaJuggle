import java.io.*;
public class filereader
{
	public static void main(String arg[]) throws IOException, FileNotFoundException
	{
		FileReader fis = new FileReader("Source.txt");
		FileWriter fos = new FileWriter("Destination.txt");
		int k;
		
		while ((k = fis.read()) != -1){
			fos.write(k);
			System.out.print((char)k);
		}
		fis.close();
		fos.close();
	}
}