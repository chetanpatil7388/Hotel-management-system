/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
/**
 *
 * @author cheta
 */
import java.sql.*;
public class connectionprovider {
    public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","scott");
            return con;
        }
    catch (ClassNotFoundException | SQLException e)
    {
          
       return null;   
    } 
  }
}
