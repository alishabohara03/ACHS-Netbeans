/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author asyla
 */



    public class Qno11 extends JFrame {

    public Qno11() {
        setTitle("Qno-11 Internal Frames Demo (Alisha Bohara)");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JDesktopPane desktopPane = new JDesktopPane();
        add(desktopPane);

        // Internal Frame 1
        JInternalFrame internalFrame1 = new JInternalFrame("Internal Frame 1",
                true, true, true, true);
        internalFrame1.setSize(250, 150);
        internalFrame1.setLocation(30, 30);
        internalFrame1.setVisible(true);

        JLabel label1 = new JLabel("whybesonoisy", SwingConstants.CENTER);
        label1.setFont(new Font("Arial", Font.BOLD, 16));
        internalFrame1.add(label1);

        // Internal Frame 2
        JInternalFrame internalFrame2 = new JInternalFrame("Internal Frame 2",
                true, true, true, true);
        internalFrame2.setSize(250, 150);
        internalFrame2.setLocation(300, 80);
        internalFrame2.setVisible(true);

        JLabel label2 = new JLabel("whybesonoisy", SwingConstants.CENTER);
        label2.setFont(new Font("Arial", Font.BOLD, 16));
        internalFrame2.add(label2);

        desktopPane.add(internalFrame1);
        desktopPane.add(internalFrame2);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Qno11();
    }
}
