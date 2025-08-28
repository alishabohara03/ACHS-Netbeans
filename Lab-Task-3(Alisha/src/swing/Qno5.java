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
public class Qno5 extends JFrame implements WindowListener, ItemListener, FocusListener, KeyListener{
    private JCheckBox checkBox;
    private JTextField textField;
    private JLabel itemLabel, focusLabel, keyLabel, mouseLabel;
    private JComboBox<String> comboBox;

    public Qno5() {
        setTitle(" Qno-5 Event Handling Demo (Alisha Bohara");
        setSize(600, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Window Listener
        addWindowListener(this);

        // Item Listener (CheckBox)
        checkBox = new JCheckBox("Check me!");
        checkBox.addItemListener(this);

        // Item Listener (ComboBox)
        comboBox = new JComboBox<>(new String[]{"Option 1", "Option 2", "Option 3"});
        comboBox.addItemListener(this);

        // Focus Listener
        textField = new JTextField(15);
        textField.addFocusListener(this);

        // Key Listener
        textField.addKeyListener(this);

        // Mouse Listener using Adapter
        mouseLabel = new JLabel("Click Here");
        mouseLabel.setPreferredSize(new Dimension(150, 50));
        mouseLabel.setHorizontalAlignment(SwingConstants.CENTER);
        mouseLabel.setOpaque(true);
        mouseLabel.setBackground(Color.LIGHT_GRAY);
        mouseLabel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                mouseLabel.setText("Mouse Clicked");
            }
        });

        // Labels to display status
        itemLabel = new JLabel("Item Event: ");
        focusLabel = new JLabel("Focus Event: ");
        keyLabel = new JLabel("Key Event: ");
        
        // Add components to frame
        add(new JLabel("Text Field (Key/Focus Test):"));
        add(textField);
        add(checkBox);
        add(comboBox);
        add(mouseLabel);
        add(itemLabel);
        add(focusLabel);
        add(keyLabel);

        setVisible(true);
    }

    // ========== Window Event Methods ==========
    public void windowOpened(WindowEvent e) {
        System.out.println("Window Opened");
    }
    public void windowClosing(WindowEvent e) {
        System.out.println("Window Closing");
    }
    public void windowClosed(WindowEvent e) {
        System.out.println("Window Closed");
    }
    public void windowIconified(WindowEvent e) {
        System.out.println("Window Minimized");
    }
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window Restored");
    }
    public void windowActivated(WindowEvent e) {
        System.out.println("Window Activated");
    }
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window Deactivated");
    }

    // ========== Item Event ==========
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == checkBox) {
            itemLabel.setText("CheckBox: " + (checkBox.isSelected() ? "Checked" : "Unchecked"));
        } else if (e.getSource() == comboBox) {
            itemLabel.setText("ComboBox Selected: " + comboBox.getSelectedItem());
        }
    }

    // ========== Focus Event ==========
    public void focusGained(FocusEvent e) {
        focusLabel.setText("Focus Gained on TextField");
    }
    public void focusLost(FocusEvent e) {
        focusLabel.setText("Focus Lost from TextField");
    }

    // ========== Key Event ==========
    public void keyTyped(KeyEvent e) {}
    public void keyPressed(KeyEvent e) {
        keyLabel.setText("Key Pressed: " + e.getKeyChar());
    }
    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        new Qno5();
    }
    
}
