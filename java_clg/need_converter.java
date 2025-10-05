import measure.Converter;
import java.util.Scanner;

class Need_converter
{
	public static void main(String arg[])
	{
		Converter c = new Converter();
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter mm: ");
		double mm = sc.nextDouble();

		System.out.print("Enter cm: ");
		double cm = sc.nextDouble();

		System.out.print("Enter m: ");
		double m = sc.nextDouble();

		c.mm_to_cm(mm);
		c.cm_to_m(cm);
		c.m_to_km(m);
	}
}