/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;

/**
 *
 * @author juned
 */
public class ConnectionProvider {
    public static Connection geCon()
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","326681");
            return con;
        } 
        catch (Exception e) 
        {
            System.out.println(e);
            return null;
        }
    }
    
}
