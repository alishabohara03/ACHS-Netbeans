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
public class Qno4 extends JFrame {

    private JTextField text1, text2;
    private JLabel resultLabel;

    public Qno4() {
        setTitle("Qno4 - Calculator with Icons (Alisha Bohara)");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        JLabel label1 = new JLabel("Enter Number 1:");
        gbc.gridx = 0; gbc.gridy = 0;
        add(label1, gbc);

        text1 = new JTextField(10);
        gbc.gridx = 1;
        add(text1, gbc);

        JLabel label2 = new JLabel("Enter Number 2:");
        gbc.gridx = 2;
        add(label2, gbc);

        text2 = new JTextField(10);
        gbc.gridx = 3;
        add(text2, gbc);

       JButton addButton = new JButton(new ImageIcon("add.png"));
       JButton subButton = new JButton(new ImageIcon("minus.png"));

       JButton mulButton = new JButton(new ImageIcon("cancel.png"));



        
        gbc.gridx = 0; gbc.gridy = 1;
        add(addButton, gbc);
        gbc.gridx = 1;
        add(subButton, gbc);
        gbc.gridx = 2;
        add(mulButton, gbc);

        resultLabel = new JLabel("Result: ");
        resultLabel.setFont(new Font("Arial", Font.BOLD, 16));
        gbc.gridx = 0; gbc.gridy = 2;
        gbc.gridwidth = 4;
        add(resultLabel, gbc);

        addButton.addActionListener(e -> calculate('+'));
        subButton.addActionListener(e -> calculate('-'));
        mulButton.addActionListener(e -> calculate('*'));

        setVisible(true);
    }

    private JButton createIconButton(String iconPath, String fallbackText) {
        ImageIcon icon = new ImageIcon(iconPath);
        JButton button = new JButton(fallbackText, icon);
        button.setVerticalTextPosition(SwingConstants.BOTTOM);
        button.setHorizontalTextPosition(SwingConstants.CENTER);
        return button;
    }

    private void calculate(char op) {
        try {
            double num1 = Double.parseDouble(text1.getText());
            double num2 = Double.parseDouble(text2.getText());
            double result = 0;

            switch (op) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
            }

            resultLabel.setText("Result: " + result);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid real numbers.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new Qno4();
    }
}
