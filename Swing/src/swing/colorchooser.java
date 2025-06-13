/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;
import java.io. *;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.Container;
import java.awt. *;
import javax.swing.filechooser.*;
/**
 *
 * @author asyla
 */
public class Colorchooser extends JFrame implements ActionListener {
    
    JButton b;
    Container c;
    Colorchooser(){
        c=getContentPane();
        c.setLayout(new FlowLayout());
        b= new JButton("color");
        b.addActionListener(this);
        c.add(b);
        
    }
    public void actionPerformed(ActionEvent e) {
        Color initialcolor=Color.RED;
        Color color =JColorChooser.showDialog(this, "SElect a color", initialcolor);
        c.setBackground(color);
        
    }
    
    public static  void main(String[] args) {
        Colorchooser ch = new Colorchooser();
        ch.setSize(400, 400);
        ch.setVisible(true);
        ch.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
     
}
