/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Domain.Catalogrecord;
import java.sql.ResultSet;

/**
 *
 * @author Adrian
 */
public interface ICatalogrecordService extends IService {
    
public final String NAME="ICatalogrecordService";
    
    public void addCatalogrecord (Catalogrecord catalogrecord) throws Exception ; //method for adding Catalogrecord
    
    public void updateCatalogrecord (Catalogrecord catalogrecord) throws Exception ; //method for updating a Catalogrecord
    
    public Catalogrecord getCatalogrecord (int id) throws Exception ; //method to select Catalogrecord
    
    public ResultSet getAllCatalogrecord () throws Exception;
    
    public void deleteCatalogrecord (int id) throws Exception; 
    
}