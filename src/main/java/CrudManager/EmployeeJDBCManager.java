/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudManager;
import Domain.Employee;
import java.util.ArrayList;
import java.util.List;
import Service.Factory;
import Service.IEmployeeService;
import Service.Exceptions.ServiceLoadException;
import Service.IEmployeeServiceJDBC;
import java.sql.ResultSet;
import org.apache.log4j.Logger;
/**
 *
 * @author Adrian
 */
public class EmployeeJDBCManager {
     final static Logger logger = Logger.getLogger(EmployeeManager.class); 
public void addEmployeeJDBC(Employee anEmployee)
    {
        try {
            logger.info("In Business Layer addEmployee(Employee employee) method");
            System.out.println("In Business Layer addEmployee(Employee employee) method");
            Factory factory = new Factory();            
            IEmployeeServiceJDBC iEmployeeMgrJDBC = (IEmployeeServiceJDBC) factory.getTheService(IEmployeeServiceJDBC.NAME);
            iEmployeeMgrJDBC.addEmployeeJDBC(anEmployee);
            
        } catch (ServiceLoadException ex) {
         System.out.println(ex.getMessage());
           
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
           logger.error(ex.getMessage());
        }
    }
    public Employee getEmployeeJDBC(int employeeId)
    {
        Employee anEmployee=new Employee();
        try {
            logger.info("In Business Layer getEmployeeJDBC(int employeeId) method");
            System.out.println("In Business Layer getEmployeeJDBC(int employeeId) method");
            Factory factory = new Factory();           
            IEmployeeServiceJDBC iEmployeeMgrJDBC = (IEmployeeServiceJDBC) factory.getTheService(IEmployeeServiceJDBC.NAME);
            anEmployee=iEmployeeMgrJDBC.getEmployeeJDBC(employeeId);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
             logger.error(ex.getMessage());
            
        }
        return anEmployee;
    }
    
    public void updateEmployeeJDBC(Employee anEmployee)
    {
        try {
            logger.info("In Business Layer  updateEmployeeJDBC(Employee anEmployee) method");
            System.out.println("In Business Layer  updateEmployeeJDBC(Employee anEmployee) method");
            Factory factory = new Factory();            
            IEmployeeServiceJDBC iEmployeeMgrJDBC = (IEmployeeServiceJDBC) factory.getTheService(IEmployeeServiceJDBC.NAME);
            iEmployeeMgrJDBC.updateEmployeeJDBC(anEmployee);
            
        } catch (ServiceLoadException ex) {
          
           System.out.println(ex.getMessage()); 
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
            logger.error(ex.getMessage());
        }
    }
    
    public ResultSet getAllEmployeeJDBC()
    {
        ResultSet rs=null;
        List<Employee> employeesList = new ArrayList<>();
        try {
            logger.info("In Business Layer getAllAthors JDBC method");
            System.out.println("In Business Layer getAllAthors JDBC method");
            Factory factory = new Factory();
            IEmployeeServiceJDBC iEmployeeMgrJDBC = (IEmployeeServiceJDBC) factory.getTheService(IEmployeeServiceJDBC.NAME);
            rs=iEmployeeMgrJDBC.getAllEmployeeJDBC();
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());    
         logger.error(ex.getMessage());
        }
        return rs;
    }
    
    
    public void deleteEmployeeJDBC(int employeeId)
    {
        try {
            logger.info("In Business Layer deleteAuhor JDBC method");
            System.out.println("In Business Layer deleteAuhor JDBC method");
            Factory factory = new Factory();
            IEmployeeServiceJDBC iEmployeeMgrJDBC = (IEmployeeServiceJDBC) factory.getTheService(IEmployeeServiceJDBC.NAME);
            iEmployeeMgrJDBC.deleteEmployeeJDBC(employeeId);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            
            System.out.println(ex.getMessage());
            logger.error(ex.getMessage());
        }
    }

    public EmployeeJDBCManager() {
    }
    
    
    
}
