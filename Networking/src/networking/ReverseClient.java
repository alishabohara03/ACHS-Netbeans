/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networking;

import java.io.*;
import java.net.*;

/**
 *
 * @author asyla
 */
public class ReverseClient {
    
    public static void main(String[] args) {
        try {
            // Connect to the server running on localhost at port 8080
            Socket socket = new Socket("localhost", 8080);

            // Input stream to send data to the server
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            // Output stream to receive data from the server
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            // Input stream to read from the console
            BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));

            // Ask the user to enter a number
            System.out.println("Enter a number to send to the server: ");
            String number = consoleInput.readLine();

            // Send the number to the server
            out.println(number);

            // Receive the reversed number from the server
            String reversedNumber = in.readLine();
            System.out.println("Reversed number received from server: " + reversedNumber);

            // Close the streams and socket
            in.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

