import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
public class LoginPage extends JFrame implements ActionListener
{
	JButton b1;
    Container c;
    JLabel l1,l2,l3;
	JTextField t1,t3;
	JPasswordField t2;
	public LoginPage(){
		c = getContentPane();
        c.setLayout(new GridLayout(4,2,10,10));
        l1=new JLabel("Enter RollNumber");
		l2=new JLabel("Enter Password");
		l3=new JLabel("Result");
		t1=new JTextField(10);
		t2=new JPasswordField(10);
		t3=new JTextField(10);
        b1 = new JButton("Login");
        b1.addActionListener(this);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
        add(b1);
		add(l3);
		add(t3);
		// t2.setEchoChar("*"); //if you want some other charected instead of dot
		t3.setEditable(false);
		setTitle("LoginPage");
		setSize(500,250);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		String s = e.getActionCommand();
        if(s.equals("Login")){
            String s1=t1.getText();
		    String s2=new String(t2.getPassword());
		    if((s1.equals("KS")) && (s2.equals("a")))
		    {
		    	t3.setText("Success");
		    }
		    else{
			    t3.setText("Invalid");
		    }
	}}
	public static void main(String[] args){
		new LoginPage();
	}
}