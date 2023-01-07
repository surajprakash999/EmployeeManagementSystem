package employee.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Home extends JFrame implements ActionListener{
    
    JButton view, add, update, remove;
    Home(){
        
        setLayout(null);
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120,630,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);// not i2 as we converted firstly to image icon as image is not passed directly therefore converted firstly
        image.setBounds(0,0,1120,630);
        add(image);
        
        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(620,20,400,40);
        heading.setFont(new Font("Raleway",Font.BOLD,25));
        image.add(heading);
        
        add = new JButton("Add Employee");
        add.setBounds(650,80,150,40);
        add.addActionListener(this);// for click event we put action listener all were we want
        image.add(add);
        
        view = new JButton("View Employee");
        view.setBounds(820,80,150,40);
        view.addActionListener(this);// for click event we put action listener all were we want
        image.add(view);
        
        update = new JButton("Update Employee");
        update.setBounds(650,140,150,40);
        update.addActionListener(this);// for click event we put action listener all were we want
        image.add(update);
        
        remove = new JButton("Remove Employee");
        remove.setBounds(820,140,150,40);
        remove.addActionListener(this);// for click event we put action listener all were we want
        image.add(remove);
        
        
        setSize(1120,630);
        setLocation(80,50);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){// same listener is called to all the buttons so we had to differenctiate all the listeners
        if(ae.getSource()== add){
        setVisible(false);
        new AddEmployee();
    }else if(ae.getSource() == view){
        setVisible(false);
        new ViewEmployee();
    } else if (ae.getSource() == update) {
            setVisible(false);
            new ViewEmployee();
        } else {
            setVisible(false);
            new RemoveEmployee();
        }
    }
    public static void main (String [] args){
        new Home();
    }}
