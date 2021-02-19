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
public interface ICatalogloanrecordService extends IService {
    
public final String NAME="ICatalogloanrecordService";
    
    public void addCatalogloanrecord (Catalogloanrecord catalogloanrecord) throws Exception ; //method for adding Catalogloanrecord
    
    public void updateCatalogloanrecord (Catalogloanrecord catalogloanrecord) throws Exception ; //method for updating a Catalogloanrecord
    
    public Catalogloanrecord getCatalogloanrecord (int id) throws Exception ; //method to select Catalogloanrecord
    
    public ResultSet getAllCatalogloanrecord () throws Exception;
    
    public void deleteCatalogloanrecord (int id) throws Exception; 
    
}