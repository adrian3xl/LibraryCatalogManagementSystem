/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Domain.Author;
import java.sql.ResultSet;

/**
 *
 * @author cghfcjg
 */
public interface IAuthorServiceJDBC extends IService {
    
    public final String NAME="IAuthorServiceJDBC";
    
    public void addAuthorJDBC(Author author) throws Exception ; //method for adding author
    
    public void updateAuthorJDBC(Author author) throws Exception ; //method for updating a author
    
    public Author getAuthorJDBC(int id) throws Exception ; //method to select author
    
    public ResultSet getAllAuthorsJDBC() throws Exception;
    
    public void deleteAuthorJDBC(int id) throws Exception;
}
