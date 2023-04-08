/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Georgi
 */
import java.sql.*;
import javax.swing.*;

public class javaconnect 
{   
    Connection conn = null;
    public static Connection ConnecrDb()
    {
        try
        {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Software\\files\\ProMA_DB.sqlite" );
           // JOptionPane.showMessageDialog(null, "Connecting to database..... Done");
            return conn;
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
