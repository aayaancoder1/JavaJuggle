// (a)
// Define a class Rectangle with data member’s length and width. Write methods to find
// perimeter and area of a rectangle.(class and object).

class Rectangle
{
    int lenght;
    int width;
    Rectangle(int l, int w){
        length = l;
        width = w;
    }
}

class perimeter extends Rectangle
{
    int peri;
    void perimeter(int l, int w){
        this.length = l;
        this.width = w;
        peri = 2 * (length + width);
        System.out.println("Perimeter of Rectangle is: " + peri);
    }
}

class area extends Rectangle
{
    int ar;
    void area(int l, int w){
        this.length = l;
        this.width = w;
        ar = length * width;
        System.out.println("Area of Rectangle is: " + ar);
    }

    public static void main(String[] args) {
        perimeter p = new perimeter();
        p.perimeter(5, 10);
        area a = new area();
        a.area(5, 10);
    }
}