/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author asyla
 */
class Calculator extends Frame implements ActionListener, WindowListener {

    Label lb1, lb2, lb3;
    TextField text1, text2, text3;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7;

    public Calculator() {

        lb1 = new Label("First Number");
        lb2 = new Label("Second Number");
        lb3 = new Label("Result");

        text1 = new TextField(10);
        text2 = new TextField(10);
        text3 = new TextField(10);

        this.addWindowListener(this);
        btn1 = new Button("Add");
        btn2 = new Button("Sub");
        btn3 = new Button("Multi");
        btn4 = new Button("Div");
        btn5 = new Button("Mod");
        btn6 = new Button("Clear");
        btn7 = new Button("Exit");

        setLayout(new FlowLayout());

        add(lb1);
        add(text1);
        add(lb2);
        add(text2);
        add(lb3);
        add(text3);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btn7);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);

        setSize(300, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(text1.getText());
        int b = Integer.parseInt(text2.getText());

        if (e.getSource() == btn1)
            text3.setText(String.valueOf(a + b));
        else if (e.getSource() == btn2)
            text3.setText(String.valueOf(a - b));
        else if (e.getSource() == btn3)
            text3.setText(String.valueOf(a * b));
        else if (e.getSource() == btn4)
            text3.setText(String.valueOf(a / b));
        else if (e.getSource() == btn5)
            text3.setText(String.valueOf(a % b));
        else if (e.getSource() == btn6) {
            text1.setText("");
            text2.setText("");
            text3.setText("");
        } else if (e.getSource() == btn7) {
            System.exit(0);
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {}

    @Override
    public void windowClosing(WindowEvent e) {
        dispose(); // Closes the window properly
    }

    @Override
    public void windowClosed(WindowEvent e) {}

    @Override
    public void windowIconified(WindowEvent e) {}

    @Override
    public void windowDeiconified(WindowEvent e) {}

    @Override
    public void windowActivated(WindowEvent e) {}

    @Override
    public void windowDeactivated(WindowEvent e) {}

    public static void main(String[] args) {
        new Calculator();
    }
}
