class A {
    A() {
        System.out.println("I am from Super class!");
    }
}

class super_mthd extends A {
    super_mthd() {
        //super(); // calls A's constructor
        System.out.println("I am from Subclass!");
    }

    public static void main(String[] args) {
        super_mthd s = new super_mthd(); // constructor runs automatically
    }
}