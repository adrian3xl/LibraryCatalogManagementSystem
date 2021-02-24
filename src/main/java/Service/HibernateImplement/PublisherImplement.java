/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.HibernateImplement;
import Domain.Publisher;
import Service.HibernateImplement.HibernateMainConfig;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import Service.IPublisherService;
import Service.IAuthorService;
import com.mysql.cj.protocol.Resultset;
import java.sql.ResultSet;
/**
 *
 * @author Adrian
 */
public class PublisherImplement extends HibernateMainConfig implements IPublisherService {

    @Override
    public void addPublisher(Publisher publisher) throws Exception {
           Session session = this.getSession();
         Transaction transact=null;
         try{
             transact=session.beginTransaction();
             session.save(publisher);
             transact.commit();
         }
         catch(HibernateException hex){
             if(session!=null)
             {
                 transact.rollback();
                 throw new HibernateException("Not able to save Publisher; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                      session.flush();
                      session.close();
                     }      
         
         
     }
    
 

    @Override
    public void updatePublisher(Publisher publisher) throws Exception {
          Session session = PublisherImplement.getSession();
         Transaction transact=null;
         try{
            
             transact=session.beginTransaction();
             session.update(publisher);
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
    public Publisher getPublisher(int publisherID) throws Exception {
        Session session = PublisherImplement.getSession();
         Transaction transact=null;
        
          Publisher anPublisher=null;
         try{
             transact=session.beginTransaction();
             anPublisher = (Publisher) session.load(Publisher.class, publisherID);             
             transact.commit();
         }
         catch(HibernateException hex){
             if(session!=null)
             {
                 transact.rollback();
                 throw new HibernateException("Not able to load publisher with id " + publisherID + "; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                  //   session.flush();
                   //  session.close();
                     }
         
        return anPublisher;
    }

    @Override
    public ResultSet getAllPublishers() throws Exception {
        Session session1 = this.getSession();
         Transaction transact=null;
         List<Publisher> publisherList =  new ArrayList<>();
         try{
             transact=session1.beginTransaction();
             publisherList = (List<Publisher>) session1.createQuery("from publisher").list();
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
         return (ResultSet) publisherList;
    }


    @Override
    public void deletePublisher(Class<?> Publisher, int publisherId) {
            Session session = PublisherImplement.getSession();
         Transaction transact=null;
         try{
             transact=session.beginTransaction();
             Object persistentInstance = session.load(Publisher, publisherId);
             
                      session.delete(persistentInstance);
                      transact.commit(); 
              }
         catch(HibernateException hex){
             if(session!=null)
             {
                 transact.rollback();
                 throw new HibernateException("Not able to delete Publisher; rolling back transaction " + hex.getMessage());
             }
         }
         finally {
                      session.flush();
                      session.close();
                     }
    }
    
    
}
