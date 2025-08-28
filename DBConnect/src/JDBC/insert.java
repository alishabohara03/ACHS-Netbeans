/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asyla
 */
public class insert {
    

    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/java", "root", "root");
            Statement statement=con.createStatement();
            
            System.out.println("Inserting records iinto the table ......\n");
            String sql = "INSERT INTO student VALUES(6,'Gopal', 18)";
            statement.executeUpdate(sql);
            
            System.out.println("Inserted records into the table ......\n");
            con.close();
            }catch (ClassNotFoundException ex){
                Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
            }catch (SQLException ex){
                Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
            }
    
    }
}