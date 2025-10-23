// JPanelDemo.java

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.*;

public class JPanelDemo extends JFrame implements ItemListener
{
    JPanel p1, p2;
    JCheckBox c1, c2, c3;
    JRadioButton r1, r2;
    JLabel l1;
    Container c;

    public JPanelDemo(){
        c = getContentPane();
        c.setLayout(new BorderLayout());

        p1 = new JPanel();
        p1.setBackground(Color.pink);
        p2 = new JPanel();
        p2.setBackground(Color.blue);

        c1 = new JCheckBox("Pastry");
        c2 = new JCheckBox("Burger");
        c3 = new JCheckBox("Pizza");
        r1 = new JRadioButton("Veg");
        r2 = new JRadioButton("No Non-Veg");

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
		
        p1.add(c1);
        p1.add(c2);
        p1.add(c3);
        p2.add(r1);
        p2.add(r2);
        l1 = new JLabel("Select your food preferences");
        c.add(p1, "North");
        c.add(l1, "Center");
        c.add(p2, "South");
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        r1.addItemListener(this);
        r2.addItemListener(this);
        setTitle("JPanel Demo");
        setSize(400, 400);
        setVisible(true);
    }
    public void itemStateChanged(ItemEvent e){
        String s = "";
        if(r1.isSelected())
            s = "Veg";
        if(r2.isSelected())
            s = "No Non-Veg";
    l1.setText("Pastry" + c1.isSelected() +
                "Burger" + c2.isSelected() +
                "Pizza" +c3.isSelected() +
                "Your choice is: " + s);
    }

    public static void main(String[] args){
        new JPanelDemo();
    }
}