import java.awt.*;
import java.awt.event.*;
public class KeyEventListenerDemo extends Frame implements KeyListener, WindowListener
{
    public KeyEventListenerDemo(){
        setTitle("Keyboard Event");
        setSize(600, 600);
        setVisible(true);
        addKeyListener(this);
        addWindowListener(this);
    }
    public void keyPressed(KeyEvent e){
        // char a = e.getKeyChar();
        // if(a == '@'){
        //     new MouseEventDemo();
    }
    public void keyReleased(KeyEvent e){}
    public void keyTyped(KeyEvent e){
        char c = e.getKeyChar();
        if(c == 'R' || c == 'r'){
            setBackground(Color.red);
        }
        if(c == 'G' || c == 'g'){
            setBackground(Color.green);
        }
        if(c == 'B' || c == 'b'){
            setBackground(Color.blue);
        }
        if(c == 'C'){
            dispose();
        }
    }
    public void windowOpened(WindowEvent e){}
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
    public void windowClosed(WindowEvent e){}
    public void windowIconified(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}
    public void windowActivated(WindowEvent e){}
    public void windowDeactivated(WindowEvent e){}
    public static void main (String Arg[]){
        new KeyEventListenerDemo();
    }
}
