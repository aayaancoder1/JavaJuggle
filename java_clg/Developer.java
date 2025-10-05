abstract class Employee
{
	String name;
	int salary;
	public void create(String n, int s)
	{
		name = n;
		salary = s;
	}
	public abstract void bonus();
}

class Manager extends Employee
{
	public void bonus()
	{
		System.out.println("Bonus is: " +(0.2 * salary));
	}
}

public class Developer extends Employee
{
	public void bonus()
	{
		System.out.println("Bonus is: " +(0.1 * salary));
	}
	public static void main (String arg[])
	{
		Manager m = new Manager();
		m.create("Kishi", 20000);
		m.bonus();
		Developer d = new Developer();
		d.create("Shivam", 2000);
		d.bonus();
	}
}

