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
/**
 *
 * @author Adrian
 */
public class EmployeeManager {
    
public void addEmployee (Employee anEmployee)
    {
        try {
            System.out.println("In Business Layer addEmployee(Employee employee) method");
            Factory factory = new Factory();            
            IEmployeeService  iEmployeeMgr  = (IEmployeeService ) factory.getTheService(IEmployeeService .NAME);
            iEmployeeMgr .addEmployee (anEmployee);
            
        } catch (ServiceLoadException ex) {
         System.out.println(ex.getMessage());
           
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
        }
    }
    public Employee getEmployee (int employeeId)
    {
        Employee anEmployee=new Employee();
        try {
            System.out.println("In Business Layer getEmployee (int employeeId) method");
            Factory factory = new Factory();           
            IEmployeeService  iEmployeeMgr  = (IEmployeeService ) factory.getTheService(IEmployeeService .NAME);
            anEmployee=iEmployeeMgr .getEmployee (employeeId);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            
        }
        return anEmployee;
    }
    
    public void updateEmployee (Employee anEmployee)
    {
        try {
            System.out.println("In Business Layer  updateEmployee (Employee anEmployee) method");
            Factory factory = new Factory();            
            IEmployeeService  iEmployeeMgr  = (IEmployeeService ) factory.getTheService(IEmployeeService .NAME);
            iEmployeeMgr .updateEmployee (anEmployee);
            
        } catch (ServiceLoadException ex) {
          
           System.out.println(ex.getMessage()); 
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
        }
    }
    
    public ResultSet getAllEmployees ()
    {
        ResultSet rs=null;
        List<Employee> employeesList = new ArrayList<>();
        try {
            System.out.println("In Business Layer getAllAthors   method");
            Factory factory = new Factory();
            IEmployeeService  iEmployeeMgr  = (IEmployeeService ) factory.getTheService(IEmployeeService .NAME);
            rs=iEmployeeMgr .getAllEmployee ();
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());            
        }
        return rs;
    }
    
    
    public void deleteEmployee (Class<?> Employee, int employeeId)
    {
        try {
            System.out.println("In Business Layer deleteEmployee  method");
            Factory factory = new Factory();
            IEmployeeService  iEmployeeMgr  = (IEmployeeService ) factory.getTheService(IEmployeeService .NAME);
            iEmployeeMgr .deleteEmployee (Employee,employeeId);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            
            System.out.println(ex.getMessage());
        }
    }

    public EmployeeManager() {
    }
    
    
    
}
