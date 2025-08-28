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

public class Qno5_e {
    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile("random.txt", "rw");

            // Write data
            raf.writeUTF("ALisha Bohara");

            // Move pointer to beginning
            raf.seek(0);

            // Read data
            String str = raf.readUTF();
            System.out.println("Data read: " + str);

            raf.close();
        } catch (IOException e) {
            System.out.println("Error: Cannot access file.");
        }
    }
}

