// Text Area Demo
//16/10 (3)

import java.awt.*;
import java.awt.event.*;

public class TextAreaDemo extends Frame implements TextListener
{
    Label l1, l2;
    TextArea t1, t2;
    public TextAreaDemo(){
        setLayout(new GridLayout(3, 2, 10, 10));
        l1 = new Label("Original Text");
        l2 = new Label("Copy Text");

        t1 = new TextArea(5, 5);
        t2 = new TextArea(5, 5);
        //t3 = new TextArea(5, 5);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        //add(l3);
        //add(t3);

        t1.addTextListener(this);
        //t2.setEchoChar('*');
        t2.setEditable(false);
        t2.setBackground(Color.LIGHT_GRAY);

        setTitle("Login Page");
        setSize(300, 200);
        setVisible(true);
    }
    public void textValueChanged(TextEvent e){
        String s1 = t1.getText();
        t2.setText(s1);
    }
    public static void main (String Arg[]){
        new TextAreaDemo();
    }
}