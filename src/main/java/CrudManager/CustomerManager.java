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
/**
 *
 * @author Adrian
 */
public class CustomerManager {
    
public void addCustomer(Customer anCustomer)
    {
        try {
            System.out.println("In Business Layer addCustomer(Customer customer) method");
            Factory factory = new Factory();            
            ICustomerService iCustomerMgr = (ICustomerService) factory.getTheService(ICustomerService.NAME);
            iCustomerMgr.addCustomer(anCustomer);
            
        } catch (ServiceLoadException ex) {
         
           System.out.print(ex.getMessage());
        } catch (Exception ex) {
            
            System.out.print(ex.getMessage());
        }
    }
    public Customer getCustomer(int customerId)
    {
        Customer anCustomer=new Customer();
        try {
            System.out.println("In Business Layer getCustomer(int customerId) method");
            Factory factory = new Factory();           
            ICustomerService iCustomerMgr = (ICustomerService) factory.getTheService(ICustomerService.NAME);
            anCustomer=iCustomerMgr.getCustomer(customerId);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            
        }
        return anCustomer;
    }
    
    public void updateCustomer(Customer anCustomer)
    {
        try {
            System.out.println("In Business Layer updateCustomer(Customer anCustomer) method");
            Factory factory = new Factory();            
            ICustomerService iCustomerMgr = (ICustomerService) factory.getTheService(ICustomerService.NAME);
            iCustomerMgr.updateCustomer(anCustomer);
            
        } catch (ServiceLoadException ex) {
          
           System.out.println(ex.getMessage()); 
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
        }
    }
    
    public List<Customer> getAllCustomer()
    {
        List<Customer> customerList = new ArrayList<>();
        try {
            System.out.println("In Business Layer getAllCustomer method");
            Factory factory = new Factory();
            ICustomerService iCustomerMgr = (ICustomerService) factory.getTheService(ICustomerService.NAME);
            customerList = (List<Customer>) iCustomerMgr.getAllCustomer();
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            
        }
        return customerList;
    }
    
    
    public void deleteCustomer(Class<?> Customer, int customerId)
    {
        try {
            System.out.println("In Business Layer deleteCustomer method");
            Factory factory = new Factory();
            ICustomerService iCustomerMgr = (ICustomerService) factory.getTheService(ICustomerService.NAME);
            iCustomerMgr.deleteCustomer(Customer, customerId);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            
            System.out.println(ex.getMessage());
        }
    }

    public CustomerManager() {
    }
    
    
    
}
