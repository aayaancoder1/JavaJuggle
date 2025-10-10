// when a class implements Runnable, it is not treated as a thread.

class TIdemo implements Runnable
{
    
    public void run()
    {
        for(int i = 0; i <= 10; i++)
        {
            System.out.print(i);
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException a){
                a.printStackTrace();
            }
        }
    }
    public static void main (String arh[])
    {
        TIdemo t = new TIdemo();
        Thread th = new Thread(t);
        th.start();
    }
}