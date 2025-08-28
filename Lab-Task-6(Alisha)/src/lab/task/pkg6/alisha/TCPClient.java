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
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
    public static void main(String[] args) {
        int port = 3777;
        String ip = "localhost"; // server IP

        try {
            Socket socket = new Socket(ip, port);
            System.out.println("Connected to server.");

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            Scanner in = new Scanner(socket.getInputStream());
            Scanner clientInput = new Scanner(System.in);

            String serverMsg, clientMsg;

            do {
                // Receive message from server
                serverMsg = in.nextLine();
                System.out.println("\tServer: " + serverMsg);

                // Send message to server
                System.out.print("Client: ");
                clientMsg = clientInput.nextLine();
                out.println(clientMsg);

            } while (!clientMsg.equalsIgnoreCase("buy")); // exit condition

            System.out.println("Connection closed.");

            // Close streams
            out.close();
            in.close();
            clientInput.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

