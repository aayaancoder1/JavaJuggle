class A
{
    void show()
    {
        System.out.println("Hello there, I am the parent!");
    }
}

class B extends A
{
    void display()
    {
        System.out.println("I am the first subclass!");
    }
}

class hierarchial_inherit extends A
{
    void seen()
    {
        System.out.println("I am the second subclass");
    }
    public static void main(String args[])
    {
        B b = new B();
        b.display();
        b.show();

        hierarchial_inherit h = new hierarchial_inherit();
        h.seen();
        h.show();
    }
}