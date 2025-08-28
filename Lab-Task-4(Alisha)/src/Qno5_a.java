/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author asyla
 */
//Q14a
import java.io.*;

public class Qno5_a {
    public static void main(String[] args) {
        try {
            // Open the file "input.txt" for reading
            FileInputStream fis = new FileInputStream("input.txt");
            
            int ch;
            System.out.println("Reading file content:");
            // Read one byte at a time until end of file
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch); // Convert byte to character
            }
            
            fis.close(); // Close the file
        } catch (IOException e) {
            System.out.println("Error: File not found or cannot be read.");
        }
    }
}
