/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudManager;
import Domain.Catalogrecord;
import java.util.ArrayList;
import java.util.List;
import Service.Factory;
import Service.ICatalogrecordService;
import Service.Exceptions.ServiceLoadException;
import Service.ICatalogrecordServiceJDBC;
import java.sql.ResultSet;
import org.apache.log4j.Logger;
/**
 *
 * @author Adrian
 */
public class CatalogrecordManager {
    
      final static Logger logger = Logger.getLogger(CatalogrecordManager.class); 
    
public void addCatalogrecord(Catalogrecord anCatalogrecord)
    {
        try {
             logger.info("In Business Layer addCatalogrecord(Catalogrecord catalogrecord) method");
            System.out.println("In Business Layer addCatalogrecord(Catalogrecord catalogrecord) method");
            Factory factory = new Factory();            
            ICatalogrecordService  iCatalogrecordMgr  = (ICatalogrecordService ) factory.getTheService(ICatalogrecordService .NAME);
            iCatalogrecordMgr .addCatalogrecord (anCatalogrecord);
            
        } catch (ServiceLoadException ex) {
         System.out.println(ex.getMessage());
           
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
             logger.error(ex.getMessage());
        }
    }
    public Catalogrecord getCatalogrecord(int catalogrecordId)
    {
        Catalogrecord anCatalogrecord=new Catalogrecord();
        try {
             logger.info("In Business Layer getCatalogrecordJDBC(int catalogrecordId) method");
            System.out.println("In Business Layer getCatalogrecordJDBC(int catalogrecordId) method");
            Factory factory = new Factory();           
            ICatalogrecordService  iCatalogrecordMgr  = (ICatalogrecordService ) factory.getTheService(ICatalogrecordService .NAME);
            anCatalogrecord=iCatalogrecordMgr .getCatalogrecord (catalogrecordId);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
              logger.error(ex.getMessage());
        }
        return anCatalogrecord;
    }
    
    public void updateCatalogrecord(Catalogrecord anCatalogrecord)
    {
        try {
            logger.info("In Business Layer  updateCatalogrecord (Catalogrecord anCatalogrecord) method");
            System.out.println("In Business Layer  updateCatalogrecord (Catalogrecord anCatalogrecord) method");
            Factory factory = new Factory();            
            ICatalogrecordService  iCatalogrecordMgr  = (ICatalogrecordService ) factory.getTheService(ICatalogrecordService .NAME);
            iCatalogrecordMgr .updateCatalogrecord (anCatalogrecord);
            
        } catch (ServiceLoadException ex) {
          
           System.out.println(ex.getMessage()); 
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
             logger.error(ex.getMessage());
        }
    }
    
    public ResultSet getAllCatalogrecord()
    {
        ResultSet rs=null;
        List<Catalogrecord> CatalogrecordList = new ArrayList<>();
        try {
             logger.info("In Business Layer getAllCatalogrecord  method");
            System.out.println("In Business Layer getAllCatalogrecord  method");
            Factory factory = new Factory();
            ICatalogrecordService iCatalogrecordMgr  = (ICatalogrecordService ) factory.getTheService(ICatalogrecordService .NAME);
            rs=(ResultSet) iCatalogrecordMgr.getAllCatalogrecord();
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage()); 
              logger.error(ex.getMessage());
        }
        return rs;
    }
    
    
    public void deleteCatalogrecord(Class<?> Catalogrecord, int catalogrecordId)
    {
        try {
            logger.info("In Business Layer deleteCatalogrecord method");
            System.out.println("In Business Layer deleteCatalogrecord method");
            Factory factory = new Factory();
            ICatalogrecordService  iCatalogrecordMgr  = (ICatalogrecordService ) factory.getTheService(ICatalogrecordService .NAME);
            iCatalogrecordMgr .deleteCatalogrecord (Catalogrecord, catalogrecordId);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            
            System.out.println(ex.getMessage());
              logger.error(ex.getMessage());
        }
    }

    public CatalogrecordManager() {
    }
}