/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;
//import CrudManager.ConnectionManager;
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
import java.net.InetAddress;
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
public class LCMS_Client {
    
    private Socket connection;
    private static ObjectInputStream is;
    private static ObjectOutputStream os;  
    
    
     public LCMS_Client(int port)
    {     
        
    }
    
    
     
      
    public void createConnection()
    {
        try
        {
          connection= new Socket(InetAddress.getLocalHost(),49999);
        }
        catch(IOException ex)
        {
            ex.printStackTrace();;
        } 
    }  
    
    
    public void closeConnection()
    {
        try
    {
          os.close();
          is.close();
         connection.close();  
    }
    catch(IOException ex)
    {
      ex.printStackTrace();
      ex.getMessage();
    }

    }

    
    
    public void getStreams()
    {
        try
        {
            
            this.os = new ObjectOutputStream(connection.getOutputStream());
            this.is = new ObjectInputStream(connection.getInputStream());
            System.out.println("Client streams connected to Server streams");
          
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }
   
    /*
    public void sendAction(String action){
        
        
        try{
            
            os.writeObject(action);
            
        }
        catch(IOException ex){
            
            ex.printStackTrace();
        }
    }
    
*/

    public void sendEmpllogin(Employee obj){
        
        try{
            
            os.writeObject(obj);
        }
        catch(IOException ex){
            
            ex.printStackTrace();
        }
    }
    
    
    
    public void receiveResponse()
{
try
    {
      Boolean flag = (Boolean)is.readObject();
    }
catch(ClassCastException ex)
{
    ex.printStackTrace();
}
catch(ClassNotFoundException ex)
{
    ex.printStackTrace();

}
    catch(IOException ex)
            
 
            
{   
    
    ex.printStackTrace();
}
            
}

  

public static void main(String[] args) 
{ 
     LCMS_Client lcms_client = new LCMS_Client(49999); 
//     lcms_client.sendAction("Login");
//    lcms_client.receiveResponse();
  }


    
    
}
