/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.librarycatalogmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
 

/**
 *
 * @author Adrian
 */
public class librarycatalogmanagementsystemJDBCmain {
   
    public static Statement getTheStatement()
    {
        String connString="jdbc:mysql://localhost:3306/librarycatalogmanagementsystem";
        String userName="root";
        String pwd="adrian3xl";
        Statement state=null;
        Connection conn;
              
       
         try {
	       Class.forName("com.mysql.jdbc.Driver"); //load JDBC Driver
               conn = DriverManager.getConnection(connString,userName,pwd);
               state= conn.createStatement();
               
         } catch(Exception ex) {System.out.print(ex.toString()); }
        
       return state;  
         
    }
    
public static void main(String[] args) {
        
      Scanner scan = new Scanner(System.in); 
         
         int select=-1;        
        while(select!=5){
            System.out.println("Create, update or Delete ?\n\n"
                + "1 - Create\n"
                + "2 - Update\n"
                + "3 - Delete\n"
                + "4 - Select\n"
                + "5 - End");
            select=scan.nextInt();
            
}
     }
}

