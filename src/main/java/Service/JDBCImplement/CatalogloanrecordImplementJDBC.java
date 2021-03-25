/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.JDBCImplement;

import Domain.Catalogloanrecord;
import Domain.Catalogrecord;
import Domain.Customer;
import Domain.Employee;
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
                "', '" + catalogloanrecord.getCustomer()+
                "', '" + catalogloanrecord.getEmployee()+ 
                "', '" + catalogloanrecord.getLoandate()+ 
                "', '" + catalogloanrecord.getRecieveddate()+ 
                "', '" + catalogloanrecord.getCatalogrecord()+ 
                "', '" + catalogloanrecord.getLoancode() + "')";    
        
        statement=this.getConnection().createStatement();        
        statement.execute(insertCatalogloanrecord);      
        
        this.getConnection().close();       
    }

    @Override
    public void updateCatalogloanrecordJDBC(Catalogloanrecord catalogloanrecord) throws Exception {
         String updateCatalogloanrecord = "UPDATE catalogloanrecord SET loancode = '" + catalogloanrecord.getLoancode()+ 
                "', catalogrecord_id= '" + catalogloanrecord.getCatalogrecord()+ 
                "', customer_id = '" + catalogloanrecord.getCustomer()+ 
                  "', loandate = '" + catalogloanrecord.getLoandate()+ 
                   "', recieveddate = '" + catalogloanrecord.getRecieveddate()+ 
                  
                  "', employee_id = '" + catalogloanrecord.getEmployee()+
         
                 
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
        catalogloanrecord.setLoancode(rs.getString("loancode"));
        catalogloanrecord.setCustomer((int) rs.getObject(" customer_id "));
      catalogloanrecord.setLoandate(rs.getDate("loandate "));
       catalogloanrecord.setEmployee((int) rs.getObject("employee_id "));   
       catalogloanrecord.setRecieveddate(rs.getDate("recieveddate ")); 
       catalogloanrecord.setCatalogrecord(rs.getObject("Catalogrecord_id ",Catalogrecord.class));
       
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
