/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//

//31. WAP using JDBC to
// insert a record into table using PreparedStatement.
// retrieve and display the records of table using PreparedStatement.
// delete a record of a table using PreparedStatement.
// update the record of table using PreparedStatement.
//package JDBC;

/**
 *
 * @author asyla
 */
// Q31 - JDBC CRUD operations using PreparedStatement

import java.sql.*;
import java.util.Scanner;

public class Qno3 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3307/javalab5"; // Replace with your DB name
        String user = "root"; // MySQL username
        String password = "root"; // MySQL password
        Scanner sc = new Scanner(System.in);

        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection con = DriverManager.getConnection(url, user, password);

            while (true) {
                System.out.println("\n--- JDBC PreparedStatement Demo ---");
                System.out.println("1. Insert Record");
                System.out.println("2. Display Records");
                System.out.println("3. Update Record");
                System.out.println("4. Delete Record");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");
                int choice = sc.nextInt();
                sc.nextLine(); // consume newline

                switch (choice) {
                    case 1: // Insert
                        System.out.print("Enter student ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter student name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter student age: ");
                        int age = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter student grade: ");
                        String grade = sc.nextLine();

                        String insertQuery = "INSERT INTO student (id, name, age, grade) VALUES (?, ?, ?, ?)";
                        PreparedStatement pstInsert = con.prepareStatement(insertQuery);
                        pstInsert.setInt(1, id);
                        pstInsert.setString(2, name);
                        pstInsert.setInt(3, age);
                        pstInsert.setString(4, grade);

                        int rows = pstInsert.executeUpdate();
                        if (rows > 0) System.out.println("Record inserted successfully!");
                        pstInsert.close();
                        break;

                    case 2: // Display
                        String selectQuery = "SELECT * FROM student";
                        PreparedStatement pstSelect = con.prepareStatement(selectQuery);
                        ResultSet rs = pstSelect.executeQuery();
                        System.out.println("\nID\tName\tAge\tGrade");
                        System.out.println("-------------------------------");
                        while (rs.next()) {
                            System.out.println(rs.getInt("id") + "\t" +
                                               rs.getString("name") + "\t" +
                                               rs.getInt("age") + "\t" +
                                               rs.getString("grade"));
                        }
                        rs.close();
                        pstSelect.close();
                        break;

                    case 3: // Update
                        System.out.print("Enter ID of student to update: ");
                        int updateId = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter new name: ");
                        String newName = sc.nextLine();

                        System.out.print("Enter new age: ");
                        int newAge = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter new grade: ");
                        String newGrade = sc.nextLine();

                        String updateQuery = "UPDATE student SET name=?, age=?, grade=? WHERE id=?";
                        PreparedStatement pstUpdate = con.prepareStatement(updateQuery);
                        pstUpdate.setString(1, newName);
                        pstUpdate.setInt(2, newAge);
                        pstUpdate.setString(3, newGrade);
                        pstUpdate.setInt(4, updateId);

                        int updated = pstUpdate.executeUpdate();
                        if (updated > 0) System.out.println("Record updated successfully!");
                        else System.out.println("Record not found!");
                        pstUpdate.close();
                        break;

                    case 4: // Delete
                        System.out.print("Enter ID of student to delete: ");
                        int deleteId = sc.nextInt();
                        sc.nextLine();

                        String deleteQuery = "DELETE FROM student WHERE id=?";
                        PreparedStatement pstDelete = con.prepareStatement(deleteQuery);
                        pstDelete.setInt(1, deleteId);

                        int deleted = pstDelete.executeUpdate();
                        if (deleted > 0) System.out.println("Record deleted successfully!");
                        else System.out.println("Record not found!");
                        pstDelete.close();
                        break;

                    case 5:
                        con.close();
                        System.out.println("Exiting program...");
                        return;

                    default:
                        System.out.println("Invalid choice! Try again.");
                }
            }

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found!");
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
