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
    
    public void addAuthorJDBC(Author author) throws Exception ; //method for adding book
    
    public void updateAuthorJDBC(Author author) throws Exception ; //method for updating a book
    
    public Author getAuthorJDBC(int id) throws Exception ; //method to select book
    
    public ResultSet getAllAuthorsJDBC() throws Exception;
    
    public void deleteAuthorJDBC(int id) throws Exception;
}
