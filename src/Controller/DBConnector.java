/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Tahmid Abir
 */
public class DBConnector {
    private static Connection conn;
    
    static{
    try{
    
        Class.forName("com.mysql.jdbc.Driver");
        conn =(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/patient","root","@Abirahmed8487");
    }
    catch(Exception e)
    {
    JOptionPane.showMessageDialog(null,e);
    }
    }
    public static Connection getCon(){
    return conn;
    }
    

}
        
    

