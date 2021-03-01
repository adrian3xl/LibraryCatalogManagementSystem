/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudManager;
import Domain.Publisher;
import java.util.ArrayList;
import java.util.List;
import Service.Factory;
import Service.IPublisherService;
import Service.Exceptions.ServiceLoadException;
import Service.IPublisherServiceJDBC;
import java.sql.ResultSet;
/**
 *
 * @author Adrian
 */
public class PublisherJDBCManager {
    
public void addPublisherJBDC(Publisher anPublisher)
    {
        try {
            System.out.println("In Business Layer addPublisher(Publisher publisher) method");
            Factory factory = new Factory();            
            IPublisherServiceJDBC iPublisherMgrJDBC = (IPublisherServiceJDBC) factory.getTheService(IPublisherServiceJDBC.NAME);
            iPublisherMgrJDBC.addPublisherJDBC(anPublisher);
            
        } catch (ServiceLoadException ex) {
         System.out.println(ex.getMessage());
           
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
        }
    }
    public Publisher getPublisherJDBC(int publisherId)
    {
        Publisher anPublisher=new Publisher();
        try {
            System.out.println("In Business Layer getPublisherJDBC(int publisherId) method");
            Factory factory = new Factory();           
            IPublisherServiceJDBC iPublisherMgrJDBC = (IPublisherServiceJDBC) factory.getTheService(IPublisherServiceJDBC.NAME);
            anPublisher=iPublisherMgrJDBC.getPublisherJDBC(publisherId);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            
        }
        return anPublisher;
    }
    
    public void updatePublisherJDBC(Publisher anPublisher)
    {
        try {
            System.out.println("In Business Layer  updatePublisherJDBC(Publisher anPublisher) method");
            Factory factory = new Factory();            
            IPublisherServiceJDBC iPublisherMgrJDBC = (IPublisherServiceJDBC) factory.getTheService(IPublisherServiceJDBC.NAME);
            iPublisherMgrJDBC.updatePublisherJDBC(anPublisher);
            
        } catch (ServiceLoadException ex) {
          
           System.out.println(ex.getMessage()); 
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
        }
    }
    
    public ResultSet getAllPublishersJDBC()
    {
        ResultSet rs=null;
        List<Publisher> publishersList = new ArrayList<>();
        try {
            System.out.println("In Business Layer getAllAthors JDBC method");
            Factory factory = new Factory();
            IPublisherServiceJDBC iPublisherMgrJDBC = (IPublisherServiceJDBC) factory.getTheService(IPublisherServiceJDBC.NAME);
            rs=iPublisherMgrJDBC.getAllPublishersJDBC();
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());            
        }
        return rs;
    }
    
    
    public void deletePublisherJDBC(int publisherId)
    {
        try {
            System.out.println("In Business Layer deleteAuhor JDBC method");
            Factory factory = new Factory();
            IPublisherServiceJDBC iPublisherMgrJDBC = (IPublisherServiceJDBC) factory.getTheService(IPublisherServiceJDBC.NAME);
            iPublisherMgrJDBC.deletePublisherJDBC(publisherId);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            
            System.out.println(ex.getMessage());
        }
    }

    public PublisherJDBCManager() {
    }
    
    
    
}
