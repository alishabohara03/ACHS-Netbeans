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

public class Qno5_c {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("input.jpg");   // Source image
            FileOutputStream fos = new FileOutputStream("copy.jpg");   // Destination image

            byte[] buffer = new byte[1024]; // Read 1024 bytes at a time
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            fis.close();
            fos.close();

            System.out.println("Image copied successfully!");
        } catch (IOException e) {
            System.out.println("Error: Cannot copy image.");
        }
    }
}

