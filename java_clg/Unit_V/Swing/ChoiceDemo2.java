import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ChoiceDemo2 extends JFrame implements ItemListener
{
	JLabel l1;
	JComboBox ch;
	Container c;
	public ChoiceDemo2(){
		c=getContentPane();
		setLayout(new FlowLayout());
		
		l1=new JLabel("Enter Your Choice");
		ch=new JComboBox();
		ch.addItem("IDLI");
		ch.addItem("DOSA");
		ch.addItem("WADA");
		ch.addItem("PaniPuri");
		ch.addItem("Pulav");
		ch.addItem("IceCream");
		c.add(ch);
		c.add(l1);
		setVisible(true);
		setSize(650,650);
		setTitle("Choice");
		ch.addItemListener(this);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		}
		public void itemStateChanged(ItemEvent e){
			String s=(String)ch.getSelectedItem();
			int x=ch.getSelectedIndex();
			l1.setText("you have selected "+(x+1)+" . "+s);
		}
		public static void main(String[]args){
			new ChoiceDemo2();
		}
}