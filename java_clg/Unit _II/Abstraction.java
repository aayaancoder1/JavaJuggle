abstract class Animal
{
	String name;
	int age;
	public void initialize (String n, int a)
	{
		name = n;
		age = a;
	}
	public abstract void makeSound();
}

class Cat extends Animal
{
	public void makeSound()
	{
		System.out.println("they sound as meowmeow");
	}
}

public class Dog extends Animal
{
	public void makeSound()
	{
		System.out.println("they sound as bow bow");
	}
	public static void main(String arg[])
	{
		Cat c = new Cat();
		c.initialize("Kitty", 2);
		c.makeSound();
	
		Dog d = new Dog();
		d.initialize("Doggy", 2);
		d.makeSound();
	}
}