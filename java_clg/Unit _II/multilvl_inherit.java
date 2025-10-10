class A
{
    void hello()
    {
        System.out.println("Hello!");
    }
}

class B extends A
{
    void heyy()
    {
        System.out.println("Heyy!");
    }
}

class multilvl_inherit extends B
{
    void sup()
    {
        System.out.println("Sup?");
    }

    public static void main(String arg[])
    {
        A a = new A();
        B b = new B();
        multilvl_inherit m = new multilvl_inherit();

        a.hello();
        b.hello();
        b.heyy();
        m.hello();
        m.heyy();
        m.sup();
    }
}