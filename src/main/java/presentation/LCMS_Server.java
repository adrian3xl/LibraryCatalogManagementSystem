/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import CrudManager.ConnectionManager;
import CrudManager.EmployeeManager;
import Domain.Employee;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StreamCorruptedException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 *
 * @author Adrian
 */
public class LCMS_Server  implements Runnable {
    
    
    private ServerSocket servSock;
    private Socket connection;
    private static ObjectInputStream is;
    private static ObjectOutputStream os;  
    private EmployeeManager EmployeeMgr;  
    
       
    public LCMS_Server()
    {     
        
    }
    
   @Override
   public void run()
    {
        new Thread(this).start();
        start();
    }
    
    public void start()
    { 
       
        this.createConnection();          
        this.waitForRequests();
       
    }
    
     
    public void createConnection()
    {
        try
        {
            this.servSock = new ServerSocket(49999);
            System.out.println("Server socket established");
        }
        catch(IOException ex)
        {
            ex.printStackTrace();;
        }
        
        
    }  
        public void getStreams()
    {
        try
        {
            
            this.os = new ObjectOutputStream(connection.getOutputStream());
            this.is = new ObjectInputStream(connection.getInputStream());
            System.out.println("Server streams connected to client streams");
          
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }
     
        
    
    

    public void closeStreams()
    {
        try
        {
            os.close();
            is.close();
            connection.close();
            System.out.println("Server streams closed");
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }
    
     public void waitForRequests()
    {
        Employee employee=new Employee();
        try
        {
            while(true)
            {
                this.connection = servSock.accept(); 
                this.getStreams();
                
                    try
                    {                     
                        employee = (Employee) is.readObject();                  
                        if(!employee.getEmployeecode().equals("")&&!employee.getPassword().equals(""))
                        {
                                              
                           EmployeeMgr=new EmployeeManager();
                           Boolean exist = EmployeeMgr.validateUsernameAndPwd(employee);
                                                      
                           if(exist==true)
                           {
                               EmployeeFrame front=new EmployeeFrame();
                               front.show();
                               
                               os.writeObject("Validation success");
                           }
                           else if(exist==false)
                           {
                               os.writeObject("Employee Code or password incorrect");
                           }
                                   
                        }
                       
                    
                    }
                    catch(ClassNotFoundException ex)
                    {
                        ex.printStackTrace();
                    }
                    catch(ClassCastException ex)
                    {
                        ex.printStackTrace();
                    } catch (Exception ex) {
                    Logger.getLogger(LCMS_Server.class.getName()).log(Level.SEVERE, null, ex);
                }
               // }while(student!=null);
                this.closeStreams();
            }
        }
        catch(StreamCorruptedException sce)
        {
            System.out.println(sce.getMessage());
        }
        catch(EOFException ex)
        {
                ex.printStackTrace();
        }
        catch(IOException ex)
        {
                ex.printStackTrace();
        }
           
    }
    
    
    
    
}
