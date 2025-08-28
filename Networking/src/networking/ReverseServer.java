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
public class ReverseServer {
    
    public static void main(String[] args) {
        try {
            // Create a server socket listening on port 8080
            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("Server is listening on port 8080...");

            // Wait for a client connection
            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");

            // Input stream to receive data from the client
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            // Output stream to send data to the client
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Read the number from the client
            String number = in.readLine();
            System.out.println("Received number from client: " + number);

            // Reverse the number
            String reversedNumber = new StringBuilder(number).reverse().toString();

            // Send the reversed number back to the client
            out.println(reversedNumber);
            System.out.println("Sent reversed number to client: " + reversedNumber);

            // Close the streams and socket
            in.close();
            out.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
