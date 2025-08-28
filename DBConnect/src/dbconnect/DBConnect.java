/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dbconnect;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;


/**
 *
 * @author asyla
 */
public class DBConnect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        try{
        
              // TODO code application logic here
              Class.forName("com.mysql.cj.jdbc.Driver");
              
              Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root");
              System.out.println("Connection sucessful:" +con);
              
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
             } catch (SQLException ex) {
          Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        
        
    }
    
    
    }
}
