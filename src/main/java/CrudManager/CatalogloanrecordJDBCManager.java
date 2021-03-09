/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudManager;
import Domain.Catalogloanrecord;
import java.util.ArrayList;
import java.util.List;
import Service.Factory;
import Service.ICatalogloanrecordService;
import Service.Exceptions.ServiceLoadException;
import Service.ICatalogloanrecordServiceJDBC;
import java.sql.ResultSet;
import org.apache.log4j.Logger;
/**
 *
 * @author Adrian
 */
public class CatalogloanrecordJDBCManager {
    final static Logger logger = Logger.getLogger(CatalogloanrecordJDBCManager.class); 
    
public void addCatalogloanrecordJDBC(Catalogloanrecord anCatalogloanrecord)
    {
        try {
            logger.info("In Business Layer addCatalogloanrecord(Catalogloanrecord catalogloanrecord) method1");
            System.out.println("In Business Layer addCatalogloanrecord(Catalogloanrecord catalogloanrecord) method");
            Factory factory = new Factory();            
            ICatalogloanrecordServiceJDBC iCatalogloanrecordMgrJDBC = (ICatalogloanrecordServiceJDBC) factory.getTheService(ICatalogloanrecordServiceJDBC.NAME);
            iCatalogloanrecordMgrJDBC.addCatalogloanrecordJDBC(anCatalogloanrecord);
            
        } catch (ServiceLoadException ex) {
         System.out.println(ex.getMessage());
           
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
            logger.error(ex.getMessage());
        }
    }
    public Catalogloanrecord getCatalogloanrecordJDBC(int catalogloanrecordId)
    {
        Catalogloanrecord anCatalogloanrecord=new Catalogloanrecord();
        try {
             logger.info("In Business Layer getCatalogloanrecordJDBC(int catalogloanrecordId) method");
            System.out.println("In Business Layer getCatalogloanrecordJDBC(int catalogloanrecordId) method");
            Factory factory = new Factory();           
            ICatalogloanrecordServiceJDBC iCatalogloanrecordMgrJDBC = (ICatalogloanrecordServiceJDBC) factory.getTheService(ICatalogloanrecordServiceJDBC.NAME);
            anCatalogloanrecord=iCatalogloanrecordMgrJDBC.getCatalogloanrecordJDBC(catalogloanrecordId);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
             logger.error(ex.getMessage());
        }
        return anCatalogloanrecord;
    }
    
    public void updateCatalogloanrecordJDBC(Catalogloanrecord anCatalogloanrecord)
    {
        try {
             logger.info("In Business Layer  updateCatalogloanrecordJDBC(Catalogloanrecord anCatalogloanrecord) method");
            System.out.println("In Business Layer  updateCatalogloanrecordJDBC(Catalogloanrecord anCatalogloanrecord) method");
            Factory factory = new Factory();            
            ICatalogloanrecordServiceJDBC iCatalogloanrecordMgrJDBC = (ICatalogloanrecordServiceJDBC) factory.getTheService(ICatalogloanrecordServiceJDBC.NAME);
            iCatalogloanrecordMgrJDBC.updateCatalogloanrecordJDBC(anCatalogloanrecord);
            
        } catch (ServiceLoadException ex) {
          
           System.out.println(ex.getMessage()); 
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
            logger.error(ex.getMessage());
        }
    }
    
    public ResultSet getAllCatalogloanrecordJDBC()
    {
        ResultSet rs=null;
        List<Catalogloanrecord> CatalogloanrecordList = new ArrayList<>();
        try {
             logger.info("In Business Layer getCatalogloanrecordJDBC(int catalogloanrecordId) method");
            System.out.println("In Business Layer getAllCatalogloanrecord JDBC method");
            Factory factory = new Factory();
            ICatalogloanrecordServiceJDBC iCatalogloanrecordMgrJDBC = (ICatalogloanrecordServiceJDBC) factory.getTheService(ICatalogloanrecordServiceJDBC.NAME);
            rs=iCatalogloanrecordMgrJDBC.getAllCatalogloanrecordJDBC();
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage()); 
             logger.error(ex.getMessage());
        }
        return rs;
    }
    
    
    public void deleteCatalogloanrecordJDBC(int catalogloanrecordId)
    {
        try {
            logger.info("In Business Layer deleteCatalogloanrecord JDBC method");
            System.out.println("In Business Layer deleteCatalogloanrecord JDBC method");
            Factory factory = new Factory();
            ICatalogloanrecordServiceJDBC iCatalogloanrecordMgrJDBC = (ICatalogloanrecordServiceJDBC) factory.getTheService(ICatalogloanrecordServiceJDBC.NAME);
            iCatalogloanrecordMgrJDBC.deleteCatalogloanrecordJDBC(catalogloanrecordId);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            
            System.out.println(ex.getMessage());
            logger.error(ex.getMessage());
        }
    }

    public CatalogloanrecordJDBCManager() {
    }
    
    
    
}

