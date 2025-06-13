/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;
import javax.swing.*;

/**
 *
 * @author asyla
 */
public class TableExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java Table");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        String[] [] data = {
            {"101", "Alice", "Computer Science"},
            {"102", "Bob", "CElectrical"},
            {"103", "Charlie", "Mechanical"},
            
            {"101", "Alice", "Computer Science"},
            {"102", "Bob", "CElectrical"},
            {"103", "Charlie", "Mechanical"},
            
            {"101", "Alice", "Computer Science"},
            {"102", "Bob", "CElectrical"},
            {"103", "Charlie", "Mechanical"},
            
            {"101", "Alice", "Computer Science"},
            {"102", "Bob", "CElectrical"},
            {"103", "Charlie", "Mechanical"},
            {"101", "Alice", "Computer Science"},
            {"102", "Bob", "CElectrical"},
            {"103", "Charlie", "Mechanical"},
            {"101", "Alice", "Computer Science"},
            {"102", "Bob", "CElectrical"},
            {"103", "Charlie", "Mechanical"},
            {"101", "Alice", "Computer Science"},
            {"102", "Bob", "CElectrical"},
            {"103", "Charlie", "Mechanical"},
            {"101", "Alice", "Computer Science"},
            {"102", "Bob", "CElectrical"},
            {"103", "Charlie", "Mechanical"},
            
        };
        
        String[] columnNames = {"ID", "Name", "Department"};
        JTable table = new JTable(data, columnNames);
        
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);
        frame.setVisible(true);
    }
    
}
