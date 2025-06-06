/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package layout;
import javax.swing. *;
import java.awt. *;

/**
 *
 * @author asyla
 */
public class Borderlayout{
    JFrame jframe;

    Borderlayout(){
        jframe = new JFrame();
        
        JButton btn1 = new JButton("North");
        JButton btn2 = new JButton("South");
        JButton btn3 = new JButton("EAST");
        JButton btn4 = new JButton("WEST");
        JButton btn5 = new JButton("CENTER");
        
        jframe.setLayout(new BorderLayout(20, 15));
        jframe.add(btn1, BorderLayout.NORTH);
         jframe.add(btn2, BorderLayout.SOUTH);
          jframe.add(btn3, BorderLayout.EAST);
           jframe.add(btn4, BorderLayout.WEST);
            jframe.add(btn5, BorderLayout.CENTER);
            jframe.setSize(300, 300);
            jframe.setVisible(true);
            
    }
    
    public static void main(String args[])
    {
        new Borderlayout();
    }
}
