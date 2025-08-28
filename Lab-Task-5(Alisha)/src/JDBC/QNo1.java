/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JDBC;

/**
 *
 * @author asyla
 */
//public class QNo1 {
//    
//}



import java.sql.*;

public class QNo1 {

    public static void main(String[] args) {
        // Database connection details
        String url = "jdbc:mysql://localhost:3307/javalab5"; // your DB name
        String user = "root"; // DB username
        String password = "root"; // DB password

        try {
            // 1. Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish connection
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database successfully!");

            // 3. Create a Statement object
            Statement stmt = con.createStatement();

            // 4. Execute query to read all data from 'student' table
            String query = "SELECT * FROM student";
            ResultSet rs = stmt.executeQuery(query);

            // 5. Display table data
            System.out.println("ID\tName\tAge\tGrade");
            System.out.println("----------------------------");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String grade = rs.getString("grade");

                System.out.println(id + "\t" + name + "\t" + age + "\t" + grade);
            }

            // 6. Close all resources
            rs.close();
            stmt.close();
            con.close();

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found! " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        }
    }
}
