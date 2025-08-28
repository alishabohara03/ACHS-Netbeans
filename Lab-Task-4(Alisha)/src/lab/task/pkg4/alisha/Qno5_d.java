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



public class Qno5_d {
    public static void main(String[] args) {

        // Step 1: Write data to a file
        try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("file.dat"))) {
            dout.writeDouble(1.1);    // write a double
            dout.writeInt(55);        // write an integer
            dout.writeBoolean(true);  // write a boolean
            dout.writeChar('4');      // write a character
            System.out.println("Data written to file.dat successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Step 2: Read data back from the file
        try (DataInputStream din = new DataInputStream(new FileInputStream("file.dat"))) {
            double d1 = din.readDouble();
            int i1 = din.readInt();
            boolean b1 = din.readBoolean();
            char ch1 = din.readChar();

            // Display the values
            System.out.println("Data read from file:");
            System.out.println("Double: " + d1);
            System.out.println("Integer: " + i1);
            System.out.println("Boolean: " + b1);
            System.out.println("Char: " + ch1);

        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
