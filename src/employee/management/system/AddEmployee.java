package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*; 

public class AddEmployee extends JFrame{
    
    AddEmployee()
    {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Add Employee Detail");
        heading.setBounds(320,30,500,50);
        heading.setFont(new Font("SAN_SERIF",Font.BOLD,25));
        add(heading);
        
        JLabel labelname= new JLabel("Name");
        labelname.setBounds(50,150,150,30);
        labelname.setFont(new Font("derif",Font.PLAIN,25));
        add(labelname);
        
        JTextField tfname = new JTextField();
        tfname.setBounds(200,150,150,30);
        add(tfname);
        
        JLabel labelfname= new JLabel("Name");
        labelfname.setBounds(400,150,150,30);
        labelfname.setFont(new Font("derif",Font.PLAIN,25));
        add(labelfname);
        
        JTextField tffname = new JTextField();
        tffname.setBounds(600,150,150,30);
        add(tffname);
        
        setSize(900,700);
        setLocation(300,50);
    }
    
    public static void main(String[] args)
    {
        new AddEmployee();
    }
    
}
