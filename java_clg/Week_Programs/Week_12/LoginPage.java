// LoginPage
//16/10 (2)

import java.awt.*;
import java.awt.event.*;

public class LoginPage extends Frame implements TextListener
{
    Label l1, l2, l3;
    TextField t1, t2, t3;
    public LoginPage(){
        setLayout(new GridLayout(3, 2, 10, 10));
        l1 = new Label("Username");
        l2 = new Label("Password");
        l3 = new Label("Result");
        
        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);

        t2.addTextListener(this);
        t2.setEchoChar('*');
        t3.setEditable(false);

        setTitle("Login Page");
        setSize(300, 200);
        setVisible(true);
    }
    public void textValueChanged(TextEvent e){
        String s1 = t1.getText();
        String s2 = t2.getText();

        if(s1.equals("java") && s2.equals("123")){
            t3.setText("Valid User");
        }
        else{
            t3.setText("Invalid User");
        }
    }
    public static void main (String Arg[]){
        new LoginPage();
    }
}