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
public interface ICatalogrecordServiceJDBC {
    
public final String NAME="ICatalogrecordServiceJDBC";
    
    public void addCatalogrecordJDBC(Catalogrecord catalogrecord) throws Exception ; //method for adding Catalogrecord
    
    public void updateCatalogrecordJDBC(Catalogrecord catalogrecord) throws Exception ; //method for updating a Catalogrecord
    
    public Catalogrecord getCatalogrecordJDBC(int id) throws Exception ; //method to select Catalogrecord
    
    public ResultSet getAllCatalogrecordJDBC() throws Exception;
    
    public void deleteCatalogrecordJDBC(int id) throws Exception; 
    
}