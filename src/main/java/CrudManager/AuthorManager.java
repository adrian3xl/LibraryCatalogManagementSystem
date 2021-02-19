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

/**
 *
 * @author KRichards
 */
public class AuthorManager {
    
   
    
    public void addAuthor(Author anAuthor)
    {
        try {
            System.out.println("In Business Layer addAuthor(Author author) method");
            Factory factory = new Factory();            
            IAuthorService iAuthorMgr = (IAuthorService) factory.getTheService(IAuthorService.NAME);
            iAuthorMgr.addAuthor(anAuthor);
            
        } catch (ServiceLoadException ex) {
         
           System.out.print(ex.getMessage());
        } catch (Exception ex) {
            
            System.out.print(ex.getMessage());
        }
    }
    public Author getAuthor(int authorId)
    {
        Author anAuthor=new Author();
        try {
            System.out.println("In Business Layer getAuthor(int authorId) method");
            Factory factory = new Factory();           
            IAuthorService iAuthorMgr = (IAuthorService) factory.getTheService(IAuthorService.NAME);
            anAuthor=iAuthorMgr.getAuthor(authorId);
            
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
            System.out.println("In Business Layer updateAuthor(Author anAuthor) method");
            Factory factory = new Factory();            
            IAuthorService iAuthorMgr = (IAuthorService) factory.getTheService(IAuthorService.NAME);
            iAuthorMgr.updateAuthor(anAuthor);
            
        } catch (ServiceLoadException ex) {
          
           System.out.println(ex.getMessage()); 
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
        }
    }
    
    public List<Author> getAllAuthors()
    {
        List<Author> authorsList = new ArrayList<>();
        try {
            System.out.println("In Business Layer getAllAthors method");
            Factory factory = new Factory();
            IAuthorService iAuthorMgr = (IAuthorService) factory.getTheService(IAuthorService.NAME);
            authorsList=iAuthorMgr.getAllAuthors();
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            
        }
        return authorsList;
    }
    
    
    public void deleteAuthor(Class<?> Author, int authorId)
    {
        try {
            System.out.println("In Business Layer deleteAuhor method");
            Factory factory = new Factory();
            IAuthorService iAuthorMgr = (IAuthorService) factory.getTheService(IAuthorService.NAME);
            iAuthorMgr.deleteAuthor(Author, authorId);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            
            System.out.println(ex.getMessage());
        }
    }

    public AuthorManager() {
    }
    
    
    
}
