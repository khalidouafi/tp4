/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class ConnexionJdbc {
    String url="jdbc:mysql://localhost/supdecoDB";
    String user  ="root";
    String pwd="";
    Connection co=null;
    public Statement st=null;
    public void connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnexionJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
          co=    DriverManager.getConnection(url, user, pwd);
        } catch (SQLException ex) {
            Logger.getLogger(ConnexionJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
           st= co.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(ConnexionJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
