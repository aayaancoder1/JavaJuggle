import java.util.*;

class LinkedListDemo
{
	public static void main(String arg[])
	{
		// creating the linkedlist
		LinkedList l = new LinkedList();

		// adding the linkedlist
		l.add(10);
		l.add(20.5);
		l.add(1, 36.7f);
		l.offer(true);
		l.add("India");
		l.add("Hyderabad");
		l.set(2, "Telangana");

		System.out.println("Is the List Empty?: " +l.isEmpty());
		System.out.println("Size of the Linked List: " +l.size());
		System.out.println(l);
		l.addFirst(88);
		l.addLast(false);
		System.out.println("Element at first position: " +l.getFirst());
		System.out.println("Element at last position: " +l.getLast());
		System.out.println("Top element: " +l.peek());// show the topmost element
		System.out.println("Delete: " +l.poll());// delete the topmost element

		System.out.println("Accessing elements using loop:");
		ListIterator lt = l.listIterator();
		while(lt.hasNext()){
			System.out.print(lt.next() + " ");
		}
		
		System.out.println("Delete Last: " +l.removeLast());
		System.out.println("Delete First: " +l.removeFirst());
		System.out.println(l);
	}
}