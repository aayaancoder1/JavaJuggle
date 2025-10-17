import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ButtonDemo extends JFrame implements ActionListener
{
    JButton b1, b2, b3, b4;
    Container c;
    public ButtonDemo(){
        c = getContentPane();
        c.setLayout(new FlowLayout());
        b1 = new JButton("Java");    //label of button
        b1.setToolTipText("The Language Java"); //tooltip
        b2 = new JButton("OS");
        b3 = new JButton("ADS");
        b4 = new JButton("Close");
        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
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
            setBackground(Color.orange);
            b1.setForeground(new Color(14, 125, 220));//text color
        }
        if(s.equals("OS")){
            setBackground(Color.green);
            b2.setForeground(new Color(14, 125, 220));
        }
        if(s.equals("ADS")){
            setBackground(Color.blue);
            b3.setForeground(new Color(14, 125, 220));
        }
        if(s.equals("Close")){
            dispose();
        }
    }
    public static void main (String Arg[]){
        new ButtonDemo();
    }
}