/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.HibernateImplement;
import Domain.Employee;
import Service.HibernateImplement.HibernateMainConfig;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import Service.IAuthorService;
import Service.IEmployeeService;
import com.mysql.cj.protocol.Resultset;
import java.sql.ResultSet;
/**
 *
 * @author Adrian
 */
public class EmployeeImplement extends HibernateMainConfig implements IEmployeeService {

    @Override
    public void addEmployee(Employee employee) throws Exception {
        Session session = this.getSession();
         Transaction transact=null;
         try{
             transact=session.beginTransaction();
             session.save(employee);
             transact.commit();
         }
         catch(HibernateException hex){
             if(session!=null)
             {
                 transact.rollback();
                 throw new HibernateException("Not able to save employee; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                      session.flush();
                      session.close();
                     }      
         
         
     }

    @Override
    public void updateEmployee(Employee employee) throws Exception {
       Session session = EmployeeImplement.getSession();
         Transaction transact=null;
         try{
            
             transact=session.beginTransaction();
             session.update(employee);
             transact.commit();
         }
         catch(HibernateException hex){
             if(session!=null)
             {
                 transact.rollback();
                 throw new HibernateException("Not able to update Employee; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                     // session.flush();
                      //session.close();
                     }
    }

    @Override
    public Employee getEmployee(int id) throws Exception {
        Session session = EmployeeImplement.getSession();
         Transaction transact=null;
        
          Employee anEmployee=null;
         try{
             transact=session.beginTransaction();
             anEmployee = (Employee) session.load(Employee.class, id);             
             transact.commit();
         }
         catch(HibernateException hex){
             if(session!=null)
             {
                 transact.rollback();
                 throw new HibernateException("Not able to load author with id " + id + "; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                  //   session.flush();
                   //  session.close();
                     }
         
        return anEmployee;
    }

    @Override
    public ResultSet getAllEmployee() throws Exception {
         Session session1 = this.getSession();
         Transaction transact=null;
         List<Employee> employeeList =  new ArrayList<>();
         try{
             transact=session1.beginTransaction();
             employeeList = (List<Employee>) session1.createQuery("from employee").list();
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
         return (ResultSet) employeeList;
    }

    @Override
    public void deleteEmployee (Class<?> Employee, int employeeId) throws Exception {
         Session session = EmployeeImplement.getSession();
         Transaction transact=null;
         try{
             transact=session.beginTransaction();
             Object persistentInstance = session.load(Employee, employeeId);
             
                      session.delete(persistentInstance);
                      transact.commit(); 
              }
         catch(HibernateException hex){
             if(session!=null)
             {
                 transact.rollback();
                 throw new HibernateException("Not able to delete Employee; rolling back transaction " + hex.getMessage());
             }
         }
         finally {
                      session.flush();
                      session.close();
                     }
    }
    
}
