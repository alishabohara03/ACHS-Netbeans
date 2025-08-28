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

public class Qno9 extends JFrame {

    public Qno9() {
        setTitle("Qno9 Toolbar with Dialogs (Alisha Bohara)");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Toolbar
        JToolBar toolBar = new JToolBar("Toolbar");
        JButton modalBtn = new JButton("Modal Dialog");
        JButton modelessBtn = new JButton("Modeless Dialog");

        toolBar.add(modalBtn);
        toolBar.add(modelessBtn);
        add(toolBar, BorderLayout.NORTH);

        // Action for modal dialog
        modalBtn.addActionListener(e -> {
            JDialog modalDialog = new JDialog(this, "Modal Dialog", true);
            modalDialog.setSize(250, 150);
            modalDialog.setLocationRelativeTo(this);
            modalDialog.add(new JLabel("This is a Modal Dialog", SwingConstants.CENTER));
            modalDialog.setVisible(true);
        });

        // Action for modeless dialog
        modelessBtn.addActionListener(e -> {
            JDialog modelessDialog = new JDialog(this, "Modeless Dialog", false);
            modelessDialog.setSize(250, 150);
            modelessDialog.setLocationRelativeTo(this);
            modelessDialog.add(new JLabel("This is a Modeless Dialog", SwingConstants.CENTER));
            modelessDialog.setVisible(true);
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Qno9();
    }
}
