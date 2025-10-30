import java.util.*;

public class ArraysDemo
{
	public static void main(String arg[])
	{
		int x[] = {90, 19, 20, 2, 100};
		int y[] = {1, 2, 3, 4, 5};
		
		System.out.println("Before Sorting: ");
		for(int i=0; i<x.length; i++){
			System.out.print(x[i]+" ");
		}
		System.out.println();

		Arrays.sort(x);	// static method of Arrays class to sort an array
		// static method can be called using class name
		System.out.println("After Sorting: ");
		for(int i=0; i<x.length; i++){
			System.out.print(x[i]+" ");
		}
		System.out.println();

		System.out.println("Compare = " +Arrays.equals(x, y));

		// checking the position of element 3 in y	prints the position
		System.out.println("Element at Position: " +Arrays.binarySearch(y, 3));
		Arrays.fill(y, 200);
		//System.out.println(y);
	}
}