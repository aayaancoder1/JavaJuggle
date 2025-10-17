// ScrollBarDemo
// 16/10 (1)

import java.awt.*;
import java.awt.event.*;

public class ScrollBarDemo extends Frame implements AdjustmentListener
{
    Scrollbar s1, s2, s3;
    public ScrollBarDemo() {
        setLayout(new BorderLayout());
        s1 = new Scrollbar(Scrollbar.VERTICAL, 0, 5, 0, 255);
        s2 = new Scrollbar(Scrollbar.VERTICAL, 0, 20, 0, 255);
        s3 = new Scrollbar(Scrollbar.HORIZONTAL, 10, 30, 0, 255);
    //(scroll bar orientation, initial value, size of thumb, min value, max value)
    //adjustment value when changed goes to AdjustmentListener which calls the adjustmentValueChanged() method
    // unit increment
    // block increment
        s1.setUnitIncrement(10);
        s1.setBlockIncrement(50);
        add(s1, BorderLayout.EAST);
        add(s2, BorderLayout.WEST);
        add(s3, BorderLayout.SOUTH);

        s1.addAdjustmentListener(this);
        s2.addAdjustmentListener(this);
        s3.addAdjustmentListener(this);

        setTitle("Scroll Bar Demo");
        setSize(400, 200);
        setVisible(true);
    }

    public void adjustmentValueChanged(AdjustmentEvent e)
    {
        int x = s1.getValue();
        int y = s2.getValue();
        int z = s3.getValue();
        setBackground(new Color(x, y, z));
    }
    public static void main (String Arg[]){
        new ScrollBarDemo();
    }
}
