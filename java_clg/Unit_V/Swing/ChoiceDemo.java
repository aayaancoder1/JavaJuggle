import java.awt.*;
import java.awt.event.*;
class ChoiceDemo extends Frame implements ItemListener
{
	Label l1;
	Choice ch;
	ChoiceDemo()
	{
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(500,500);
		setTitle("DropDown");
		l1=new Label("Select your choice");
		ch=new Choice();
		ch.addItem("Idli");
		ch.addItem("Dosa");
		ch.addItem("Vada");
		ch.addItem("Pani Puri");
		ch.addItem("Pulao");
		ch.addItem("Ice Cream");	
		add(ch);
		add(l1);
		ch.addItemListener(this);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
	public void itemStateChanged(ItemEvent e)
	{
		String s=ch.getSelectedItem();
		int x=ch.getSelectedIndex();
		l1.setText("You have selected "+(x+1)+". "+s);
	}
	public static void main(String args[])
	{
		new ChoiceDemo();
	}
}