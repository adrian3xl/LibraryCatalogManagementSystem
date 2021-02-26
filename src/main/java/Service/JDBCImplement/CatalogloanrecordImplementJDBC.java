/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.JDBCImplement;

import Domain.Catalogloanrecord;
import Service.ICatalogloanrecordServiceJDBC;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Adrian
 */
public class CatalogloanrecordImplementJDBC extends JDBCMainConfiguration implements ICatalogloanrecordServiceJDBC {
 Statement statement;
 
    @Override
    public void addCatalogloanrecordJDBC(Catalogloanrecord catalogloanrecord) throws Exception {
       String insertCatalogloanrecord = "INSERT INTO catalogloanrecord(id, catalogloanrecord_id, customer_id, loandate, recieveddate,loancode,employee_id) "
                + "values('" + catalogloanrecord.getId() + 
                "', '" + catalogloanrecord.()+
                "', '" + catalogloanrecord.() + 
                "', '" + catalogloanrecord.() + 
                "', '" + catalogloanrecord.() + 
                "', '" + catalogloanrecord.() + 
                "', '" + catalogloanrecord.() + 
                "', '" + catalogloanrecord.() + "')";    
        
        statement=this.getConnection().createStatement();        
        statement.execute(insertCatalogloanrecord);      
        
        this.getConnection().close();       
    }

    @Override
    public void updateCatalogloanrecordJDBC(Catalogloanrecord catalogloanrecord) throws Exception {
         String updateCatalogloanrecord = "UPDATE catalogloanrecord SET loancode = '" + catalogloanrecord.getloancode()+ 
                "', catalogrecord_id= '" + catalogloanrecord. () + 
                "', customer_id = '" + catalogloanrecord. () + 
                  "', loandate = '" + catalogloanrecord. () + 
                   "', recieveddate = '" + catalogloanrecord. () + 
                  
                  "', employee_id = '" + catalogloanrecord. () + 
                "' WHERE ID = '"+ catalogloanrecord.getId() +"'";        
        
        statement = this.getConnection().createStatement();
        
        int rowsUpdated = statement.executeUpdate(updateCatalogloanrecord);
        if (rowsUpdated > 0) {
            System.out.println("Update Successful");
        }
        
        this.getConnection().close();  
    }

    @Override
    public Catalogloanrecord getCatalogloanrecordJDBC(int catalogloanrecordID) throws Exception {
        String selectCatalogloanrecord = "Select * From catalogloanrecord Where id = " + catalogloanrecordID;
        statement=this.getConnection().createStatement();
        
        ResultSet rs=statement.executeQuery(selectCatalogloanrecord);
        
        Catalogloanrecord catalogloanrecord=new Catalogloanrecord();
        catalogloanrecord.setId(catalogloanrecordID);
        catalogloanrecord.setloancode(rs.getString("catalogrecord_id"));
        catalogloanrecord.setFname(rs.getString(" customer_id "));
       catalogloanrecord.setLname(rs.getString("loandate "));
       catalogloanrecord.setLname(rs.getString("recieveddate "));   
       catalogloanrecord.setLname(rs.getString("employee_id ")); 
       catalogloanrecord.setLname(rs.getString("loancode "));
       
        return catalogloanrecord;
        
    }

    @Override
    public ResultSet getAllCatalogloanrecordJDBC() throws Exception {
          ResultSet rs=null;
        
        String SelectAll="Select * From catalogloanrecord";
        statement=this.getConnection().createStatement();
        rs=statement.executeQuery(SelectAll);
        
        return rs;
    }

    @Override
    public void deleteCatalogloanrecordJDBC(int catalogloanrecordId) throws Exception {
     statement=this.getConnection().createStatement();
        statement.execute("Delete From catalogloanrecord Where id = " + catalogloanrecordId);
    }

}
