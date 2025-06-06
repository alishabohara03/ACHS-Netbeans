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
    public class flowlayout {

    JFrame frameObj = new JFrame();

    JButton b1 = new JButton("A");
    JButton b2 = new JButton("B");
    JButton b3 = new JButton("C");
    JButton b4 = new JButton("D");
    JButton b5 = new JButton("E");
    JButton b6 = new JButton("F");
    JButton b7 = new JButton("G");
    JButton b8 = new JButton("H");
    JButton b9 = new JButton("I");
    JButton b10 = new JButton("J");

    public flowlayout() {
        frameObj.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 25)); // Set layout first

        frameObj.add(b1); frameObj.add(b2); frameObj.add(b3); frameObj.add(b4);
        frameObj.add(b5); frameObj.add(b6); frameObj.add(b7); frameObj.add(b8);
        frameObj.add(b9); frameObj.add(b10);

        frameObj.setSize(300, 300);
        frameObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameObj.setVisible(true);
    }

    public static void main(String[] args) {
        new flowlayout();
    }
}
    