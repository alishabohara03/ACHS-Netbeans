/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.task.pkg6.alisha;

/**
 *
 * @author asyla
 */


import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClient {
    public static void main(String[] args) {
        try {
            DatagramSocket clientSocket = new DatagramSocket();
            InetAddress serverAddress = InetAddress.getLocalHost();
            Scanner sc = new Scanner(System.in);

            byte[] buffer;

            while (true) {
                // Read message from user
                System.out.print("Client: ");
                String message = sc.nextLine();
                buffer = message.getBytes();

                // Send message to server
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length, serverAddress, 9999);
                clientSocket.send(packet);

                if (message.equalsIgnoreCase("bye")) {
                    System.out.println("Disconnected from server.");
                    break;
                }

                // Receive response from server
                byte[] receiveBuffer = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
                clientSocket.receive(receivePacket);
                String serverResponse = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println(serverResponse);
            }

            clientSocket.close();
            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

