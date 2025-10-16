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
        ch = new Choice("Select the items");
        ch.addItem("Idli");
        ch.addItem("Dosa");
        ch.addItem("Wada");
        ch.addItem("PaniPuri");
        ch.addItem("Biryani");
    }
}