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
public class CustomerManager {
     final static Logger logger = Logger.getLogger(CustomerManager.class); 
public void addCustomer(Customer anCustomer)
    {
        try {
            logger.info("In Business Layer addCustomer(Customer customer) method");
            System.out.println("In Business Layer addCustomer(Customer customer) method");
            Factory factory = new Factory();            
            ICustomerService iCustomerMgr = (ICustomerService) factory.getTheService(ICustomerService.NAME);
            iCustomerMgr.addCustomer(anCustomer);
            
        } catch (ServiceLoadException ex) {
         
           System.out.print(ex.getMessage());
        } catch (Exception ex) {
            
            System.out.print(ex.getMessage());
             logger.error(ex.getMessage());
        }
    }
    public Customer getCustomer(int customerId)
    {
        Customer anCustomer=new Customer();
        try {
            logger.info("In Business Layer getCustomer(int customerId) method");
            System.out.println("In Business Layer getCustomer(int customerId) method");
            Factory factory = new Factory();           
            ICustomerService iCustomerMgr = (ICustomerService) factory.getTheService(ICustomerService.NAME);
            anCustomer=iCustomerMgr.getCustomer(customerId);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
             logger.error(ex.getMessage());
        }
        return anCustomer;
    }
    
    public void updateCustomer(Customer anCustomer)
    {
        try {
            logger.info("In Business Layer updateCustomer(Customer anCustomer) method");
            System.out.println("In Business Layer updateCustomer(Customer anCustomer) method");
            Factory factory = new Factory();            
            ICustomerService iCustomerMgr = (ICustomerService) factory.getTheService(ICustomerService.NAME);
            iCustomerMgr.updateCustomer(anCustomer);
            
        } catch (ServiceLoadException ex) {
          
           System.out.println(ex.getMessage()); 
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
            logger.error(ex.getMessage());
        }
    }
    
    public List<Customer> getAllCustomer()
    {
        List<Customer> customerList = new ArrayList<>();
        try {
            logger.info("In Business Layer getAllCustomer method");
            System.out.println("In Business Layer getAllCustomer method");
            Factory factory = new Factory();
            ICustomerService iCustomerMgr = (ICustomerService) factory.getTheService(ICustomerService.NAME);
            customerList = (List<Customer>) iCustomerMgr.getAllCustomer();
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
             logger.error(ex.getMessage());
            
        }
        return customerList;
    }
    
    
    public void deleteCustomer(Class<?> Customer, int customerId)
    {
        try {
            logger.info("In Business Layer deleteCustomer method");
            System.out.println("In Business Layer deleteCustomer method");
            Factory factory = new Factory();
            ICustomerService iCustomerMgr = (ICustomerService) factory.getTheService(ICustomerService.NAME);
            iCustomerMgr.deleteCustomer(Customer, customerId);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            
            System.out.println(ex.getMessage());
             logger.error(ex.getMessage());
        }
    }

    public CustomerManager() {
    }
    
    
    
}
