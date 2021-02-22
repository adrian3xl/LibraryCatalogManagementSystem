/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Domain.Documenttype;
import java.sql.ResultSet;

/**
 *
 * @author Adrian
 */
public interface IDocumenttypeService {
    
public final String NAME="IDocumenttypeService";
    
    public void addDocumenttype (Documenttype documenttype) throws Exception ; //method for adding Documenttype
    
    public void updateDocumenttype (Documenttype documenttype) throws Exception ; //method for updating a Documenttype
    
    public Documenttype getDocumenttype (int id) throws Exception ; //method to select Documenttype
    
    public ResultSet getAllDocumenttype () throws Exception;
    
    public void deleteDocumenttype (Class<?> Documenttype, int documenttypeId) throws Exception; 
    
}