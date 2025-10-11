import java.awt.*;
import java.awt.event.*;
public class KeyEventDemo extends Frame implements KeyListener
{
    public KeyEventDemo(){
        setTitle("Keyboard Event");
        setSize(600, 600);
        setVisible(true);
        addKeyListener(this);
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
    }
    public static void main (String Arg[]){
        new KeyEventDemo();
    }
}
