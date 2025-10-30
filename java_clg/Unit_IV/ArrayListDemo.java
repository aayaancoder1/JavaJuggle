import java.util.*;

public class ArrayListDemo
{
	public static void main(String arg[])
	{
		ArrayList a = new ArrayList();
		System.out.println("Empty "+a.isEmpty());
		System.out.println("Size " +a.size());

		// adding elements
		a.add(10);
		a.add(88.7);
		a.add(true);
		a.add("Vardhaman");
		a.add('j');
		a.add(10);	// to show that array can store duplicate values

		System.out.println("Elements: "+a);
		int j;
		for (j = 0; j < a.size(); j++){
			System.out.println(a.get(j));
		}
		a.remove(88.7);

		// Traversal
		System.out.println("Accessing every Element: ");
		Iterator i = a.iterator();	// iterator method returns a reference to the iterator object
		while(i.hasNext()){
			System.out.println(i.next());
		}

		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("Shamshabad");
		a2.add("Narkuda");
		a2.add("OOP");
		a2.add("Java");
		//a2.add(10);	this will spit out an error saying incompatible
		// coz we used <String> while declaring the arraylist

		System.out.println("Printing for each loop");
		
		for(String str:a2){
			System.out.println(str);
		}
		System.out.println("Element at " +a.get(3));	// 3 indicates index; not element
		System.out.println("Contains " +a.contains(true));
		System.out.println("Index " +a.indexOf(10));
		System.out.println("Last Index " +a.lastIndexOf(10));
	}
}