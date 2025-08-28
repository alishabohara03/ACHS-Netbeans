/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JDBC;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author asyla
 */

public class UpdatableResultSet {
    public static void main(String args[])throws Exception{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            java.sql.Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3307/java", "root", "root");
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            String myquery = "SELECT * FROM student";
            ResultSet rs = stmt.executeQuery(myquery);
            int id = 0,age = 0;
            String name = null;
            System.out.println("Id \t Name \t \t \t Age \n");
            while(rs.next())
            {
            id =rs.getInt(1);
            name =rs.getString(2);
            age = rs.getInt(3);
            
            
            System.out.println(id+"\t"+name+"\t \t \t"+age+"\n");
            }
            stmt.close();
            con.close();
    }
    
}
