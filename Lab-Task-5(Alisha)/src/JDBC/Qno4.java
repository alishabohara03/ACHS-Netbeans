/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JDBC;

/**
 *
 * @author asyla
 */
// Q33 - Display record using PreparedStatement

import java.sql.*;
import java.util.Scanner;

public class Qno4{
    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:mysql://localhost:3307/javalab5"; // Replace with your DB name
        String user = "root"; // MySQL username
        String password = "root"; // MySQL password

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID to search: ");
        int empId = sc.nextInt();

        String query = "SELECT * FROM salary WHERE emp_id = ?";

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection con = DriverManager.getConnection(url, user, password);

            // Create PreparedStatement
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, empId);

            // Execute query
            ResultSet rs = pst.executeQuery();

            // Display result
            if (rs.next()) {
                System.out.println("\nEmployee Details:");
                System.out.println("ID: " + rs.getInt("emp_id"));
                System.out.println("Name: " + rs.getString("emp_name"));
                System.out.println("Salary: " + rs.getDouble("emp_salary"));
            } else {
                System.out.println("No record found for Employee ID " + empId);
            }

            // Close resources
            rs.close();
            pst.close();
            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found!");
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
