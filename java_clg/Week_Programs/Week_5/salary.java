//Declare a class called Employee having employee-id and employee-name as members.
//Extend class Employee to have a sub class called Salary having designation and monthly salary as members.

class employee{
	int employee_id;
	String employee_name;

	employee(int a, String s){
		employee_id = a;
		employee_name = s;
	}

	void display(){
		System.out.println("Employee ID: " + employee_id);
		System.out.println("Employee Name: " + employee_name);
	}
}

class salary extends employee{
	String designation;
	float salary;

	salary(int a, String s, String t, float d){
		super(a, s);
		designation = t;
		salary = d;
	}

	void display(){
		super.display();
		System.out.println("Designation: " + designation);
		System.out.println("Salary: " + salary);
	}

	public static void main(String arg[])
	{
		salary s1 = new salary(57, "Aayaan", "Manager", 10000.5f);
		s1.display();
	}
}