package javaapplication1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MailApp extends JFrame
{
    Container cp;
    GridLayout gl;
    JPanel pl;
 
    JLabel mail_label;
    JTextField mail_text;
    
    JLabel sub_label;
    JTextField sub_text;
    
    JLabel msg_label;
    JTextArea msg_text;
    
    JButton send_button;

   /* public static void main(String[] args) 
    {
        MailApp app = new MailApp();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(800,400);
        app.setVisible(true);        
    }*/
    /*public static void main() 
    {
        MailApp app = new MailApp();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(800,400);
        app.setVisible(true);        
    }
    public MailApp()
    {
        super("MailApp");
        
        ButtonHandler handler_button=new ButtonHandler();
        
        cp=getContentPane();
        gl=new GridLayout(0,4);
        cp.setLayout(gl);
        pl=new JPanel();
        
        mail_label= new JLabel("Send to : ");
        mail_label.setPreferredSize(new Dimension(100,20));
        
        //String email=SelectTest.u_email;
        mail_text= new JTextField(SelectTest.u_email);
        mail_text.setPreferredSize(new Dimension(200,27));
        
        sub_label= new JLabel("Subject : ");
        sub_label.setPreferredSize(new Dimension(100,20));
        
        sub_text= new JTextField("Login using OTP");
        sub_text.setPreferredSize(new Dimension(125,27));
        
        msg_label= new JLabel("Message : ");
        msg_label.setPreferredSize(new Dimension(100,20));
        
        JScrollPane scroll = new JScrollPane (msg_text);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
          
        msg_text= new JTextArea("The OTP is "+NewJApplet.password1,10,15);
 
        scroll.setViewportView(msg_text);

        send_button= new JButton("Send");
        send_button.setPreferredSize(new Dimension(150,30));
        send_button.addActionListener(handler_button);
        
        pl.add(mail_label);
        pl.add(mail_text);
        pl.add(sub_label);
        pl.add(sub_text);
        pl.add(msg_label);
        pl.add(scroll);
        pl.add(send_button);
        
        cp.add(pl);
    }
    
    //class ButtonHandler implements ActionListener  
    //{
      //  @Override
      //  public void actionPerformed(ActionEvent e)
      //  {
      //      if(e.getSource()==send_button)
      */    public static void sendmail()
    {
                //String to = mail_text.getText();
                String to=SelectTest.u_email;
                //String subject = sub_text.getText();
               // String message =  msg_text.getText();
                 String subject = "Login using OTP";
                String message =  "The OTP is "+NewJApplet.password1+"";
                
                String user = "beproject2546@gmail.com";
                String pass = "beproj12345";

                SendMail.send(to,subject, message, user, pass);
            }           
        }
    
//}}