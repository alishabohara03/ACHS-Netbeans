/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;
import javax.swing. *;
import java.awt. *;

/**
 *
 * @author asyla
 */

class SwingComponent extends JFrame{
    
    JLabel l1, l2, l3, l4, l5;
    JTextField t1;
    JPasswordField t2, t3;
    JRadioButton r1, r2;
    JCheckBox c1, c2, c3;
    JButton b1;
    
    
    
    public void setComponent () {

   l1 = new JLabel("Username");
   l2 = new JLabel("Password");
   l3 = new JLabel("Repassword");
  l4 = new JLabel("Gender");
  l5= new JLabel("Course");


  t1 = new JTextField(15);
  t2 = new JPasswordField(15);
  t3 = new JPasswordField(15);
  r1 = new JRadioButton("male");
  r2 = new JRadioButton("female");
  c1= new JCheckBox("c");  
  c2= new JCheckBox("java");

  c3= new JCheckBox("C++");
  b1= new JButton("Submit");
  
  
  
  ButtonGroup bg = new ButtonGroup();
  bg.add(r1);
  bg.add(r2);
  
  l1.setBounds(50, 50, 250, 30);
  t1.setBounds(150, 50, 250, 30);
  
  
  l2.setBounds(50, 100, 250, 30);
  t2.setBounds(150, 50, 250, 30);
  
  
  l3.setBounds(50, 150, 250, 30);
  t3.setBounds(150, 150, 250, 30);
  
  
  l4.setBounds(100, 200, 250, 30);
  r1.setBounds(20, 225, 100, 30);
  r2.setBounds(150, 225, 100, 30);
  
  l5.setBounds(100, 250, 250,30);
  c1.setBounds(50, 275, 100, 30);
  c2.setBounds(150, 275, 100, 30);
  c3.setBounds(250, 275, 100, 30);
  
  
  b1.setBounds(100, 300, 100, 30);
  
  add(l1);add(t1);
  add(l2);add(t2);
  add(l3);add(t3);
  add(l4);add(r1);add(r2);
  add(l5);add(c1);add(c2);add(c3);
  add(b1);
  
  setLayout(null);
  setVisible(true);
  
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setSize(500, 500);
  
}
}


public class form {
    
    public static void main(String[] args) {
        SwingComponent sc = new SwingComponent();
        sc.setComponent();
    }
    
    
    
}
