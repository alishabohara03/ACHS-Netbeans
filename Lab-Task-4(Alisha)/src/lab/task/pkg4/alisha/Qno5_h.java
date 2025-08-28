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
import java.util.Scanner;

public class Qno5_h{
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            FileWriter fw = new FileWriter("keyboard.txt");
            System.out.println("Enter text line by line (type 'exit' to stop):");

            String line;
            while (!(line = sc.nextLine()).equalsIgnoreCase("exit")) {
                fw.write(line + "\n");
            }

            fw.close();
            System.out.println("All text saved to file!");
        } catch (IOException e) {
            System.out.println("Error: Cannot write to file.");
        }
    }
}
