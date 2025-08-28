/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;
import javax.swing.*;
import java.awt.event.*;



/**
 *
 * @author asyla
 */


class ExternalHandler implements ActionListener {
    private JTextField textField;

    public ExternalHandler(JTextField tf) {
        this.textField = tf;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        textField.setText("Handled in External Class");
    }
}
public class Qno3 extends JFrame implements ActionListener {
    private JButton btnSameClass;
    private JButton btnInnerClass;
    private JButton btnAnonymous;
    private JButton btnExternal;
    private JTextField textField;

    public Qno3() {
        setTitle(" Qno-3 Event Handling Demo (Alisha Bohara)");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        textField = new JTextField();
        textField.setBounds(50, 20, 300, 30);
        add(textField);

        // Button for 1st style - event handler within same class
        btnSameClass = new JButton("Same Class");
        btnSameClass.setBounds(50, 70, 140, 30);
        btnSameClass.addActionListener(this);  // 'this' is the event handler
        add(btnSameClass);

        // Button for 2nd style - event handler within inner class
        btnInnerClass = new JButton("Inner Class");
        btnInnerClass.setBounds(210, 70, 140, 30);
        btnInnerClass.addActionListener(new InnerHandler());
        add(btnInnerClass);

        // Button for 3rd style - anonymous inner class
        btnAnonymous = new JButton("Anonymous Inner");
        btnAnonymous.setBounds(50, 120, 140, 30);
        btnAnonymous.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("Handled in Anonymous Inner Class");
            }
        });
        add(btnAnonymous);

        // Button for 4th style - separate class
        btnExternal = new JButton("External Class");
        btnExternal.setBounds(210, 120, 140, 30);
        btnExternal.addActionListener(new ExternalHandler(textField));
        add(btnExternal);

        setVisible(true);
    }

    // 1st style: event handler logic in same class
    @Override
    public void actionPerformed(ActionEvent e) {
        textField.setText("Handled in Same Class");
    }

    // 2nd style: inner class event handler
    class InnerHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField.setText("Handled in Inner Class");
        }
    }

    public static void main(String[] args) {
        new Qno3();
    }
    
    
}
