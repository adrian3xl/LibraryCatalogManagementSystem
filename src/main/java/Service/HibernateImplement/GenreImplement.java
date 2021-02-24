/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.HibernateImplement;
import Domain.Genre;
import Service.HibernateImplement.HibernateMainConfig;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import Service.IAuthorService;
import Service.IGenreService;
import com.mysql.cj.protocol.Resultset;
import java.sql.ResultSet;
/**
 *
 * @author Adrian
 */
public class GenreImplement extends HibernateMainConfig implements IGenreService {

    @Override
    public void addGenre(Genre genre) throws Exception {
         Session session = this.getSession();
         Transaction transact=null;
         try{
             transact=session.beginTransaction();
             session.save(genre);
             transact.commit();
         }
         catch(HibernateException hex){
             if(session!=null)
             {
                 transact.rollback();
                 throw new HibernateException("Not able to save Genre; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                      session.flush();
                      session.close();
                     }      
         
         
     }

    @Override
    public void updateGenre(Genre genre) throws Exception {
        Session session = AuthorImplement.getSession();
         Transaction transact=null;
         try{
            
             transact=session.beginTransaction();
             session.update(genre);
             transact.commit();
         }
         catch(HibernateException hex){
             if(session!=null)
             {
                 transact.rollback();
                 throw new HibernateException("Not able to update Genre; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                     // session.flush();
                      //session.close();
                     }
    }

    @Override
    public Genre getGenre(int genreID) throws Exception {
        Session session = GenreImplement.getSession();
         Transaction transact=null;
        
          Genre anGenre=null;
         try{
             transact=session.beginTransaction();
             anGenre = (Genre) session.load(Genre.class, genreID);             
             transact.commit();
         }
         catch(HibernateException hex){
             if(session!=null)
             {
                 transact.rollback();
                 throw new HibernateException("Not able to load Genre with id " + genreID + "; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                  //   session.flush();
                   //  session.close();
                     }
         
        return anGenre;
    }
    

    @Override
    public ResultSet getAllGenre() throws Exception {
          Session session1 = this.getSession();
         Transaction transact=null;
         List<Genre> genreList =  new ArrayList<>();
         try{
             transact=session1.beginTransaction();
             genreList = (List<Genre>) session1.createQuery("from genre").list();
             transact.commit();
             }
         catch(HibernateException hex){
             if(session1!=null)
             {
                 transact.rollback();
                 throw new HibernateException("Not able to load all Genres; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                      //session1.flush();
                      //session1.close();
                     }
         return (ResultSet) genreList;
    }


    @Override
    public void deleteGenre(Class<?> Genre, int genreId) throws Exception {
            Session session = GenreImplement.getSession();
         Transaction transact=null;
         try{
             transact=session.beginTransaction();
             Object persistentInstance = session.load(Genre, genreId);
             
                      session.delete(persistentInstance);
                      transact.commit(); 
              }
         catch(HibernateException hex){
             if(session!=null)
             {
                 transact.rollback();
                 throw new HibernateException("Not able to delete genre; rolling back transaction " + hex.getMessage());
             }
         }
         finally {
                      session.flush();
                      session.close();
                     }
    }
    

    
}
