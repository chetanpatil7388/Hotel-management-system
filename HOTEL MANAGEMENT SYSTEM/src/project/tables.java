/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *                                                    
 * @author cheta
 */
public class tables {
    public static void main(String[] args)
    {
        Connection con=null;
        Statement st=null;
        try
        {
           con=connectionprovider.getCon();
           st=con.createStatement();
           st.executeUpdate("create table users(name varchar(200),email varchar(200),password varchar(200),securityQuestion varchar(500),answer varchar(200),address varchar(200),status varchar(20))");
           st.executeUpdate("create table room(roomNO varchar(10),roomType varchar(200),Bed varchar(200),price int,status varchar(20))");
          st.execute("create table customer(id int,name varchar(200),mobileNumber varchar(10),nationality varchar(200),gender varchar (20),email varchar(200),idProof varchar(200),address varchar(500),checkIn varchar(50),roomNo varchar(10),bed varchar(100),roomType varchar(200),pricePerDay  int(10),numberOfDayStay int(10),totalAmount varchar(200),checkOut varchar (50))");
           JOptionPane.showMessageDialog(null,"Table created successfully");
        }
        catch(HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        finally
        {
             try
        {
            con.close();
            st.close();
        }
        catch(SQLException e)
        {}
        }
    }
}
     
      

