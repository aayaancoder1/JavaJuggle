// Dropdown Demo
// 17/10 (1)
import java.awt.*;
import java.awt.event.*;

public class DropdownDemo extends Frame implements ItemListener{
    Label l1;
    Choice ch;
    public DropdownDemo(){
        setLayout(new FlowLayout());
        l1 = new Label("Enter your choice");
        ch = new Choice();
        add(l1);
        add(ch);
        ch.addItem("Idli");
        ch.addItem("Dosa");
        ch.addItem("Wada");
        ch.addItem("PaniPuri");
        ch.addItem("Biryani");
        ch.addItem("IceCream");
        ch.addItemListener(this);
        setTitle("Dropdown Demo");
        setSize(400,400);
        setVisible(true);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
        // inside the blue (), we are creating an object of WindowAdapter class
        // its an anonymous class
        // its lets us override only the methods we want and not all methods of WindowListener interface
    }
    public void itemStateChanged(ItemEvent e){
        String s = ch.getSelectedItem();
        int x = ch.getSelectedIndex();
        l1.setText("You selected " + (x + 1) + "." + s);
    }
    public static void main(String args[]){
        new DropdownDemo();
    }
}