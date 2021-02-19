/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Domain.Author;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author KRichards
 */
public interface IAuthorService extends IService {
    
    public final String NAME="IAuthorService";
    
    public void addAuthor(Author author) throws Exception ; //method for adding book
    
    public void updateAuthor(Author author) throws Exception ; //method for updating a book
    
    public Author getAuthor(int id) throws Exception ; //method to select book
    
    public List<Author> getAllAuthors() throws Exception;
    
    public void deleteAuthor(Class<?> Author, int id) throws Exception;
    
    
    
}
