import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class CardLayoutDemo extends JFrame implements ActionListener
{
	Container c;
	CardLayout cnd;
	JButton b1, b2, b3;
	public CardLayoutDemo(){
		cnd = new CardLayout();
		c = getContentPane();
		c.setLayout(cnd);
		b1 = new JButton("Vardhaman");
		b2 = new JButton("BTech II CSE - I");
		b3 = new JButton("Java");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		c.add(b1);
		c.add(b2);
		c.add(b3);
		setSize(500, 500);
		setTitle("Card Layout Demo");
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		cnd.previous(c);
		//cnd.next(c);
	}
	public static void main(String []arg){
		new CardLayoutDemo();
	}
}