/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Domain.Customer;
import java.sql.ResultSet;

/**
 *
 * @author Adrian
 */
public interface ICustomerServiceJDBC extends IService {
    
 public final String NAME="ICustomerServiceJDBC";
    
    public void addCustomerJDBC(Customer customer) throws Exception ; //method for adding Customer
    
    public void updateCustomerJDBC(Customer customer) throws Exception ; //method for updating a Customer
    
    public Customer getCustomerJDBC(int id) throws Exception ; //method to select Customer
    
    public ResultSet getAllCustomerJDBC() throws Exception;
    
    public void deleteCustomerJDBC(int id) throws Exception; 
    
}