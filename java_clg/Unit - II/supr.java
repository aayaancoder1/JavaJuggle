class Base
{
    int sup = 100;
    void something()
    {
        System.out.println("Super class sup : " +sup);
    }
}

class supr extends Base
{
    int sup = 10;
    void something()    // signature needs to be the same
    {
        System.out.println("Sub class sup: " +super.sup);   // super keyword takes the value of the overridden class
    }

    public static void main (String arg[])
    {
        supr s = new supr();
        s.something();
    }
}