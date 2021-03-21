/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.JDBCImplement;

import Domain.Author;
import Domain.Catalogrecord;
import Domain.Publisher;
import Service.ICatalogrecordServiceJDBC;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Adrian
 */
public class CatalogrecordImplementJDBC extends JDBCMainConfiguration implements ICatalogrecordServiceJDBC{

    Statement statement;
    @Override
    public void addCatalogrecordJDBC(Catalogrecord catalogrecord) throws Exception {
         String insertCatalogrecord = "INSERT INTO catalogrecord(id, genre, title, author_id, publisher_id, documenttype_id,datereleased,conditionstatement,catalogcode) "
                + "values('" + catalogrecord.getId() + 
                "', '" + catalogrecord.getTitle()+
                "', '" + catalogrecord.getAuthor()+ 
                "', '" + catalogrecord.getPublisher()+ 
                "', '" + catalogrecord.getGenre()+ 
                "', '" + catalogrecord.getDocumenttype()+ 
                "', '" + catalogrecord.getDatereleased()+ 
                  "', '" + catalogrecord.getCatalogcode()+ 
                "', '" + catalogrecord.getConditionstatement()+ "')";    
        
        statement=this.getConnection().createStatement();        
        statement.execute(insertCatalogrecord);      
        
        this.getConnection().close();       
    }

    @Override
    public void updateCatalogrecordJDBC(Catalogrecord catalogrecord) throws Exception {
             String updateCatalogrecord = "UPDATE catalogrecord SET catalogcode = '" + catalogrecord.getCatalogcode()+ 
                "', genre= '" + catalogrecord.getGenre()+ 
                "',  title = '" + catalogrecord.getTitle()+ 
                  "', author_id = '" + catalogrecord.getAuthor()+ 
                   "', publisher_id = '" + catalogrecord.getPublisher()+ 
                     "', documenttype_id = '" + catalogrecord.getDocumenttype()+ 
                       "', conditionstatement = '" + catalogrecord.getConditionstatement()+
                  "',  datereleased = '" + catalogrecord.getDatereleased()+
                  
                "' WHERE ID = '"+ catalogrecord.getId() +"'";        
        
        statement = this.getConnection().createStatement();
        
        int rowsUpdated = statement.executeUpdate(updateCatalogrecord);
        if (rowsUpdated > 0) {
            System.out.println("Update Successful");
        }
        
        this.getConnection().close();  
    }


    @Override
    public Catalogrecord getCatalogrecordJDBC(int catalogrecordID) throws Exception {
      String selectCatalogrecord = "Select * From catalogrecord Where id = " + catalogrecordID;
        statement=this.getConnection().createStatement();
        
        ResultSet rs=statement.executeQuery(selectCatalogrecord);
        
        Catalogrecord catalogrecord=new Catalogrecord();
        catalogrecord.setId(catalogrecordID);
        catalogrecord.setCatalogcode(rs.getString("catalogrecord_id"));
        catalogrecord.setAuthor(rs.getObject("author_id", Author.class));
          catalogrecord.setPublisher(rs.getObject("publisher_id ", Publisher.class));
     catalogrecord.setDatereleased(rs.getDate("datereleased"));   
       catalogrecord.setConditionstatement(rs.getString("conditionstatement ")); 
       catalogrecord.setCatalogcode(rs.getString("catalogcode "));
       
        return catalogrecord;
        
    }

    @Override
    public ResultSet getAllCatalogrecordJDBC() throws Exception {
       ResultSet rs=null;
        
        String SelectAll="Select * From catalogrecord";
        statement=this.getConnection().createStatement();
        rs=statement.executeQuery(SelectAll);
        
        return rs;
    }

    @Override
    public void deleteCatalogrecordJDBC(int catalogrecordId) throws Exception {
     statement=this.getConnection().createStatement();
        statement.execute("Delete From catalogrecord Where id = " + catalogrecordId);
    }
    
}
