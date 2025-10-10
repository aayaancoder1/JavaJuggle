class Argument_passing
{
    public void ayra(int x)
    {
        System.out.println("Value of x is: " + x);
    }
    public void ayra(int x, int y)
    {
        System.out.println("Value of x is: " + x + ", Value of y is: " + y);
    }
    public static void main(String[] args)
    {
        Argument_passing obj = new Argument_passing();
        obj.ayra(5);
        obj.ayra(10, 15);
    }
}