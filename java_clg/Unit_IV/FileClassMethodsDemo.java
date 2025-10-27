import java.io.*;
public class FileClassMethodsDemo
{
	public static void main(String args[]) throws FileNotFoundException, IOException
	{
		File f = new File("Source.txt");

		System.out.println("Empty: " +f.exists());
		System.out.println("Length: " +f.length());
		System.out.println("Read: " +f.canRead());
		System.out.println("Write: " +f.canWrite());
		System.out.println("Directory: " +f.isDirectory());
		System.out.println("Name: " +f.getName());
		System.out.println("Path: " +f.getPath());
		System.out.println("Absolute Path: " +f.getAbsolutePath());
		System.out.println("Last Modified: " +f.lastModified());
		System.out.println("Parent: " +f.getParent());
	}
}