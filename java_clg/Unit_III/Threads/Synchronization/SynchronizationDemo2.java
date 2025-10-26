class multiply
{
    public void mul(int n){
        //if we remove the synchronized key word, then it will show erradic behaviour
        synchronized(this){
			for (int i = 1; i <= 5; i++){
				System.out.println(n * i);
				try{
					Thread.sleep(200);
				}
				catch (InterruptedException e){
					e.printStackTrace();
				}
			}
		}
	}
}

class Thread1 extends Thread
{
    multiply m;
    public Thread1 (multiply m){
        this.m = m;
    }
    public void run(){
        m.mul(5);
    }
}

class Thread2 extends Thread
{
    multiply m;
    public Thread2 (multiply m){
        this.m = m;
    }
    public void run(){
        m.mul(10);
    }
}

public class SynchronizationDemo2
{
    public static void main(String args[]){
        multiply m = new multiply();
		Thread1 t1 = new Thread1(m);
		Thread2 t2 = new Thread2(m);
		t1.start();
		t2.start();
		try{
			t1.join();
			t2.join();
		}
		catch (InterruptedException e){
			e.printStackTrace();
		}
    }
}