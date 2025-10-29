import java.io.*;

// if we dont include the implements Serializable, it will throw NotSerializableException
class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	String sname;
	int sid;

	Student(String sname, int sid) {
		this.sname = sname;
		this.sid = sid;
	}
	public String toString() {
		return "Student Name: " + sname + ", Student ID: " + sid;
	}
}

public class SerializationDemo {
	public static void main(String arg[]) throws Exception
	{
		Student s1 = new Student("Aayaan", 101);
		FileOutputStream fos = new FileOutputStream("student.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.close();
		fos.close();
		System.out.println("Success!");

		FileInputStream fis = new FileInputStream("student.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student s2 = (Student) ois.readObject();
		System.out.println(s2);
		ois.close();
	}
}