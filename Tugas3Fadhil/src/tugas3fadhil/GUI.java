/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3fadhil;

import javax.swing.*;

/**
 *
 * @author LENOVO
 */
public class GUI extends JFrame{
    JLabel lusername = new JLabel("Username:");
    JTextField fusername = new JTextField(20);
    JLabel lpassword = new JLabel("Password:");
    JPasswordField fpassword = new JPasswordField(20);
    JButton login = new JButton("Login");
    JButton cancel = new JButton("Cancel");

    public GUI() {
        setTitle("Login");
        
        setSize(250, 150);
        
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        add(lusername);
        add(fusername);
        add(lpassword);
        add(fpassword);
        add(login);
        add(cancel);
        
        setVisible(true);
        lusername.setBounds(10, 10, 80, 20);
        fusername.setBounds(110, 10, 120, 20);
        lpassword.setBounds(10, 40, 80, 20);
        fpassword.setBounds(110, 40, 120, 20);
        login.setBounds(40, 70, 80, 20);
        cancel.setBounds(130, 70, 80, 20);
    }
    
    
}
