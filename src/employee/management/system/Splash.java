package employee.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Splash extends JFrame implements ActionListener {// too override method in public void actionPerformed(Actionevent
    
    Splash(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(80,30,1200,60);
        heading.setFont(new Font("serif",Font.PLAIN,60));
        heading.setForeground(Color.ORANGE);
        
        
        add(heading);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200,800,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);// not i2 as we converted firstly to image icon as image is not passed directly therefore converted firstly
        image.setBounds(50,100,1060,500);
        add(image);
        
        JButton clickhere = new JButton("---CLICK HERE TO CONTINUE---");
        clickhere.setBounds(400,400,300,70);
        clickhere.setBackground(Color.BLACK);
        clickhere.setForeground(Color.ORANGE);
        clickhere.addActionListener(this);
        image.add(clickhere);
        
                
        setSize(1170,650);
        setLocation(50,50);
        setVisible(true);
        
        while(true){
            heading.setVisible(false);// upper likha hai set Visible true 
            try{
               Thread.sleep(500);
            }catch(Exception e){
                
            }
            heading.setVisible(true);
            try{
               Thread.sleep(500);
            }catch(Exception e){
                
            }
        }
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
        
    }
    
    public static void main(String args[]){
        new Splash();
    }
}
