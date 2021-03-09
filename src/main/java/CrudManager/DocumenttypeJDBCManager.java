/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudManager;
import Domain.Documenttype;
import java.util.ArrayList;
import java.util.List;
import Service.Factory;
import Service.IDocumenttypeService;
import Service.Exceptions.ServiceLoadException;
import Service.IDocumenttypeServiceJDBC;
import java.sql.ResultSet;
import org.apache.log4j.Logger;
/**
 *
 * @author Adrian
 */
public class DocumenttypeJDBCManager {
     final static Logger logger = Logger.getLogger(CustomerManager.class); 
public void addDocumenttypeJDBC(Documenttype anDocumenttype)
    {
        try {
            logger.info("In Business Layer addDocumenttype(Documenttype documenttype) method");
            logger.info("In Business Layer addDocumenttype(Documenttype documenttype) method");
            System.out.println("In Business Layer addDocumenttype(Documenttype documenttype) method");
            Factory factory = new Factory();            
            IDocumenttypeServiceJDBC iDocumenttypeMgrJDBC = (IDocumenttypeServiceJDBC) factory.getTheService(IDocumenttypeServiceJDBC.NAME);
            iDocumenttypeMgrJDBC.addDocumenttypeJDBC(anDocumenttype);
            
        } catch (ServiceLoadException ex) {
         System.out.println(ex.getMessage());
           
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
           logger.error(ex.getMessage()); 
        }
    }
    public Documenttype getDocumenttypeJDBC(int documenttypeId)
    {
        Documenttype anDocumenttype=new Documenttype();
        try {
            logger.info("In Business Layer getDocumenttypeJDBC(int documenttypeId) method");
            System.out.println("In Business Layer getDocumenttypeJDBC(int documenttypeId) method");
            Factory factory = new Factory();           
            IDocumenttypeServiceJDBC iDocumenttypeMgrJDBC = (IDocumenttypeServiceJDBC) factory.getTheService(IDocumenttypeServiceJDBC.NAME);
            anDocumenttype=iDocumenttypeMgrJDBC.getDocumenttypeJDBC(documenttypeId);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
              logger.error(ex.getMessage()); 
        }
        return anDocumenttype;
    }
    
    public void updateDocumenttypeJDBC(Documenttype anDocumenttype)
    {
        try {
            logger.info("In Business Layer  updateDocumenttypeJDBC(Documenttype anDocumenttype) method");
            System.out.println("In Business Layer  updateDocumenttypeJDBC(Documenttype anDocumenttype) method");
            Factory factory = new Factory();            
            IDocumenttypeServiceJDBC iDocumenttypeMgrJDBC = (IDocumenttypeServiceJDBC) factory.getTheService(IDocumenttypeServiceJDBC.NAME);
            iDocumenttypeMgrJDBC.updateDocumenttypeJDBC(anDocumenttype);
            
        } catch (ServiceLoadException ex) {
          
           System.out.println(ex.getMessage()); 
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
             logger.error(ex.getMessage()); 
        }
    }
    
    public ResultSet getAllDocumenttypeJDBC()
    {
        ResultSet rs=null;
        List<Documenttype> documenttypesList = new ArrayList<>();
        try {
            logger.info("In Business Layer getAllAthors JDBC method");
            System.out.println("In Business Layer getAllAthors JDBC method");
            Factory factory = new Factory();
            IDocumenttypeServiceJDBC iDocumenttypeMgrJDBC = (IDocumenttypeServiceJDBC) factory.getTheService(IDocumenttypeServiceJDBC.NAME);
            rs=iDocumenttypeMgrJDBC.getAllDocumenttypeJDBC();
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());  
              logger.error(ex.getMessage()); 
        }
        return rs;
    }
    
    
    public void deleteDocumenttypeJDBC(int documenttypeId)
    {
        try {
            logger.info("In Business Layer deleteAuhor JDBC method");
            System.out.println("In Business Layer deleteAuhor JDBC method");
            Factory factory = new Factory();
            IDocumenttypeServiceJDBC iDocumenttypeMgrJDBC = (IDocumenttypeServiceJDBC) factory.getTheService(IDocumenttypeServiceJDBC.NAME);
            iDocumenttypeMgrJDBC.deleteDocumenttypeJDBC(documenttypeId);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            
            System.out.println(ex.getMessage());
              logger.error(ex.getMessage()); 
        }
    }

    public DocumenttypeJDBCManager() {
    }
    
    
    
}
