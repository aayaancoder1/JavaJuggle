// Check Box Demo
// 16/10 (3)
import java.awt.*;
import java.awt.event.*;

public class CheckBoxDemo extends Frame implements ItemListener
{
    Label  l1, l2;
    Checkbox c1, c2, c3, r1, r2, r3;
    public CheckBoxDemo(){
        setLayout(new FlowLayout());
        l1 = new Label("Languages Known");
        l2 = new Label("Level");
        c1 = new Checkbox("C#");
        c2 = new Checkbox("Java");
        c3 = new Checkbox("Python");
        CheckboxGroup g1 = new CheckboxGroup();
        CheckboxGroup g2 = new CheckboxGroup();
        CheckboxGroup g3 = new CheckboxGroup();
        r1 = new Checkbox("Beginner", g1, false);
        r2 = new Checkbox("Intermediate", g1, false);
        r3 = new Checkbox("Expert", g1, false);
        add(l1);
        add(c1);
        add(c2);
        add(c3);
        add(l2);
        add(r1);
        add(r2);
        add(r3);
        add(l2);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        r1.addItemListener(this);
        r2.addItemListener(this);
        r3.addItemListener(this);
        setTitle("Check Box Demo");
        setSize(300, 300);
        setVisible(true);
    }
    public void itemStateChanged(ItemEvent e) {
        StringBuffer sb = new StringBuffer("languages known:");
        String s = "Expertiese";
        if(c1.getState())
            sb.append("C#");
        if(c2.getState())
            sb.append("Java");
        if(c3.getState())
            sb.append("Python");
        if(r1.getState())
            s += "Beginner";
        if(r2.getState())
            s += "Intermediate";
        if(r3.getState())
            s += "Expert";
        l2.setText(sb+"||"+s);
        
    }
    public static void main(String args[]){
        new CheckBoxDemo();
    }
}