/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudManager;

import Domain.Author;
import java.util.ArrayList;
import java.util.List;
import Service.Factory;
import Service.IAuthorService;
import Service.Exceptions.ServiceLoadException;
import Service.IAuthorServiceJDBC;
import java.sql.ResultSet;

/**
 *
 * @author Adrian
 */
public class AuthorJDBCManager {
    
   
    
    public void addAuthor(Author anAuthor)
    {
        try {
            System.out.println("In Business Layer addAuthor(Author author) method");
            Factory factory = new Factory();            
            IAuthorServiceJDBC iAuthorMgrJDBC = (IAuthorServiceJDBC) factory.getTheService(IAuthorServiceJDBC.NAME);
            iAuthorMgrJDBC.addAuthorJDBC(anAuthor);
            
        } catch (ServiceLoadException ex) {
         System.out.println(ex.getMessage());
           
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
        }
    }
    public Author getAuthor(int authorId)
    {
        Author anAuthor=new Author();
        try {
            System.out.println("In Business Layer getAuthorJDBC(int authorId) method");
            Factory factory = new Factory();           
            IAuthorServiceJDBC iAuthorMgrJDBC = (IAuthorServiceJDBC) factory.getTheService(IAuthorServiceJDBC.NAME);
            anAuthor=iAuthorMgrJDBC.getAuthorJDBC(authorId);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            
        }
        return anAuthor;
    }
    
    public void updateAuthor(Author anAuthor)
    {
        try {
            System.out.println("In Business Layer  updateAuthorJDBC(Author anAuthor) method");
            Factory factory = new Factory();            
            IAuthorServiceJDBC iAuthorMgrJDBC = (IAuthorServiceJDBC) factory.getTheService(IAuthorServiceJDBC.NAME);
            iAuthorMgrJDBC.updateAuthorJDBC(anAuthor);
            
        } catch (ServiceLoadException ex) {
          
           System.out.println(ex.getMessage()); 
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
        }
    }
    
    public ResultSet getAllAuthors()
    {
        ResultSet rs=null;
        List<Author> authorsList = new ArrayList<>();
        try {
            System.out.println("In Business Layer getAllAthors JDBC method");
            Factory factory = new Factory();
            IAuthorServiceJDBC iAuthorMgrJDBC = (IAuthorServiceJDBC) factory.getTheService(IAuthorServiceJDBC.NAME);
            rs=iAuthorMgrJDBC.getAllAuthorsJDBC();
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());            
        }
        return rs;
    }
    
    
    public void deleteAuthor(int authorId)
    {
        try {
            System.out.println("In Business Layer deleteAuhor JDBC method");
            Factory factory = new Factory();
            IAuthorServiceJDBC iAuthorMgrJDBC = (IAuthorServiceJDBC) factory.getTheService(IAuthorServiceJDBC.NAME);
            iAuthorMgrJDBC.deleteAuthorJDBC(authorId);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            
            System.out.println(ex.getMessage());
        }
    }

    public AuthorJDBCManager() {
    }
    
    
    
}