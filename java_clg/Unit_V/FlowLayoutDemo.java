import java.awt.*;
import java.awt.event.*;

public class FlowLayoutDemo extends Frame{
    public FlowLayoutDemo(){
        FlowLayout f = new FlowLayout();    // in brackets (FlowLayout.RIGHT) for right
        setLayout(f);
        // or setLayout(new FlowLayout());
        int i;
        for (i = 0; i < 10; i++){
            add(new Button("Cse2i " + i));
        }
        setTitle("Button Event");
        setSize(600, 600);
        setVisible(true);
    }

    public static void main(String arg[]){
        new FlowLayoutDemo();
    }
}