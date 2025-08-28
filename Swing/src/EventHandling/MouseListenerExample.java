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
public class MouseListenerExample extends JFrame implements MouseListener {
    
    
    JLabel l;
    MouseListenerExample(){
        
        addMouseListener(this);
        
        l = new JLabel();
        l.setBounds(20,30,100,20);
        add(l);
        
        setSize(300,300);
        
        setLayout(null);
        setVisible(true);
        
    }
    public void mouseClicked(MouseEvent e){
        l.setText("Mouse Clicked");
    }
    public void mouseEntered(MouseEvent e){
        l.setText("Mouse Entered");
    }
    public void mouseExited(MouseEvent e){
        l.setText("Mouse Exited");
    }
    
    public void mousePressed(MouseEvent e){
        l.setText("Mouse Pressed");
    }
    public void mouseReleased(MouseEvent e){
        l.setText("Mouse Released");
    }
    
    public static void main(String [] args){
        new MouseListenerExample();
    }
}
