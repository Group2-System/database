/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DATABASE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author sharon
 */
public class ConnectMsAccess {
    
    public static Connection conn () {

        try{
        String url = "jdbc:ucanaccess://C;//Users//sharon//Documents//Database1.accdb";
        Connection conn = DriverManager.getConnection(url);
        return conn;
    }
    catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    }
    return null;    
    }
}
