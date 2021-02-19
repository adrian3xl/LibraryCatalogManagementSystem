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
public interface IPublisherServiceJDBC extends IService {
    
    public final String NAME="IPublisherServiceJDBC";
    
    public void addPublisherJDBC(Publisher publisher) throws Exception ; //method for adding book
    
    public void updatePublisherJDBC(Publisher publisher) throws Exception ; //method for updating a book
    
    public Publisher getPublisherJDBC(int id) throws Exception ; //method to select book
    
    public ResultSet getAllPublishersJDBC() throws Exception;
    
    public void deletePublisherJDBC(int id) throws Exception;
}
