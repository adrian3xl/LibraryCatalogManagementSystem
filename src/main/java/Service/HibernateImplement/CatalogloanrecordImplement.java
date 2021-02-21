/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.HibernateImplement;
import Domain.Catalogloanrecord; 
import Service.HibernateImplement.HibernateMainConfig;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import Service.ICatalogloanrecordService;

import com.mysql.cj.protocol.Resultset;
import java.sql.ResultSet;
/**
 *
 * @author Adrian
 */
public class CatalogloanrecordImplement extends HibernateMainConfig implements ICatalogloanrecordService {
    
@Override
    public void addCatalogloanrecord(Catalogloanrecord catalogloanrecord) throws Exception  //method for adding Catalogloanrecord
     {
         Session session = this.getSession();
         Transaction transact=null;
         try{
             transact=session.beginTransaction();
             session.save(catalogloanrecord);
             transact.commit();
         }
         catch(HibernateException hex){
             if(session!=null)
             {
                 transact.rollback();
                 throw new HibernateException("Not able to save catalogloanrecord; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                      session.flush();
                      session.close();
                     }      
         
         
     }
    
    @Override
    public void updateCatalogloanrecord(Catalogloanrecord catalogloanrecord) throws Exception //method for updating a book
    {
       Session session = CatalogloanrecordImplement.getSession();
         Transaction transact=null;
         try{
            
             transact=session.beginTransaction();
             session.update(catalogloanrecord);
             transact.commit();
         }
         catch(HibernateException hex){
             if(session!=null)
             {
                 transact.rollback();
                 throw new HibernateException("Not able to update catalogloanrecord; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                     // session.flush();
                      //session.close();
                     }
    }
    
    public void deleteCatalogloanrecord(Class<?> Catalogloanrecord, int catalogloanrecordId) throws Exception
    {
        
        Session session = CatalogloanrecordImplement.getSession();
         Transaction transact=null;
         try{
             transact=session.beginTransaction();
             Object persistentInstance = session.load(Catalogloanrecord, catalogloanrecordId);
             
                      session.delete(persistentInstance);
                      transact.commit(); 
              }
         catch(HibernateException hex){
             if(session!=null)
             {
                 transact.rollback();
                 throw new HibernateException("Not able to delete catalogloanrecord; rolling back transaction " + hex.getMessage());
             }
         }
         finally {
                      session.flush();
                      session.close();
                     }
    }
    
    @Override
    public Catalogloanrecord getCatalogloanrecord(int catalogloanrecordID) throws Exception  //method to select Catalogloanrecord
    {
        Session session = CatalogloanrecordImplement.getSession();
         Transaction transact=null;
        
          Catalogloanrecord anCatalogloanrecord=null;
         try{
             transact=session.beginTransaction();
             anCatalogloanrecord = (Catalogloanrecord) session.load(Catalogloanrecord.class, catalogloanrecordID);             
             transact.commit();
         }
         catch(HibernateException hex){
             if(session!=null)
             {
                 transact.rollback();
                 throw new HibernateException("Not able to load catalogloanrecord with id " + catalogloanrecordID + "; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                  //   session.flush();
                   //  session.close();
                     }
         
        return anCatalogloanrecord;
    }
    
@Override
    public List<Catalogloanrecord> getAllCatalogloanrecord() throws Exception
    {
         Session session1 = this.getSession();
         Transaction transact=null;
         List<Catalogloanrecord> catalogloanrecordList =  new ArrayList<>();
         try{
             transact=session1.beginTransaction();
             catalogloanrecordList = (List<Catalogloanrecord>) session1.createQuery("from Catalogloanrecord").list();
             transact.commit();
             }
         catch(HibernateException hex){
             if(session1!=null)
             {
                 transact.rollback();
                 throw new HibernateException("Not able to load all Catalogloanrecords; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                      //session1.flush();
                      //session1.close();
                     }
         return catalogloanrecordList;
    }

    @Override
    public void deleteCatalogloanrecord(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
