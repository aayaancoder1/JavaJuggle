import java.awt.*;
import java.awt.event.*;

public class GridLayoutDemo extends Frame{
    public GridLayoutDemo(){
        GridLayout g = new GridLayout(3, 3, 5, 10);
        setLayout(g);
        int i;
        for (i = 0; i < 9; i++){
            add(new Button("Cse2i " + i));
        }
        setTitle("Button Event");
        setSize(600, 600);
        setVisible(true);
    }

    public static void main(String arg[]){
        new GridLayoutDemo();
    }
}