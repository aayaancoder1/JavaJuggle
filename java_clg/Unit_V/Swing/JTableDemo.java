import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class JTableDemo extends JFrame
{
    Container c;
    public JTableDemo(){
        c = getContentPane(); // retrieves object from the class Container
        // Jframe is lightweight
        // hence it cannot hold components
        // hence we have to add components to ContentPane and then adding to JFrame
        c.setLayout(new BorderLayout());

        String s[] =    {"ID", "NAME", "CGPA"}; // column header
        String r[][] = {{"1", "Aayaan", "8.8"}, // row data
                        {"2", "Shivam", "11.0"},
                        {"3", "Ramsai", "9.5"},
                        {"4", "Goofi", "10"},
                        {"5", "Kish", "9.0"}};
        JTable Jt = new JTable(r, s){// (row, column)
            public boolean isCellEditable(int row, int column){
                return false; // makes table non-editable
            }
        };

        //Constants (check once and delete this)
        // AS_NEEDED
        // ALWAYS
        // NEVER
        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;

        // scroll pane is implemented because if data exceeds the frame,
        // then scrolling is needed
        JScrollPane jsp = new JScrollPane(Jt, v, h);
        c.add(jsp, BorderLayout.CENTER);
        setVisible(true);
        setSize(600, 600);
        setTitle("JTable Demo");
    }
    public static void main(String Arg[]){
        new JTableDemo();
    }
}