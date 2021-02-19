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
public interface IEmployeeServiceJDBC extends IService{
 
    public final String NAME="IEmployeeServiceJDBC";
    
    public void addEmployeeJDBC(Employee employee) throws Exception ; //method for adding employee
    
    public void updateEmployeeJDBC(Employee employee) throws Exception ; //method for updating a employee
    
    public Employee getEmployeeJDBC(int id) throws Exception ; //method to select employee if needed
    
    public ResultSet getAllEmployeeJDBC() throws Exception;
    
    public void deleteEmployeeJDBC(int id) throws Exception;
}
