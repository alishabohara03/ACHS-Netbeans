/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.task.pkg6.alisha;

/**
 *
 * @author asyla
 */


import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {
    public static void main(String[] args) {
        int port = 3777; // server port

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server started. Waiting for client...");

            Socket socket = serverSocket.accept(); // accept client
            System.out.println("Client connected.");

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            Scanner in = new Scanner(socket.getInputStream());
            Scanner serverInput = new Scanner(System.in);

            String serverMsg, clientMsg;

            do {
                // Send message to client
                System.out.print("Server: ");
                serverMsg = serverInput.nextLine();
                out.println(serverMsg);

                // Receive message from client
                clientMsg = in.nextLine();
                System.out.println("\tClient: " + clientMsg);

            } while (!clientMsg.equalsIgnoreCase("buy")); // exit condition

            System.out.println("Connection closed.");

            // Close streams
            out.close();
            in.close();
            serverInput.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

