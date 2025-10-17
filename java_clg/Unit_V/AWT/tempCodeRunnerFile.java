// Dropdown Demo
// 16/10 (4)
import java.awt.*;
import java.awt.event.*;

public class DropdownDemo extends Frame implements ItemListener{
    Label l1;
    Choice ch;
    public DropdownDemo(){
        setLayout(new FlowLayout());
        l1 = new Label("Enter your choice");
        ch = new Choice();
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
        add windowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
    public void itemValueChanged(ItemEvent e){
        String s = ch.getSelectedItem();
        int x = ch.getSelectedIndex();
        l1.setText("You selected " + (x + 1) + "." + s);
    }
    public static void main(String args[]){
        new DropdownDemo();
    }
}