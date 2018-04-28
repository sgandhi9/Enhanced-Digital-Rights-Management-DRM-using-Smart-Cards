package javaapplication1;
import java.awt.Container;
import java.awt.GridLayout;
//import javaapplication1.NewClass1.ButtonHandler;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;
/**
 *
 * @author JAY MEHTA
 */
public class NewClass extends JFrame
        
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

    public static void main(String[] args) 
    {
        NewClass nc = new NewClass();
        nc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nc.setSize(500,400);
        nc.setVisible(true);        
    }
    public static void main() 
    {
       NewClass nc = new NewClass();
        nc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nc.setSize(500,400);
        nc.setVisible(true);        
    }
    public NewClass()
    {
        super("NewClass");
        
        ButtonHandler bh=new ButtonHandler();
        
        cp=getContentPane();
        gl=new GridLayout(1,4);
        cp.setLayout(gl);
        pl=new JPanel();
        
        mail_label= new JLabel("MAIL SENT");
        mail_label.setPreferredSize(new Dimension(150,200));
        
       
        
        sub_label= new JLabel("Enter Password : ");
        sub_label.setPreferredSize(new Dimension(100,20));
        
        sub_text= new JTextField();
        sub_text.setPreferredSize(new Dimension(125,27));
        
       

        send_button= new JButton("Submit");
        send_button.setPreferredSize(new Dimension(150,30));
        send_button.addActionListener(bh);
        
        pl.add(mail_label);
      
        pl.add(sub_label);
        pl.add(sub_text);
      
        pl.add(send_button);
        
        cp.add(pl);
    }
    class ButtonHandler implements ActionListener  
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource()==send_button){
          
    {           //System.out.println(" "+sub_text.getText());
                   if((NewJApplet.password1).matches(sub_text.getText())){
                      // System.out.println("MATCH");
                       System.out.println(" "+NewJApplet.u_id);
                       
                        if((NewJApplet.u_id).matches("D033B3AB")){
                           try {
                               Owner.getaccess();
                           } catch (IOException ex) {
                               Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
                           } catch (Exception ex) {
                               Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
                           }
                        }
                        else if((NewJApplet.u_id).matches("DB8CE4AB")){
                           try {
                               Principal.getaccess();
                           } catch (IOException ex) {
                               Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
                           } catch (Exception ex) {
                               Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
                           }
                        }else if((NewJApplet.u_id).matches("C397B0AB")){
                           try {
                               Student.getaccess();
                           } catch (IOException ex) {
                               Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
                           } catch (Exception ex) {
                               Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
                           }
                        }
                   }
                   else   
                       JOptionPane.showMessageDialog(null,"INCORRECT PASSWORD");
              
               
            }           
        }
        }       }}
    
