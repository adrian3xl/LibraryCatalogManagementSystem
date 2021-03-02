/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.JDBCImplement;


import Domain.Documenttype;
import Service.IDocumenttypeServiceJDBC;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Adrian
 */
public class DocumenttypeImplementJDBC extends JDBCMainConfiguration implements IDocumenttypeServiceJDBC {
 Statement statement;
    @Override
    public void addDocumenttypeJDBC(Documenttype documenttype) throws Exception {
 
         String insertDocumenttype = "INSERT INTO customer(id,name ) "
                + "values('" +  documenttype.getId() + 
               
                "', '" +  documenttype.getName() +
               
        
                "')";    
        
        statement=this.getConnection().createStatement();        
        statement.execute(insertDocumenttype);      
        
        this.getConnection().close();       
    }

    @Override
    public void updateDocumenttypeJDBC(Documenttype documenttype) throws Exception {
         String updatedocumenttype = "UPDATE customer SET name = '" + documenttype.getName()+ 
        
             
                "' WHERE ID = '"+ documenttype.getId() +"'";        
        
        statement = this.getConnection().createStatement();
        
        int rowsUpdated = statement.executeUpdate(updatedocumenttype);
        if (rowsUpdated > 0) {
            System.out.println("Update Successful");
        }
        
        this.getConnection().close();  
    }

    @Override
    public Documenttype getDocumenttypeJDBC(int documenttypeID) throws Exception {
       String selectDocumenttype = "Select * From Documenttype Where id = " + documenttypeID;
        statement=this.getConnection().createStatement();
        
        ResultSet rs=statement.executeQuery(selectDocumenttype);
        
        Documenttype documenttype=new Documenttype();
        documenttype.setId(documenttypeID);
        
         documenttype.setName(rs.getString("name"));
       
        
        return  documenttype;
        
    }

    @Override
    public ResultSet getAllDocumenttypeJDBC() throws Exception {
       ResultSet rs=null;
        
        String SelectAll="Select * From documenttype";
        statement=this.getConnection().createStatement();
        rs=statement.executeQuery(SelectAll);
        
        return rs;
    }

    @Override
    public void deleteDocumenttypeJDBC(int documenttypeId) throws Exception {
      statement=this.getConnection().createStatement();
        statement.execute("Delete From documenttype Where id = " + documenttypeId);
    }
    
}
