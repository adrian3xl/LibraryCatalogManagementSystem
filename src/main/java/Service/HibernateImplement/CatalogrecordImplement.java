/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.HibernateImplement;
import Domain.Catalogrecord;
import Service.HibernateImplement.HibernateMainConfig;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import Service.ICatalogrecordService;
import com.mysql.cj.protocol.Resultset;
import java.sql.ResultSet;
/**
 *
 * @author Adrian
 */
public class CatalogrecordImplement extends HibernateMainConfig implements ICatalogrecordService {

    @Override
    public void addCatalogrecord(Catalogrecord catalogrecord) throws Exception {
     Session session = this.getSession();
         Transaction transact=null;
         try{
             transact=session.beginTransaction();
             session.save(catalogrecord);
             transact.commit();
         }
         catch(HibernateException hex){
             if(session!=null)
             {
                 transact.rollback();
                 throw new HibernateException("Not able to save catalogrecord; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                      session.flush();
                      session.close();
                     }      
         
         
     }
    
    @Override
    public void updateCatalogrecord(Catalogrecord catalogrecord) throws Exception {
      Session session = CatalogrecordImplement.getSession();
         Transaction transact=null;
         try{
            
             transact=session.beginTransaction();
             session.update(catalogrecord);
             transact.commit();
         }
         catch(HibernateException hex){
             if(session!=null)
             {
                 transact.rollback();
                 throw new HibernateException("Not able to update catalogrecord; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                     // session.flush();
                      //session.close();
                     }
    }

    @Override
    public Catalogrecord getCatalogrecord(int catalogrecordID) throws Exception {
     Session session = CatalogrecordImplement.getSession();
         Transaction transact=null;
        
          Catalogrecord anCatalogrecord=null;
         try{
             transact=session.beginTransaction();
             anCatalogrecord = (Catalogrecord) session.load(Catalogrecord.class, catalogrecordID);             
             transact.commit();
         }
         catch(HibernateException hex){
             if(session!=null)
             {
                 transact.rollback();
                 throw new HibernateException("Not able to load catalogrecord with id " + catalogrecordID + "; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                  //   session.flush();
                   //  session.close();
                     }
         
        return anCatalogrecord;
    }
    
    

    @Override
    public List<Catalogrecord> getAllCatalogrecord() throws Exception {
         Session session1 = this.getSession();
         Transaction transact=null;
         List<Catalogrecord> catalogrecordList =  new ArrayList<>();
         try{
             transact=session1.beginTransaction();
             catalogrecordList = (List<Catalogrecord>) session1.createQuery("from Catalogrecord").list();
             transact.commit();
             }
         catch(HibernateException hex){
             if(session1!=null)
             {
                 transact.rollback();
                 throw new HibernateException("Not able to load all Catalogrecord; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                      //session1.flush();
                      //session1.close();
                     }
         return catalogrecordList;
    }

@Override
    public void deleteCatalogrecord(Class<?> Catalogrecord, int catalogrecordId) throws Exception{
               
        Session session = CatalogrecordImplement.getSession();
         Transaction transact=null;
         try{
             transact=session.beginTransaction();
             Object persistentInstance = session.load(Catalogrecord, catalogrecordId);
             
                      session.delete(persistentInstance);
                      transact.commit(); 
              }
         catch(HibernateException hex){
             if(session!=null)
             {
                 transact.rollback();
                 throw new HibernateException("Not able to delete catalogrecord; rolling back transaction " + hex.getMessage());
             }
         }
         finally {
                      session.flush();
                      session.close();
                     }
    }

 
    
    
}
