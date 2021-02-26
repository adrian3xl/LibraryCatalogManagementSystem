/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.JDBCImplement;

import Domain.Customer;
import Service.ICustomerServiceJDBC;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Adrian
 */
public class CustomerImplementJDBC extends JDBCMainConfiguration implements ICustomerServiceJDBC{
 
    Statement statement;
    @Override
    public void addCustomerJDBC(Customer customer) throws Exception {
         String insertAuthor = "INSERT INTO author(id,customercode, firstname, lastname,addressbook,phonenumber ) "
                + "values('" + customer.getId() + 
                "', '" + customer.getAddressbook()+
                  "', '" + customer.getCustomercode()+
                  "', '" + customer.getPhonenumber()+
                 
                "', '" + customer.getFname() + 
                "', '" + customer.getLname() + "')";    
        
        statement=this.getConnection().createStatement();        
        statement.execute(insertAuthor);      
        
        this.getConnection().close();       
    }

    @Override
    public void updateCustomerJDBC(Customer customer) throws Exception {
             String updateCustomer = "UPDATE author SET authorcode = '" + customer.getCustomercode()+ 
                "', firstname = '" + customer.getFname() + 
                "', lastname = '" + customer.getLname() + 
                 "', addressbook = '" + customer.getAddressbook() + 
                "', phonenumber = '" + customer.getPhonenumber() +  
                "' WHERE ID = '"+ customer.getId() +"'";        
        
        statement = this.getConnection().createStatement();
        
        int rowsUpdated = statement.executeUpdate(updateCustomer);
        if (rowsUpdated > 0) {
            System.out.println("Update Successful");
        }
        
        this.getConnection().close();  
    }


    @Override
    public Customer getCustomerJDBC(int customerID) throws Exception {
       String selectCustomer = "Select * From customer Where id = " + customerID;
        statement=this.getConnection().createStatement();
        
        ResultSet rs=statement.executeQuery(selectCustomer);
        
        Customer customer=new Customer();
        customer.setId(customerID);
        customer.setCustomercode(rs.getString("customercode"));
         customer.setFname(rs.getString("firstname"));
         customer.setLname(rs.getString("lastname"));
         customer.setAddressbook(rs.getString("addressbook "));
          customer.setPhonenumber(rs.getString("phonenumber"));
        
        return  customer;
        
    }

    @Override
    public ResultSet getAllCustomerJDBC() throws Exception {
        ResultSet rs=null;
        
        String SelectAll="Select * From customer";
        statement=this.getConnection().createStatement();
        rs=statement.executeQuery(SelectAll);
        
        return rs;
    }

    @Override
    public void deleteCustomerJDBC(int customerId) throws Exception {
         statement=this.getConnection().createStatement();
        statement.execute("Delete From author Where id = " + customerId);
    }

    
}
