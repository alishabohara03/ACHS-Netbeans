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

public class Qno5_g {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter text to save: ");
            String text = sc.nextLine();

            FileWriter fw = new FileWriter("output.txt");
            fw.write(text);
            fw.close();

            System.out.println("Text written to file successfully!");
        } catch (IOException e) {
            System.out.println("Error: Cannot write file.");
        }
    }
}


