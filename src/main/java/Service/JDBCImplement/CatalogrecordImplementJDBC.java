/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.JDBCImplement;

import Domain.Catalogrecord;
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
         String insertCatalogrecord = "INSERT INTO catalogrecord(id, genre, title, author_id, publisher_id, documenttype_id,daterelease,conditionstatement,catalogcode) "
                + "values('" + catalogrecord.getId() + 
                "', '" + catalogrecord.()+
                "', '" + catalogrecord.() + 
                "', '" + catalogrecord.() + 
                "', '" + catalogrecord.() + 
                "', '" + catalogrecord.() + 
                "', '" + catalogrecord.() + 
                "', '" + catalogrecord.() + "')";    
        
        statement=this.getConnection().createStatement();        
        statement.execute(insertCatalogrecord);      
        
        this.getConnection().close();       
    }

    @Override
    public void updateCatalogrecordJDBC(Catalogrecord catalogrecord) throws Exception {
             String updateCatalogrecord = "UPDATE catalogrecord SET catalogrecordcode = '" + catalogrecord.getcatalogrecordcode()+ 
                "', genre= '" + catalogrecord. () + 
                "',  title = '" + catalogrecord. () + 
                  "', author_id = '" + catalogrecord. () + 
                   "', publisher_id = '" + catalogrecord. () + 
                     "', documenttype_id = '" + catalogrecord. () + 
                       "', conditionstatement = '" + catalogrecord. () +
                  "',  daterelease = '" + catalogrecord. () +
                      "', catalogcode = '" + catalogrecord. () + 
                "' WHERE ID = '"+ catalogrecord.getId() +"'";        
        
        statement = this.getConnection().createStatement();
        
        int rowsUpdated = statement.executeUpdate(updateCatalogrecord);
        if (rowsUpdated > 0) {
            System.out.println("Update Successful");
        }
        
        this.getConnection().close();  
    }


    @Override
    public Catalogrecord getCatalogrecordJDBC(int id) throws Exception {
      String selectCatalogrecord = "Select * From catalogrecord Where id = " + catalogrecordID;
        statement=this.getConnection().createStatement();
        
        ResultSet rs=statement.executeQuery(selectCatalogrecord);
        
        Catalogrecord catalogrecord=new Catalogrecord();
        catalogrecord.setId(catalogrecordID);
        catalogrecord.setloancode(rs.getString("catalogrecord_id"));
        catalogrecord.setFname(rs.getString(" customer_id "));
       catalogrecord.setLname(rs.getString("loandate "));
       cataloglrecord.setLname(rs.getString("recieveddate "));   
       catalogrecord.setLname(rs.getString("employee_id ")); 
       catalogrecord.setLname(rs.getString("loancode "));
       
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
