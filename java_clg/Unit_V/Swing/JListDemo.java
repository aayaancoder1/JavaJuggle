import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class JListDemo extends JFrame implements ListSelectionListener
{
	Container c;
	JList j;
	
	public JListDemo(){
		c = getContentPane();
		c.setLayout(new FlowLayout());

		// String array is to be passed as a parameter to JList
		String colors[] = {"Red", "Blue", "Green", "Orange", "Pink", "Magenta"};
		j = new JList(colors);

		j.addListSelectionListener(this);
		c.add(j);
		// or c.add(new JScrollPane(j));
		j.setVisibleRowCount(5);
		j.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		setSize(400, 400);
		setTitle("JList Demo");
		setVisible(true);
	}
	public void valueChanged(ListSelectionEvent e){
		String s = (String)j.getSelectedValue();
		if(s.equals("Red"))
			c.setBackground(Color.red);
		if(s.equals("Blue"))
			c.setBackground(Color.blue);
		if(s.equals("Green"))
			c.setBackground(Color.green);
		if(s.equals("Orange"))
			c.setBackground(Color.orange);
		if(s.equals("Pink"))
			c.setBackground(Color.pink);
		if(s.equals("Magenta"))
			c.setBackground(Color.magenta);
	}
	public static void main(String arg[]){
		new JListDemo();
	}
}