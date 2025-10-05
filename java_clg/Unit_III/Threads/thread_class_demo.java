// thread using Thread class
public class thread_class_demo extends Thread
{
	public void run()
	{
		int i;
		for (i = 0; i < 10; i++)
		{
			System.out.println("Values: " +i);
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	public static void main(String arg[])
	{
		thread_class_demo t = new thread_class_demo();
		t.start();
	}
}