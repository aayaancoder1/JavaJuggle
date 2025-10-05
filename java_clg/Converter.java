package measure;

public class Converter
{
	public double mm_to_cm(double mm)
	{
		return (mm / 10);
	}
	public double cm_to_m(double cm)
	{
		return (cm / 100);
	}
	public double m_to_km(double m)
	{
		return (m / 1000);
	}
}