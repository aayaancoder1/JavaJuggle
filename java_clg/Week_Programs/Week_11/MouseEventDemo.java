// MouseEventDemo.java

import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo extends Frame implements MouseListener, MouseMotionListener
{
    public MouseEventDemo(){
        setTitle("Mouse Event in Action");
        setSize(500, 500);
        setVisible(true);
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void mouseEntered(MouseEvent e){
        setBackground(Color.red);
    }
    public void mouseExited(MouseEvent e){
        setBackground(Color.black);
    }
    public void mouseClicked(MouseEvent e){
        setBackground(Color.cyan);
    }
    public void mousePressed(MouseEvent e){
        setBackground(Color.magenta);
    }
    public void mouseReleased(MouseEvent e){
        setBackground(Color.green);
    }
	public void mouseDragged(MouseEvent e){
        setBackground(Color.red);
    }
    public void mouseMoved(MouseEvent e){
        Color c = new Color (0, 255, 0);    //0-255
        setBackground(c);
    }
	public static void main (String arg[]){
		new MouseEventDemo();
	}
}