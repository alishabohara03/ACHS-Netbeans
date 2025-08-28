/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.task.pkg6.alisha;

/**
 *
 * @author asyla
 */


import java.io.*;
import java.net.*;

public class Qno1 {

    public static void main(String[] args) {
        try {
            System.out.println("=== a) URL Creation and Parsing ===");

            // Creating URLs in different ways
            URL url1 = new URL("https://www.google.com/");
            URL url2 = new URL("https://www.wikipedia.org/");

            // Printing details
            System.out.println("URL1: " + url1);
            System.out.println("Protocol: " + url1.getProtocol());
            System.out.println("Host: " + url1.getHost());
            System.out.println("File: " + url1.getFile());
            System.out.println("Port: " + url1.getPort());

            System.out.println("URL2: " + url2);
            System.out.println("Protocol: " + url2.getProtocol());
            System.out.println("Host: " + url2.getHost());
            System.out.println("File: " + url2.getFile());
            System.out.println("Port: " + url2.getPort());

            System.out.println("\n=== b) Reading Directly from URL ===");
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(url1.openStream()))) {
                for (int i = 0; i < 5; i++) { // read first 5 lines only
                    System.out.println(reader.readLine());
                }
            }

            System.out.println("\n=== c) Reading from URLConnection ===");
            URLConnection connection = url2.openConnection();
            connection.setRequestProperty("User-Agent", "Mozilla/5.0"); // avoid 403 error

            try (BufferedReader reader2 = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                for (int i = 0; i < 5; i++) { // read first 5 lines only
                    System.out.println(reader2.readLine());
                }
            }

            System.out.println("\n=== d) InetAddress Class ===");
            InetAddress address = InetAddress.getByName("www.google.com");
            System.out.println("Host Name: " + address.getHostName());
            System.out.println("IP Address: " + address.getHostAddress());

            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("Local Host: " + localHost.getHostName() + "/" + localHost.getHostAddress());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
