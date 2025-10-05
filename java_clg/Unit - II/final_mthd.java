class mthd
{
    void show()
    {
        System.out.println("Hello from mthd");
    }

    final void display()
    {
        System.out.println("Hello from final_mthd");
    }
}

class final_mthd extends mthd
{
    // this mehtod will produce an error as final method cant be overridden
    // void display()
    // {
    //     System.out.println("Hello from final_mthd sub");
    // }

    public static void main(String arg[])
    {
        final_mthd f = new final_mthd();
        f.show();
        f.display();
    }
}

//final class cant be etended or inherited. if done so, it throws a compilation error