class A
{
    public void show()
    {
        System.out.println("Example for Dynamic Method Dispatch!");
    }
}

class dynamic_mthd_dispatch extends A
{
    public void show()
    {
        System.out.println("Runtime Polymorphism");
    }
    public static void main (String arg[])
    {
        dynamic_mthd_dispatch b = new dynamic_mthd_dispatch();
        A a = new A();
        a = b;  // dynamic method dispatch
        a.show();
    }
}