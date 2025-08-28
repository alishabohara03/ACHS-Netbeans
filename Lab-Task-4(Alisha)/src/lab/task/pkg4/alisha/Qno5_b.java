/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.task.pkg4.alisha;

/**
 *
 * @author asyla
 */
//public class Qno5_b {
//    
//}
import java.io.*;
import java.util.Scanner;

public class Qno5_b {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter text to write in file: ");
            String text = sc.nextLine();

            // Create or overwrite file "output.txt"
            FileOutputStream fos = new FileOutputStream("output.txt");
            fos.write(text.getBytes()); // Convert text to bytes and write
            fos.close();

            System.out.println("Text saved successfully!");
        } catch (IOException e) {
            System.out.println("Error: Cannot write to file.");
        }
    }
}
