/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author asyla
 */
public class Qno6 extends JFrame {

    private int x = 100, y = 100; // Initial image position
    private Image image;

    public Qno6() {
        setTitle(" Qno-6 Move Image with Arrow Keys (Alisha Bohara)");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Load image
        image = new ImageIcon(getClass().getResource("ball.jpeg")).getImage();

        DrawingPanel panel = new DrawingPanel();
        add(panel);
        
        // Add key listener to the panel
        panel.setFocusable(true);                      // Important: Allow panel to receive key events
        panel.requestFocusInWindow();                  // Request focus so it receives key presses
        panel.setFocusTraversalKeysEnabled(false);     // Prevent arrow keys from changing focus

        panel.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int code = e.getKeyCode();
                if (code == KeyEvent.VK_LEFT) {
                    x -= 10;
                } else if (code == KeyEvent.VK_RIGHT) {
                    x += 10;
                } else if (code == KeyEvent.VK_UP) {
                    y -= 10;
                } else if (code == KeyEvent.VK_DOWN) {
                    y += 10;
                }
                panel.repaint();
            }
        });

        setVisible(true);
    }

    // Inner panel class to draw image
    class DrawingPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(image, x, y, 50, 50, this); // Draw the image at (x, y)
        }
    }

    public static void main(String[] args) {
        new Qno6();
    }

    }