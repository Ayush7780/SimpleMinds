package simpleminds;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleMinds extends JFrame implements ActionListener{
    
    JButton b1, b2;
    JTextField t1;
    SimpleMinds(){
        setBounds(0, 0, 2200, 900); // dleft, //dup, // length, height ///////
        getContentPane().setBackground(Color.yellow);
        setLayout(null);
        
        
        
        JLabel l2 = new JLabel("Simple Minds");
        l2.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        l2.setForeground(new Color(30, 144, 254));
        l2.setBounds(650, 160, 300, 45);
        add(l2);
        
        JLabel l3 = new JLabel("Enter Your Name");
        l3.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        l3.setForeground(new Color(30, 144, 254));
        l3.setBounds(710, 300, 300, 40);
        add(l3);
        
        t1 = new JTextField();
        t1.setBounds(635, 350, 300, 40);
        t1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(t1);
        
        b1 = new JButton("Rules");
        b1.setBounds(635, 470, 120, 25);
        b1.setBackground(new Color(30, 144, 254));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Exit");
        b2.setBounds(815, 470, 120, 25);
        b2.setBackground(new Color(30, 144, 254));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            String name = t1.getText();
            this.setVisible(false);
            new Rules(name);
        }else{
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new SimpleMinds();
    }
}