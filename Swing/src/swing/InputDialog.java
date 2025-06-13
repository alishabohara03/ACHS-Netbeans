/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;
import javax.swing. *;
/**
 *
 * @author asyla
 */
public class InputDialog {
    JFrame f;
    InputDialog() {
        f= new JFrame();
        String name= JOptionPane.showInputDialog(f, "Enter Name");
        
    }
    public static void main(String[] args) 
    {
        new InputDialog();
    }
    
}
