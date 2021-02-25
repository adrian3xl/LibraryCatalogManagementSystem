/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.HibernateImplement;
import Domain.Customer;
import Service.HibernateImplement.HibernateMainConfig;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import Service.ICustomerService;
import Service.IAuthorService;
import com.mysql.cj.protocol.Resultset;
import java.sql.ResultSet;
/**
 *
 * @author Adrian
 */
public class CustomerImplement extends HibernateMainConfig implements ICustomerService {

    @Override
    public void addCustomer(Customer customer) throws Exception {
          Session session = this.getSession();
         Transaction transact=null;
         try{
             transact=session.beginTransaction();
             session.save(customer);
             transact.commit();
         }
         catch(HibernateException hex){
             if(session!=null)
             {
                 transact.rollback();
                 throw new HibernateException("Not able to save customer; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                      session.flush();
                      session.close();
                     }      
         
         
     }

    @Override
    public void updateCustomer(Customer customer) throws Exception {
       Session session = AuthorImplement.getSession();
         Transaction transact=null;
         try{
            
             transact=session.beginTransaction();
             session.update(customer);
             transact.commit();
         }
         catch(HibernateException hex){
             if(session!=null)
             {
                 transact.rollback();
                 throw new HibernateException("Not able to update author; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                     // session.flush();
                      //session.close();
                     }
    }
    @Override
    public Customer getCustomer(int customerID) throws Exception {
         Session session = AuthorImplement.getSession();
         Transaction transact=null;
        
          Customer anCustomer=null;
         try{
             transact=session.beginTransaction();
             anCustomer = (Customer) session.load(Customer.class, customerID);             
             transact.commit();
         }
         catch(HibernateException hex){
             if(session!=null)
             {
                 transact.rollback();
                 throw new HibernateException("Not able to load customer with id " + customerID + "; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                  //   session.flush();
                   //  session.close();
                     }
         
        return anCustomer;
    }

    @Override
    public ResultSet getAllCustomer() throws Exception {
        Session session1 = this.getSession();
         Transaction transact=null;
         List<Customer> customerList =  new ArrayList<>();
         try{
             transact=session1.beginTransaction();
             customerList = (List<Customer>) session1.createQuery("from customer").list();
             transact.commit();
             }
         catch(HibernateException hex){
             if(session1!=null)
             {
                 transact.rollback();
                 throw new HibernateException("Not able to load all authors; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                      //session1.flush();
                      //session1.close();
                     }
         return (ResultSet) customerList;
    }

    


    @Override
    public void deleteCustomer(Class<?> Customer, int customerId) {
               
        Session session = CustomerImplement.getSession();
         Transaction transact=null;
         try{
             transact=session.beginTransaction();
             Object persistentInstance = session.load(Customer, customerId);
             
                      session.delete(persistentInstance);
                      transact.commit(); 
              }
         catch(HibernateException hex){
             if(session!=null)
             {
                 transact.rollback();
                 throw new HibernateException("Not able to delete customer; rolling back transaction " + hex.getMessage());
             }
         }
         finally {
                      session.flush();
                      session.close();
                     }
    }
}
