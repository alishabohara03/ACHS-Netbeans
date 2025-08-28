/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.task.pkg4.alisha;

/**
 *
 * @author asyla
 */
import java.io.*;

public class Qno5_f {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("input.txt");
            int ch;

            System.out.println("File content:");
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();
        } catch (IOException e) {
            System.out.println("Error: Cannot read file.");
        }
    }
}

