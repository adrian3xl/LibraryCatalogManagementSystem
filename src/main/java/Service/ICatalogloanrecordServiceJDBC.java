/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Domain.Catalogloanrecord;
import java.sql.ResultSet;

/**
 *
 * @author Adrian
 */
public interface ICatalogloanrecordServiceJDBC {
    
public final String NAME="ICatalogloanrecordServiceJDBC";
    
    public void addCatalogloanrecordJDBC(Catalogloanrecord catalogloanrecord) throws Exception ; //method for adding Catalogloanrecord
    
    public void updateCatalogloanrecordJDBC(Catalogloanrecord catalogloanrecord) throws Exception ; //method for updating a Catalogloanrecord
    
    public Catalogloanrecord getCatalogloanrecordJDBC(int id) throws Exception ; //method to select Catalogloanrecord
    
    public ResultSet getAllCatalogloanrecordJDBC() throws Exception;
    
    public void deleteCatalogloanrecordJDBC(int id) throws Exception; 
    
}