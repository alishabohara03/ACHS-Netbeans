/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

/**
 *
 * @author asyla
 */
public class Qno10 extends JFrame {

    JButton fileChooserBtn, colorChooserBtn;
    JLabel selectedFileLabel;
    JPanel colorPanel;

    public Qno10() {
        setTitle("Qno10 File and Color Chooser (Alisha Bohara)");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        fileChooserBtn = new JButton("File Chooser");
        colorChooserBtn = new JButton("Color Chooser");

        selectedFileLabel = new JLabel("Selected file will appear here.");
        colorPanel = new JPanel();
        colorPanel.setPreferredSize(new Dimension(100, 100));
        colorPanel.setBackground(Color.LIGHT_GRAY);

        // File chooser button action
        fileChooserBtn.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                selectedFileLabel.setText("Selected File: " + selectedFile.getAbsolutePath());
            }
        });

        // Color chooser button action
        colorChooserBtn.addActionListener(e -> {
            Color color = JColorChooser.showDialog(this, "Choose a Color", colorPanel.getBackground());
            if (color != null) {
                colorPanel.setBackground(color);
            }
        });

        add(fileChooserBtn);
        add(colorChooserBtn);
        add(selectedFileLabel);
        add(colorPanel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Qno10();
    }
}
