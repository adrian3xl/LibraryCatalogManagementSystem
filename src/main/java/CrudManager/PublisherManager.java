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
import org.apache.log4j.Logger;
/**
 *
 * @author Adrian
 */
public class PublisherManager {
  final static Logger logger = Logger.getLogger(PublisherManager.class);  
public void addPublisher(Publisher anPublisher)
    {
        try {
            logger.info("In Business Layer addPublisher(Publisher publisher) method");
            System.out.println("In Business Layer addPublisher(Publisher publisher) method");
            Factory factory = new Factory();            
            IPublisherService iPublisherMgr = (IPublisherService) factory.getTheService(IPublisherService.NAME);
            iPublisherMgr.addPublisher(anPublisher);
            
        } catch (ServiceLoadException ex) {
         
           System.out.print(ex.getMessage());
        } catch (Exception ex) {
            
            System.out.print(ex.getMessage());
            logger.error(ex.getMessage());
        }
    }
    public Publisher getPublisher(int PublisherId)
    {
        Publisher anPublisher=new Publisher();
        try {
            logger.info("In Business Layer getPublisher(int publisherId) method");
            System.out.println("In Business Layer getPublisher(int publisherId) method");
            Factory factory = new Factory();           
            IPublisherService iPublisherMgr = (IPublisherService) factory.getTheService(IPublisherService.NAME);
            anPublisher=iPublisherMgr.getPublisher(PublisherId);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
             logger.error(ex.getMessage());
            
        }
        return anPublisher;
    }
    
    public void updatePublisher(Publisher anPublisher)
    {
        try {
            logger.info("In Business Layer updatePublisher(Publisher anPublisher) method");
            System.out.println("In Business Layer updatePublisher(Publisher anPublisher) method");
            Factory factory = new Factory();            
            IPublisherService iPublisherMgr = (IPublisherService) factory.getTheService(IPublisherService.NAME);
            iPublisherMgr.updatePublisher(anPublisher);
            
        } catch (ServiceLoadException ex) {
          
           System.out.println(ex.getMessage()); 
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
            logger.error(ex.getMessage());
        }
    }
    
    public List<Publisher> getAllPublishers()
    {
        List<Publisher> PublisherList = new ArrayList<>();
        try {
            logger.info("In Business Layer getAllAthors method");
            System.out.println("In Business Layer getAllAthors method");
            Factory factory = new Factory();
            IPublisherService iPublisherMgr = (IPublisherService) factory.getTheService(IPublisherService.NAME);
            PublisherList=(List<Publisher>) iPublisherMgr.getAllPublishers();
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
             logger.error(ex.getMessage());
            
        }
        return PublisherList;
    }
    
    
    public void deletePublisher(Class<?> Publisher, int publisherId)
    {
        try {
            logger.info("In Business Layer deletePublisher method");
            System.out.println("In Business Layer deletePublisher method");
            Factory factory = new Factory();
            IPublisherService iPublisherMgr = (IPublisherService) factory.getTheService(IPublisherService.NAME);
            iPublisherMgr.deletePublisher(Publisher, publisherId);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            
            System.out.println(ex.getMessage());
             logger.error(ex.getMessage());
        }
    }

    public PublisherManager() {
    }
    
    
    
}
