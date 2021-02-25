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
    public void updatePublisherJDBC(Publisher publisher) throws Exception  
    {  String updatePublisher = "UPDATE publisher SET publishercode = '" + publisher.getPublisherCode()+ 
                "', firstname = '" + publisher.getFname() + 
                "', lastname = '" + publisher.getFname() + 
                
                "' WHERE ID = '"+ publisher.getId() +"'";        
        
        statement = this.getConnection().createStatement();
        
        int rowsUpdated = statement.executeUpdate(updatePublisher);
        if (rowsUpdated > 0) {
            System.out.println("Update Successful");
        }
        
        this.getConnection().close();  
    }

    @Override
    public Publisher getPublisherJDBC(int publisherID) throws Exception {
        String selectPublisher = "Select * From publisher Where id = " + publisherID;
        statement=this.getConnection().createStatement();
        
        ResultSet rs=statement.executeQuery(selectPublisher);
        
        Publisher publisher =new Publisher();
        publisher.setId(publisherID);
        publisher.setPublisherCode(rs.getString("publishercode"));
        publisher.setFname(rs.getString("firstname"));
        publisher.setLname(rs.getString("lastname"));
             
        
        return publisher ;
        
    }

    @Override
    public ResultSet getAllPublishersJDBC() throws Exception {
     ResultSet rs=null;
        
        String SelectAll="Select * From publisher";
        statement=this.getConnection().createStatement();
        rs=statement.executeQuery(SelectAll);
        
        return rs;
    }

    @Override
    public void deletePublisherJDBC(int publisherId) throws Exception {
     statement=this.getConnection().createStatement();
        statement.execute("Delete From publisher Where id = " + publisherId);
    }

}
