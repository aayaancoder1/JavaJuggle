class A
{
    void hello()
    {
        System.out.println("Hello!");
    }
}

class mthd_overriding extends A
{
    void hello()
    {
        System.out.println("Hey!");
    }

    public static void main (String arg[])
    {
        mthd_overriding b = new mthd_overriding();
        b.hello();
        A a = new A();
    }
}