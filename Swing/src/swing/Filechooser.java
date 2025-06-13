/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;
import java.io. *;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.filechooser.*;



/**
 *
 * @author asyla
 */
public class Filechooser  extends JFrame{
    public static void main(String[] args) {
        JFrame f= new JFrame("File option");
        JFileChooser jf = new JFileChooser("c:");
        f.add(jf);
        f.setVisible(true);
        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
