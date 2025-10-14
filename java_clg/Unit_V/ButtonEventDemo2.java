import java.awt.*;
import java.awt.event.*;

public class ButtonEventDemo2 extends Frame implements ActionListener
{
    Button b1, b2, b3, b4;
    public ButtonEventDemo2(){
        setLayout(new FlowLayout());
        b1 = new Button("Java");    //label of button
        b2 = new Button("OS");
        b3 = new Button("ADS");
        b4 = new Button("Close");
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        setTitle("Button Event");
        setSize(600, 600);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();    //returns the label of button
        if(s.equals("Java")){
            b4.setVisible(false);
        }
        if(s.equals("OS")){
            b3.setEnabled(false);
        }
        if(s.equals("ADS")){
            b1.setLabel("No Java");
        }
        if(s.equals("Close")){
            dispose();
        }
    }
    public static void main (String Arg[]){
        new ButtonEventDemo2();
    }
}