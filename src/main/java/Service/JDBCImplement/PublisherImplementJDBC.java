/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.JDBCImplement;

import Domain.Publisher;
import Service.IPublisherServiceJDBC;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Adrian
 */
public class PublisherImplementJDBC extends JDBCMainConfiguration implements IPublisherServiceJDBC {

    Statement statement;
    
    @Override
    public void addPublisherJDBC(Publisher publisher) throws Exception {
          String insertAuthor = "INSERT INTO publisher(id, publishercode, firstname, lastname) "
                + "values('" + publisher.getId() + 
                "', '" + publisher.getPublisherCode()+
                "', '" + publisher.getFname() + 
                "', '" + publisher.getLname() + "')";    
        
        statement=this.getConnection().createStatement();        
        statement.execute(insertAuthor);      
        
        this.getConnection().close();       
    }


    @Override
    public void updatePublisherJDBC(Publisher publisher) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Publisher getPublisherJDBC(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet getAllPublishersJDBC() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletePublisherJDBC(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
