/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudManager;
import Domain.Customer;
import java.util.ArrayList;
import java.util.List;
import Service.Factory;
import Service.ICustomerService;
import Service.Exceptions.ServiceLoadException;
import Service.ICustomerServiceJDBC;
import java.sql.ResultSet;
import org.apache.log4j.Logger;
/**
 *
 * @author Adrian
 */
public class CustomerJDBCManager {
       final static Logger logger = Logger.getLogger(CustomerJDBCManager.class); 
    
public void addCustomerJDBC(Customer anCustomer)
    {
        try {
            logger.info("In Business Layer addCustomer(Customer Customer) method");
            System.out.println("In Business Layer addCustomer(Customer Customer) method");
            Factory factory = new Factory();            
            ICustomerServiceJDBC iCustomerMgrJDBC = (ICustomerServiceJDBC) factory.getTheService(ICustomerServiceJDBC.NAME);
            iCustomerMgrJDBC.addCustomerJDBC(anCustomer);
            
        } catch (ServiceLoadException ex) {
         System.out.println(ex.getMessage());
           
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
           logger.error(ex.getMessage());
        }
    }
    public Customer getCustomerJDBC(int customerId)
    {
        Customer anCustomer=new Customer();
        try {
             logger.info("In Business Layer getCustomerJDBC(int customerId) method");
            System.out.println("In Business Layer getCustomerJDBC(int customerId) method");
            Factory factory = new Factory();           
            ICustomerServiceJDBC iCustomerMgrJDBC = (ICustomerServiceJDBC) factory.getTheService(ICustomerServiceJDBC.NAME);
            anCustomer=iCustomerMgrJDBC.getCustomerJDBC(customerId);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
             logger.error(ex.getMessage());
        }
        return anCustomer;
    }
    
    public void updateCustomerJDBC(Customer anCustomer)
    {
        try {
            logger.info("In Business Layer  updateCustomerJDBC(Customer anCustomer) method");
            System.out.println("In Business Layer  updateCustomerJDBC(Customer anCustomer) method");
            Factory factory = new Factory();            
            ICustomerServiceJDBC iCustomerMgrJDBC = (ICustomerServiceJDBC) factory.getTheService(ICustomerServiceJDBC.NAME);
            iCustomerMgrJDBC.updateCustomerJDBC(anCustomer);
            
        } catch (ServiceLoadException ex) {
          
           System.out.println(ex.getMessage()); 
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
            logger.error(ex.getMessage());
        }
    }
    
    public ResultSet getAllCustomerJDBC()
    {
        ResultSet rs=null;
        List<Customer> CustomerList = new ArrayList<>();
        try {
            logger.info("In Business Layer getAllCustomer JDBC method");
            System.out.println("In Business Layer getAllCustomer JDBC method");
            Factory factory = new Factory();
            ICustomerServiceJDBC iCustomerMgrJDBC = (ICustomerServiceJDBC) factory.getTheService(ICustomerServiceJDBC.NAME);
            rs=iCustomerMgrJDBC.getAllCustomerJDBC();
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());   
             logger.error(ex.getMessage());
        }
        return rs;
    }
    
    
    public void deleteCustomerJDBC(int customerId)
    {
        try {
            logger.info("In Business Layer delete Customer JDBC method");
            System.out.println("In Business Layer delete Customer JDBC method");
            Factory factory = new Factory();
            ICustomerServiceJDBC iCustomerMgrJDBC = (ICustomerServiceJDBC) factory.getTheService(ICustomerServiceJDBC.NAME);
            iCustomerMgrJDBC.deleteCustomerJDBC(customerId);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            
            System.out.println(ex.getMessage());
             logger.error(ex.getMessage());
        }
    }

    public CustomerJDBCManager() {
    }
    
    
    
}

