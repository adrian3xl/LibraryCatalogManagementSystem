/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.JDBCImplement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Adrian Bailey
 */
public class JDBCMainConfiguration {
    private static final String conString = "jdbc:mysql://localhost:3306/librarycatalogmanagement_db";
    private static final String dbUser = "root";
    private static final String dbUserPWD = "adrian3xl";
    
    private Connection con;
    
    protected Connection getConnection() throws SQLException
    {
        con=DriverManager.getConnection(conString,dbUser,dbUserPWD);
        
        return con;
    }
}
