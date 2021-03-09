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
public class DocumenttypeManager {
     final static Logger logger = Logger.getLogger(DocumenttypeManager.class); 
public void addDocumenttype (Documenttype anDocumenttype)
    {
        try {
            logger.info("In Business Layer addDocumenttype(Documenttype documenttype) method");
            System.out.println("In Business Layer addDocumenttype(Documenttype documenttype) method");
            Factory factory = new Factory();            
            IDocumenttypeService  iDocumenttypeMgr  = (IDocumenttypeService ) factory.getTheService(IDocumenttypeService .NAME);
            iDocumenttypeMgr .addDocumenttype (anDocumenttype);
            
        } catch (ServiceLoadException ex) {
         System.out.println(ex.getMessage());
           
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
           logger.error(ex.getMessage());
        }
    }
    public Documenttype getDocumenttype (int documenttypeId)
    {
        Documenttype anDocumenttype=new Documenttype();
        try {
            logger.info("In Business Layer getDocumenttype (int documenttypeId) method");
            System.out.println("In Business Layer getDocumenttype (int documenttypeId) method");
            Factory factory = new Factory();           
            IDocumenttypeService iDocumenttypeMgr  = (IDocumenttypeService ) factory.getTheService(IDocumenttypeService .NAME);
            anDocumenttype=iDocumenttypeMgr .getDocumenttype (documenttypeId);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
              logger.error(ex.getMessage());
        }
        return anDocumenttype;
    }
    
    public void updateDocumenttype (Documenttype anDocumenttype)
    {
        try {
            logger.info("In Business Layer  updateDocumenttype (Documenttype anDocumenttype) method");
            System.out.println("In Business Layer  updateDocumenttype (Documenttype anDocumenttype) method");
            Factory factory = new Factory();            
            IDocumenttypeService  iDocumenttypeMgr  = (IDocumenttypeService ) factory.getTheService(IDocumenttypeService .NAME);
            iDocumenttypeMgr .updateDocumenttype (anDocumenttype);
            
        } catch (ServiceLoadException ex) {
          
           System.out.println(ex.getMessage()); 
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
             logger.error(ex.getMessage());
        }
    }
    
    public ResultSet getAllDocumenttype ()
    {
        ResultSet rs=null;
        List<Documenttype> documenttypesList = new ArrayList<>();
        try {
            logger.info("In Business Layer getAllAthors   method");
            System.out.println("In Business Layer getAllAthors   method");
            Factory factory = new Factory();
            IDocumenttypeService  iDocumenttypeMgr  = (IDocumenttypeService ) factory.getTheService(IDocumenttypeService .NAME);
            rs=iDocumenttypeMgr .getAllDocumenttype ();
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());    
              logger.error(ex.getMessage());
        }
        return rs;
    }
    
    
    public void deleteDocumenttype(Class<?> Documenttype, int documenttypeId)
    {
        try {
            logger.info("In Business Layer deleteAuhor   method");
            System.out.println("In Business Layer deleteAuhor   method");
            Factory factory = new Factory();
            IDocumenttypeService  iDocumenttypeMgr  = (IDocumenttypeService ) factory.getTheService(IDocumenttypeService .NAME);
            iDocumenttypeMgr .deleteDocumenttype (Documenttype,documenttypeId);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            
            System.out.println(ex.getMessage());
              logger.error(ex.getMessage());
        }
    }

    public DocumenttypeManager() {
    }
    
    
    
}
