import java.io.*;

public class FileSplitTask
{
	public static void main (String arg[]) throws IOException, FileNotFoundException
	{
		File f = new File("file.txt");
		FileReader fis = new FileReader(f);
		FileWriter fos1 = new FileWriter("dest1.txt");
		FileWriter fos2 = new FileWriter("dest2.txt");
		long len = f.length();
		int c = 0, k;
		while((k = fis.read()) != -1){
			c++;
			if(c >= len * 0.75){
				fos1.write(k);
			}
			else{
				fos2.write(k);
			}
		}
		fis.close();
		fos1.close();
		fos2.close();
	}
}