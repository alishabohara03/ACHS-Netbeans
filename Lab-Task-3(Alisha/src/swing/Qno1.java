/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;

/**
 *
 * @author asyla
 */

public class Qno1 extends JFrame {

    JLabel labelWithIcon, nameLabel;
    JTextField textField;
    JTextArea textArea;
    JScrollPane scrollPane;
    JCheckBox checkBox;
    JPasswordField passwordField;
    JRadioButton radioMale, radioFemale;
    JButton pushButton;
    JComboBox<String> comboBox;

    public Qno1() {
        setTitle("Qno1 - Swing Components Demo (Alisha Bohara)");

        // Set custom logo icon (from same package)
        java.net.URL logoURL = getClass().getResource("/swing/logo.png");
        if (logoURL != null) {
            ImageIcon logoIcon = new ImageIcon(logoURL);
            setIconImage(logoIcon.getImage());
        }

        setLayout(null);
        setSize(550, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Label with icon
        labelWithIcon = new JLabel();
        java.net.URL userImageURL = getClass().getResource("/swing/user.png");
        if (userImageURL != null) {
            ImageIcon userIcon = new ImageIcon(userImageURL);
            Image scaled = userIcon.getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH);
            labelWithIcon.setIcon(new ImageIcon(scaled));
        } else {
            labelWithIcon.setText("Image not found");
        }
        labelWithIcon.setBounds(30, 20, 64, 64);
        add(labelWithIcon);

        // Label displaying name
        nameLabel = new JLabel("Name: Alisha Bohara");
        nameLabel.setFont(new Font("Arial", Font.BOLD, 16));
        nameLabel.setBounds(110, 40, 250, 20);
        add(nameLabel);

        // Text field with colorful line border and tooltip
        textField = new JTextField();
        textField.setBounds(30, 100, 300, 30);
        textField.setToolTipText("Enter your text here");
        textField.setBorder(new LineBorder(Color.BLUE, 2));
        add(textField);

        // Text area with scroll bars
        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(30, 150, 400, 100);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        add(scrollPane);

        // Check box
        checkBox = new JCheckBox("Accept Terms and Conditions");
        checkBox.setBounds(30, 270, 250, 25);
        add(checkBox);

        // Password field
        passwordField = new JPasswordField();
        passwordField.setBounds(30, 310, 300, 30);
        passwordField.setToolTipText("Enter your password");
        add(passwordField);

        // Radio buttons
        radioMale = new JRadioButton("Male");
        radioFemale = new JRadioButton("Female");
        radioMale.setBounds(30, 350, 80, 30);
        radioFemale.setBounds(120, 350, 80, 30);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(radioMale);
        genderGroup.add(radioFemale);
        add(radioMale);
        add(radioFemale);

        // Push button
        pushButton = new JButton("Submit");
        pushButton.setBounds(30, 400, 100, 30);
        add(pushButton);

        // Combo box
        String[] countries = {"Nepal", "India", "USA", "UK"};
        comboBox = new JComboBox<>(countries);
        comboBox.setBounds(150, 400, 150, 30);
        add(comboBox);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Qno1();
    }
}