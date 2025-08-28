/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package DBUtil;
//
///**
// *
// * @author asyla
// */
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//
//public class DBUtil {
//    private static final String URL = "jdbc:mysql://localhost:3307/shopdb?useSSL=false&serverTimezone=UTC";
//    private static final String USER = "root";  // your MySQL username
//    private static final String PASS = "root";      // your MySQL password
//
//    public static Connection getConnection() {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            return DriverManager.getConnection(URL, USER, PASS);
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//}



package DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
    private static final String URL = "jdbc:mysql://localhost:3307/shopdb?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";  // your MySQL username
    private static final String PASS = "root";  // your MySQL password

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Optional: test connection
    public static void main(String[] args) {
        Connection con = getConnection();
        if(con != null) {
            System.out.println("Connection successful!");
        } else {
            System.out.println("Connection failed!");
        }
    }
}

