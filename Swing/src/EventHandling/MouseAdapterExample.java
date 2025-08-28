/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EventHandling;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author asyla
 */
public class MouseAdapterExample extends MouseAdapter {
    JFrame f;
    MouseAdapterExample(){
        f= new JFrame("Mouse Adapter");
        f.addMouseListener(this);
        
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void mouseClicked(MouseEvent e){
        Graphics g = f.getGraphics();
        g.setColor(Color.RED);
        g.fillOval(e.getX(), e.getY(), 30, 30);
        
    }
    public static void main(String [] args){
        new MouseAdapterExample();
    }
    
}
