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
 *4 ~~~`
 * @author asyla
 */
public class JDBC {
    
  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/java", "root", "root");
            Statement statement=con.createStatement();
            
            String createTableQuery = "CREATE TABLE IF NOT EXISTS student("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "name VARCHAR(255),"
                    + "age INT)";
            
            statement.executeUpdate(createTableQuery);
            
            System.out.println("Table created succsessfully");
        con.close();
        } catch (ClassNotFoundException ex){
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }catch (SQLException ex){
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }
}