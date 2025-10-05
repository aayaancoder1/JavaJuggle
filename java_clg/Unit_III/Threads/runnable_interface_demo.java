// write a java program to create a thread using runnable interface

public class runnable_interface_demo implements Runnable
{
	public void run()
	{
		int i;
		for (i = 0; i < 10; i++)
		{
			System.out.println("Value: " +i);
			try
			{
				Thread.sleep(500);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	public static void main(String arg[])
	{
		runnable_interface_demo t = new runnable_interface_demo();
		Thread th = new Thread(t);
		th.start();
	}
}