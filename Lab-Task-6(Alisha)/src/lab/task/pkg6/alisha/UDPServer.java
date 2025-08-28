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

public class UDPServer {
    public static void main(String[] args) {
        try {
            DatagramSocket serverSocket = new DatagramSocket(9999);
            byte[] buffer = new byte[1024];

            System.out.println("UDP Server is running...");

            while (true) {
                // Receive message from client
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                serverSocket.receive(packet);
                String clientMessage = new String(packet.getData(), 0, packet.getLength());
                System.out.println("Client says: " + clientMessage);

                if (clientMessage.equalsIgnoreCase("bye")) {
                    System.out.println("Client disconnected.");
                    break;
                }

                // Prepare response
                String serverMessage = "Server received: " + clientMessage;
                byte[] sendData = serverMessage.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(
                        sendData,
                        sendData.length,
                        packet.getAddress(),
                        packet.getPort()
                );
                serverSocket.send(sendPacket);
            }

            serverSocket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

