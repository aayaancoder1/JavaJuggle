import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class JTableDemo extends JFrame
{
    Container c;
    public JTableDemo(){
        c = getContentPane();
        c.setLayout(new BorderLayout());
        String s[] = {"sid", "sname", "cgpa"};
        String r[][] = {{"1", "Aayaan", "8.8"},
                        {"2", "Shivam", "8.0"},
                        {"3", "Ramsai", "9.5"},
                        {"4", "Goofi", "10"},
                        {"5", "Kish", "9.0"}};
        JTable Jt = new JTable(r, s);
        JScrollPane jsp = new JScrollPane(Jt);
        c.add(jsp, BorderLayout.CENTER);
        setVisible(true);
        setSize(600, 600);
        setTitle("JTable Demo");
    }
    public static void main(String Arg[]){
        new JTableDemo();
    }
}