/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.HibernateImplement;

import Domain.Author;
import Service.HibernateImplement.HibernateMainConfig;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import Service.IAuthorService;
import Service.IAuthorService;
import com.mysql.cj.protocol.Resultset;
import java.sql.ResultSet;

/**
 *
 * @author KRichards
 */
public class AuthorImplement extends HibernateMainConfig implements IAuthorService {
     
    @Override
    public void addAuthor(Author author) throws Exception  //method for adding book
     {
         Session session = this.getSession();
         Transaction transact=null;
         try{
             transact=session.beginTransaction();
             session.save(author);
             transact.commit();
         }
         catch(HibernateException hex){
             if(session!=null)
             {
                 transact.rollback();
                 throw new HibernateException("Not able to save author; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                      session.flush();
                      session.close();
                     }      
         
         
     }
    
    @Override
    public void updateAuthor(Author author) throws Exception //method for updating a book
    {
       Session session = AuthorImplement.getSession();
         Transaction transact=null;
         try{
            
             transact=session.beginTransaction();
             session.update(author);
             transact.commit();
         }
         catch(HibernateException hex){
             if(session!=null)
             {
                 transact.rollback();
                 throw new HibernateException("Not able to update author; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                     // session.flush();
                      //session.close();
                     }
    }
    
    @Override
    public void deleteAuthor(Class<?> Author, int authorId) throws Exception
    {
        
        Session session = AuthorImplement.getSession();
         Transaction transact=null;
         try{
             transact=session.beginTransaction();
             Object persistentInstance = session.load(Author, authorId);
             
                      session.delete(persistentInstance);
                      transact.commit(); 
              }
         catch(HibernateException hex){
             if(session!=null)
             {
                 transact.rollback();
                 throw new HibernateException("Not able to delete author; rolling back transaction " + hex.getMessage());
             }
         }
         finally {
                      session.flush();
                      session.close();
                     }
    }
    
    @Override
    public Author getAuthor(int authorID) throws Exception  //method to select book
    {
        Session session = AuthorImplement.getSession();
         Transaction transact=null;
        
          Author anAuthor=null;
         try{
             transact=session.beginTransaction();
             anAuthor = (Author) session.load(Author.class, authorID);             
             transact.commit();
         }
         catch(HibernateException hex){
             if(session!=null)
             {
                 transact.rollback();
                 throw new HibernateException("Not able to load author with id " + authorID + "; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                  //   session.flush();
                   //  session.close();
                     }
         
        return anAuthor;
    }
    
    @Override
    public List<Author> getAllAuthors() throws Exception
    {
         Session session1 = this.getSession();
         Transaction transact=null;
         List<Author> authorList =  new ArrayList<>();
         try{
             transact=session1.beginTransaction();
             authorList = (List<Author>) session1.createQuery("from Author").list();
             transact.commit();
             }
         catch(HibernateException hex){
             if(session1!=null)
             {
                 transact.rollback();
                 throw new HibernateException("Not able to load all authors; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                      //session1.flush();
                      //session1.close();
                     }
         return authorList;
    }

    
}
