// MouseMotionListenerDemo

import java.awt.*;
import java.awt.event.*;

public class MouseMotionListenerDemo extends Frame implements MouseMotionListener
{
    public MouseMotionListenerDemo(){
        setTitle("Mouse Event in Action");
        setSize(500, 500);
        setVisible(true);   //if removed, the o/p will not be visible
        addMouseMotionListener(this);   //registering the MouseMotionListener
    }

    public void mouseDragged(MouseEvent e){
        setBackground(Color.red);
    }
    public void mouseMoved(MouseEvent e){
        Color c = new Color (0, 255, 0);    /0-255
        setBackground(c);
    }
	public static void main (String arg[]){
		new MouseMotionListenerDemo();
        // or MouseMotionListenerDemo m = new MouseMotionListenerDemo();
	}
    public static void main(String args[]) 
}