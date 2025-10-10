// printing numbers with intervals

class Tdemo extends Thread
{
    public void run()
    {
        for (int i = 1; i <= 10; i++)
        {
            System.out.print(i +" ");
            try{
                Thread.sleep(500);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public static void main (String arg[])
        {
            Tdemo t = new Tdemo();
            t.start();
        }
}