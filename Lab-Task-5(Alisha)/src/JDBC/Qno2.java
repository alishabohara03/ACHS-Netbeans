/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JDBC;

/**
 *
 * @author asyla
 */
// Q29 - Insert values into MySQL table from console

// Q29 - Insert values into MySQL table including grade

import java.sql.*;
import java.util.Scanner;

public class Qno2 {
    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:mysql://localhost:3307/javalab5"; // Replace with your DB name
        String user = "root"; // Your MySQL username
        String password = "root"; // Your MySQL password

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println("Enter student name: ");
        String name = sc.nextLine();

        System.out.println("Enter student age: ");
        int age = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println("Enter student grade: ");
        String grade = sc.nextLine();

        String insertQuery = "INSERT INTO student (id, name, age, grade) VALUES (?, ?, ?, ?)";

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection con = DriverManager.getConnection(url, user, password);

            // Create PreparedStatement
            PreparedStatement pst = con.prepareStatement(insertQuery);
            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setInt(3, age);
            pst.setString(4, grade);

            // Execute insertion
            int rows = pst.executeUpdate();
            if (rows > 0) {
                System.out.println("Record inserted successfully!");
            }

            // Close resources
            pst.close();
            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found!");
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
