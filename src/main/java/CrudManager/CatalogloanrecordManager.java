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
public class CatalogloanrecordManager {
    
     final static Logger logger = Logger.getLogger(CatalogloanrecordManager.class); 
    
public void addCatalogloanrecord(Catalogloanrecord anCatalogloanrecord)
    {
        try {
             logger.info("In Business Layer addCatalogloanrecord(Catalogloanrecord catalogloanrecord) method");
            System.out.println("In Business Layer addCatalogloanrecord(Catalogloanrecord catalogloanrecord) method");
            Factory factory = new Factory();            
            ICatalogloanrecordService  iCatalogloanrecordMgr  = (ICatalogloanrecordService ) factory.getTheService(ICatalogloanrecordService .NAME);
            iCatalogloanrecordMgr .addCatalogloanrecord (anCatalogloanrecord);
            
        } catch (ServiceLoadException ex) {
         System.out.println(ex.getMessage());
           
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
             logger.error(ex.getMessage());
        }
    }
    public Catalogloanrecord getCatalogloanrecord(int catalogloanrecordId)
    {
        Catalogloanrecord anCatalogloanrecord=new Catalogloanrecord();
        try {
            logger.info("In Business Layer getCatalogloanrecordJDBC(int catalogloanrecordId) method");
            System.out.println("In Business Layer getCatalogloanrecordJDBC(int catalogloanrecordId) method");
            Factory factory = new Factory();           
            ICatalogloanrecordService  iCatalogloanrecordMgr  = (ICatalogloanrecordService ) factory.getTheService(ICatalogloanrecordService .NAME);
            anCatalogloanrecord=iCatalogloanrecordMgr .getCatalogloanrecord (catalogloanrecordId);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
                   logger.error(ex.getMessage());
        }
        return anCatalogloanrecord;
    }
    
    public void updateCatalogloanrecord(Catalogloanrecord anCatalogloanrecord)
    {
        try {
            logger.info("In Business Layer updateCatalogloanrecord (Catalogloanrecord anCatalogloanrecord) method");
            System.out.println("In Business Layer  updateCatalogloanrecord (Catalogloanrecord anCatalogloanrecord) method");
            Factory factory = new Factory();            
            ICatalogloanrecordService  iCatalogloanrecordMgr  = (ICatalogloanrecordService ) factory.getTheService(ICatalogloanrecordService .NAME);
            iCatalogloanrecordMgr .updateCatalogloanrecord (anCatalogloanrecord);
            
        } catch (ServiceLoadException ex) {
          
           System.out.println(ex.getMessage()); 
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
             logger.error(ex.getMessage());
        }
    }
    
    public ResultSet getAllCatalogloanrecord()
    {
        ResultSet rs=null;
        List<Catalogloanrecord> CatalogloanrecordList = new ArrayList<>();
        try {
             logger.info("In Business Layer  getAllCatalogloanrecord  method");
            System.out.println("In Business Layer getAllCatalogloanrecord  method");
            Factory factory = new Factory();
            ICatalogloanrecordService iCatalogloanrecordMgr  = (ICatalogloanrecordService ) factory.getTheService(ICatalogloanrecordService .NAME);
            rs=(ResultSet) iCatalogloanrecordMgr.getAllCatalogloanrecord();
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());     
              logger.error(ex.getMessage());
        }
        return rs;
    }
    
    
    public void deleteCatalogloanrecord(int catalogloanrecordId)
    {
        try {
             logger.info("In Business Layer deleteCatalogloanrecord method");
            System.out.println("In Business Layer deleteCatalogloanrecord method");
            Factory factory = new Factory();
            ICatalogloanrecordService  iCatalogloanrecordMgr  = (ICatalogloanrecordService ) factory.getTheService(ICatalogloanrecordService .NAME);
            iCatalogloanrecordMgr .deleteCatalogloanrecord (catalogloanrecordId);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            
            System.out.println(ex.getMessage());
              logger.error(ex.getMessage());
        }
    }

    public CatalogloanrecordManager() {
    }
    
    
    
}
