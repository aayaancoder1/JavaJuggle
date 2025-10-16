import java.awt.*;
import java.awt.event.*;

public class BorderLayoutDemo extends Frame{
    Button b1, b2, b3, b4, b5;
    public BorderLayoutDemo(){
        setLayout(new BorderLayout(5,10));  // horizontal and vertical gap
        b1 = new Button("Goofi");
        b2 = new Button("Kishi");
        b3 = new Button("Khushi");
        b4 = new Button("Anna");
        b5 = new Button("Shivam");
        add(b1, "North");
        add(b2, "South");
        add(b3, "East");
        add(b4, "West");
        add(b5, "Center");

        setTitle("Button Event");
        setSize(600, 600);
        setVisible(true);
    }
    public static void main (String Arg[]){
        new BorderLayoutDemo();
    }
}