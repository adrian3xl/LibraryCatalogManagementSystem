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
public class CatalogrecordJDBCManager {
    
      final static Logger logger = Logger.getLogger(CatalogloanrecordManager.class); 
public void addCatalogrecordJDBC(Catalogrecord anCatalogrecord)
    {
        try {
              logger.info("In Business Layer addCatalogrecord(Catalogrecord catalogrecord) method");
            System.out.println("In Business Layer addCatalogrecord(Catalogrecord catalogrecord) method");
            Factory factory = new Factory();            
            ICatalogrecordServiceJDBC iCatalogrecordMgrJDBC = (ICatalogrecordServiceJDBC) factory.getTheService(ICatalogrecordServiceJDBC.NAME);
            iCatalogrecordMgrJDBC.addCatalogrecordJDBC(anCatalogrecord);
            
        } catch (ServiceLoadException ex) {
         System.out.println(ex.getMessage());
           
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
            logger.error(ex.getMessage());
        }
    }
    public Catalogrecord getCatalogrecordJDBC(int catalogrecordId)
    {
        Catalogrecord anCatalogrecord=new Catalogrecord();
        try {
             logger.info("In Business Layer getCatalogrecordJDBC(int catalogrecordId) method");
            System.out.println("In Business Layer getCatalogrecordJDBC(int catalogrecordId) method");
            Factory factory = new Factory();           
            ICatalogrecordServiceJDBC iCatalogrecordMgrJDBC = (ICatalogrecordServiceJDBC) factory.getTheService(ICatalogrecordServiceJDBC.NAME);
            anCatalogrecord=iCatalogrecordMgrJDBC.getCatalogrecordJDBC(catalogrecordId);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
             logger.error(ex.getMessage());
        }
        return anCatalogrecord;
    }
    
    public void updateCatalogrecordJDBC(Catalogrecord anCatalogrecord)
    {
        try {
            logger.info("In Business Layer  updateCatalogrecordJDBC(Catalogrecord anCatalogrecord) method");
            System.out.println("In Business Layer  updateCatalogrecordJDBC(Catalogrecord anCatalogrecord) method");
            Factory factory = new Factory();            
            ICatalogrecordServiceJDBC iCatalogrecordMgrJDBC = (ICatalogrecordServiceJDBC) factory.getTheService(ICatalogrecordServiceJDBC.NAME);
            iCatalogrecordMgrJDBC.updateCatalogrecordJDBC(anCatalogrecord);
            
        } catch (ServiceLoadException ex) {
          
           System.out.println(ex.getMessage()); 
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
            logger.error(ex.getMessage());
        }
    }
    
    public ResultSet getAllCatalogrecordJDBC()
    {
        ResultSet rs=null;
        List<Catalogrecord> CatalogrecordList = new ArrayList<>();
        try {
            System.out.println("In Business Layer getAllCatalogrecord JDBC method");
            Factory factory = new Factory();
            ICatalogrecordServiceJDBC iCatalogrecordMgrJDBC = (ICatalogrecordServiceJDBC) factory.getTheService(ICatalogrecordServiceJDBC.NAME);
            rs=iCatalogrecordMgrJDBC.getAllCatalogrecordJDBC();
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage()); 
             logger.error(ex.getMessage());
        }
        return rs;
    }
    
    
    public void deleteCatalogrecordJDBC(int catalogrecordId)
    {
        try {
             logger.info("In Business Layer deleteCatalogrecord JDBC method");
            System.out.println("In Business Layer deleteCatalogrecord JDBC method");
            Factory factory = new Factory();
            ICatalogrecordServiceJDBC iCatalogrecordMgrJDBC = (ICatalogrecordServiceJDBC) factory.getTheService(ICatalogrecordServiceJDBC.NAME);
            iCatalogrecordMgrJDBC.deleteCatalogrecordJDBC(catalogrecordId);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            
            System.out.println(ex.getMessage());
             logger.error(ex.getMessage());
        }
    }

    public CatalogrecordJDBCManager() {
    }
    
    
    
}