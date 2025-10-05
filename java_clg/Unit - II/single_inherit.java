class A
{
    void aayaan()
    {
        System.out.println("This is Aayaan!");
    }
}

class single_inherit extends A
{
    void ayra()
    {
        System.out.println("This is Ayra!");
    }

    public static void main (String arg[])
    {
        single_inherit s = new single_inherit();
        s.aayaan();
        s.ayra();
    }
}