/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JDBC;

/**
 *
 * @author asyla
 */
// Q34 - JDBC: Scrollable, Updatable, and Multiple ResultSet Demo

import java.sql.*;

public class Qno5 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3307/javalab5"; // Replace with your DB name
        String user = "root"; // MySQL username
        String password = "root"; // MySQL password

        try {
            // Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to database
            Connection con = DriverManager.getConnection(url, user, password);

            // -----------------------------
            // a) Scrollable ResultSet
            // -----------------------------
            System.out.println("=== Scrollable ResultSet ===");
            Statement stmt1 = con.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY
            );

            ResultSet rs1 = stmt1.executeQuery("SELECT * FROM student");

            System.out.println("Move to last row:");
            rs1.last();
            System.out.println("Last student: " + rs1.getInt("id") + " - " + rs1.getString("name"));

            System.out.println("Move to first row:");
            rs1.first();
            System.out.println("First student: " + rs1.getInt("id") + " - " + rs1.getString("name"));

            rs1.close();
            stmt1.close();

            // -----------------------------
            // b) Updatable ResultSet
            // -----------------------------
            System.out.println("\n=== Updatable ResultSet ===");
            Statement stmt2 = con.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE
            );

            ResultSet rs2 = stmt2.executeQuery("SELECT * FROM student WHERE id=1");

            if (rs2.next()) {
                System.out.println("Before update: " + rs2.getString("name"));
                rs2.updateString("name", "Lisa"); // Update name
                rs2.updateRow(); // Commit update
                System.out.println("Record updated successfully.");
            }

            // Verify update
            rs2.beforeFirst();
            while (rs2.next()) {
                System.out.println("ID: " + rs2.getInt("id") + ", Name: " + rs2.getString("name"));
            }

            rs2.close();
            stmt2.close();

            // -----------------------------
            // c) Multiple ResultSet
            // -----------------------------
            System.out.println("\n=== Multiple ResultSet ===");
            Statement stmt3 = con.createStatement();

            // First ResultSet
            ResultSet rs3a = stmt3.executeQuery("SELECT * FROM student WHERE age > 20");
            System.out.println("Students with age > 20:");
            while (rs3a.next()) {
                System.out.println(rs3a.getInt("id") + " - " + rs3a.getString("name") + " - " + rs3a.getInt("age"));
            }
            rs3a.close();

            // Second ResultSet
            ResultSet rs3b = stmt3.executeQuery("SELECT * FROM student WHERE grade='A'");
            System.out.println("\nStudents with grade A:");
            while (rs3b.next()) {
                System.out.println(rs3b.getInt("id") + " - " + rs3b.getString("name") + " - " + rs3b.getString("grade"));
            }
            rs3b.close();

            stmt3.close();
            con.close();

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found!");
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
