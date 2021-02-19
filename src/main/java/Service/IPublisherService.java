/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Domain.Publisher;
import java.sql.ResultSet;

/**
 *
 * @author Adrian
 */
public interface IPublisherService extends IService {
    
 public final String NAME="IPublisherService";
    
    public void addPublisher (Publisher publisher) throws Exception ; //method for adding Publisher
    
    public void updatePublisher (Publisher publisher) throws Exception ; //method for updating a Publisher
    
    public Publisher getPublisher (int id) throws Exception ; //method to select Publisher
    
    public ResultSet getAllPublishers () throws Exception;
    
    public void deletePublisher (int id) throws Exception;
}
