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
public class Qno12 extends JFrame {

    public Qno12() {
        setTitle("Qno-12 JOptionPane Dialog Demo (Alisha Bohara)");
        setSize(450, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Use GridLayout for buttons
        setLayout(new GridLayout(7, 1, 10, 10));

        // Information Dialog button
        JButton infoBtn = new JButton("Information Dialog");
        infoBtn.addActionListener(e -> JOptionPane.showMessageDialog(
                this, "This is an information message.", "Information",
                JOptionPane.INFORMATION_MESSAGE));

        // Question Dialog button
        JButton questionBtn = new JButton("Question Dialog");
        questionBtn.addActionListener(e -> JOptionPane.showMessageDialog(
                this, "Is this a question dialog?", "Question",
                JOptionPane.QUESTION_MESSAGE));

        // Error Dialog button
        JButton errorBtn = new JButton("Error Dialog");
        errorBtn.addActionListener(e -> JOptionPane.showMessageDialog(
                this, "An error occurred!", "Error",
                JOptionPane.ERROR_MESSAGE));

        // Warning Dialog button
        JButton warningBtn = new JButton("Warning Dialog");
        warningBtn.addActionListener(e -> JOptionPane.showMessageDialog(
                this, "This is a warning!", "Warning",
                JOptionPane.WARNING_MESSAGE));

        // Confirm Dialog button
        JButton confirmBtn = new JButton("Confirm Dialog");
        confirmBtn.addActionListener(e -> {
            int result = JOptionPane.showConfirmDialog(
                    this, "Do you want to continue?", "Confirm",
                    JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(this, "You selected YES.");
            } else {
                JOptionPane.showMessageDialog(this, "You selected NO.");
            }
        });

        // Input Dialog button
        JButton inputBtn = new JButton("Input Dialog");
        inputBtn.addActionListener(e -> {
            String input = JOptionPane.showInputDialog(
                    this, "Please enter your name:", "Input Dialog",
                    JOptionPane.PLAIN_MESSAGE);
            if (input != null && !input.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Hello, " + input + "!");
            }
        });

        // Option Dialog button
        JButton optionBtn = new JButton("Option Dialog");
        optionBtn.addActionListener(e -> {
            String[] options = {"Red", "Green", "Blue", "Cancel"};
            int choice = JOptionPane.showOptionDialog(
                    this, "Choose your favorite color:",
                    "Option Dialog",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    options,
                    options[0]);
            if (choice >= 0 && choice < options.length - 1) {
                JOptionPane.showMessageDialog(this,
                        "You chose: " + options[choice]);
            } else {
                JOptionPane.showMessageDialog(this, "No color selected.");
            }
        });

        // Add buttons to frame
        add(infoBtn);
        add(questionBtn);
        add(errorBtn);
        add(warningBtn);
        add(confirmBtn);
        add(inputBtn);
        add(optionBtn);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Qno12::new);
    }
}

