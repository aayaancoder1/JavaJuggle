class First extends Thread
{
	public void run(){
		int i;
		for (i = 0; i < 10; i++){
			System.out.println("Value of i" +i);
			try{
				Thread.sleep(500);
			}
			catch (InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

class Second extends Thread
{
	public void run(){
		for (int j = 10; j > 0; j--){
			System.out.println("Value of j: " +j);
			try{
				Thread.sleep(500);
			}
			catch (InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

public class MultiThreadingDemo
{
	public stativ void main (String arg[]){
		First f = new First();
		Second s = new Second();
		f.start();
		s.start();
	}
}