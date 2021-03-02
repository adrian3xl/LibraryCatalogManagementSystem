/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.JDBCImplement;

import Domain.Employee;
import Service.IEmployeeServiceJDBC;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Adrian
 */
public class EmployeeImplementJDBC extends JDBCMainConfiguration implements IEmployeeServiceJDBC{
 
    Statement statement;
    @Override
    public void addEmployeeJDBC(Employee employee) throws Exception {
        String insertAuthor = "INSERT INTO employee(id,employeecode,jobtitle,password, firstname, lastname) "
                + "values('" + employee.getId() + 
                "', '" + employee.getEmployeecode()+
                     "', '" + employee.getJobtitle() + 
                "', '" + employee.getPassword() + 
           
                "', '" + employee.getFname() + 
                "', '" + employee.getLname() + "')";    
        
        statement=this.getConnection().createStatement();        
        statement.execute(insertAuthor);      
        
        this.getConnection().close();       
    }

    @Override
    public void updateEmployeeJDBC(Employee employee) throws Exception {
             String updateAuthor = "UPDATE employee SET employeecode = '" + employee.getEmployeecode()+ 
                "', firstname = '" + employee.getFname() + 
                "', lastname = '" + employee.getFname() + 
               
                "', jobtitle = '" + employee.getJobtitle()+
                "', password = '" + employee.getPassword()+
                "' WHERE ID = '"+ employee.getId() +"'";        
        
        statement = this.getConnection().createStatement();
        
        int rowsUpdated = statement.executeUpdate(updateAuthor);
        if (rowsUpdated > 0) {
            System.out.println("Update Successful");
        }
        
        this.getConnection().close();  
    }

    @Override
    public Employee getEmployeeJDBC(int employeeID) throws Exception {
        String selectEmployee = "Select * From employee Where id = " + employeeID;
        statement=this.getConnection().createStatement();
        
        ResultSet rs=statement.executeQuery(selectEmployee);
        
        Employee employee=new Employee();
        employee.setId(employeeID);
        employee.setEmployeecode(rs.getString("employeecode"));
        employee.setFname(rs.getString("firstname"));
        employee.setLname(rs.getString("lastname"));
        employee.setJobtitle(rs.getString("jobtitle"));     
          employee.setPassword(rs.getString("password"));
        return  employee;
        
    }

    @Override
    public ResultSet getAllEmployeeJDBC() throws Exception {
         ResultSet rs=null;
        
        String SelectAll="Select * From employee";
        statement=this.getConnection().createStatement();
        rs=statement.executeQuery(SelectAll);
        
        return rs;
    }

    @Override
    public void deleteEmployeeJDBC(int customerId) throws Exception {
      
        statement=this.getConnection().createStatement();
        statement.execute("Delete From customer Where id = " + customerId);
    }

   
    
}
