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
public interface ICustomerService extends IService {
    
public final String NAME="ICustomerService";
    
    public void addCustomer (Customer customer) throws Exception ; //method for adding Customer
    
    public void updateCustomer (Customer customer) throws Exception ; //method for updating a Customer
    
    public Customer getCustomer (int id) throws Exception ; //method to select Customer
    
    public ResultSet getAllCustomer () throws Exception;
    
    public void deleteCustomer (int id) throws Exception; 
    
}