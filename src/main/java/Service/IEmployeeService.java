/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Domain.Employee;
import java.sql.ResultSet;

/**
 *
 * @author Adrian
 */
public interface IEmployeeService extends IService {
    
public final String NAME="IEmployeeService ";
    
    public void addEmployee (Employee employee) throws Exception ; //method for adding employee
    
    public void updateEmployee (Employee employee) throws Exception ; //method for updating a employee
    
    public Employee getEmployee (int id) throws Exception ; //method to select employee if needed
    
    public ResultSet getAllEmployee () throws Exception;
    
    public void deleteEmployee (int id) throws Exception;
}