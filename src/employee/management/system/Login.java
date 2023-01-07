
package employee.management.system;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener  {
    
    JTextField tfusername,tfpassword;
    
    Login(){
        
        getContentPane().setBackground(Color.WHITE);
        
        setLayout(null);
        //labeling of username and password
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40,20,100,30);
        add(lblusername);
        
        //creating text field inside to take user input 
        tfusername = new JTextField();
        tfusername.setBounds(150,20,190,30);
        add(tfusername);
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(40,70,100,30);
        add(lblpassword);
        
        //test field for password to take user input
        tfpassword = new JTextField();
        tfpassword.setBounds(150,70,150,30);
        add(tfpassword);
        
        
        // adding login button same as befor in splash 
         JButton login = new JButton("LOGIN");
        login.setBounds(150,140,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.RED);
        login.addActionListener(this);
        add(login);
        
        
        //adding image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400,400,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);// not i2 as we converted firstly to image icon as image is not passed directly therefore converted firstly
        image.setBounds(350,00,200,295);
        add(image);
        
       setSize(600,330);
       setLocation(450,200);
       setVisible(true);
       
    }
    @Override
    public void actionPerformed (ActionEvent ae){
        try{
            String username = tfusername.getText();
            String password = tfpassword.getText();
            
            Conn c = new Conn();
            String query = "select * from login where username = '"+username+"'and password = '"+password+"'";
            
            ResultSet rs = c.s.executeQuery(query);
            if(rs.next()){
                setVisible(false);
                //next class ie home to open
                new Home();
            }else{
                JOptionPane.showMessageDialog(null,"Invalid username or password");
                setVisible(false);
            }
        }catch (Exception e){
           // e.printStactTrace();
        }
        
        
    }
    
   public static void main (String [] args){
       new Login();
   } 
}
 