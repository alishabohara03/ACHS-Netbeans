/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;
import javax.swing. *;

/**
 *
 * @author asyla
 */
public class Frametest {
     public static void main(String[] args) {
         JFrame frame
                 = new JFrame();
         
         JButton button = new JButton(
                "Click Me");
         
         button.setBounds(
                 150, 200, 220, 50
         );
         
         frame.add(button);
         frame.setSize(500, 600);
         frame.setLayout(null);
         frame.setVisible(true);
     }
}
