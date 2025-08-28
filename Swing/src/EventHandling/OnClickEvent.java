/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EventHandling;
import java.awt.event.*;
import javax.swing.*;

 
/**
 *
 * @author asyla
 */
public class OnClickEvent extends JFrame implements ActionListener {
    
    JTextField tf;
    OnClickEvent(){
        
        
        //create component
        tf = new JTextField();
        tf.setBounds(60,50,170,20);
        
        JButton b = new JButton("Click Me");
        b.setBounds(100,120,80,30);
        
        
        //register listener
        b.addActionListener(this); //passing current instance
        
        //add components and set size, layout and visibility
        
        add(b);
        add(tf);
        
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent e){
        tf.setText("Welcome");
    }
    public static void main(String [] arygs){
        new OnClickEvent();
    }
}

