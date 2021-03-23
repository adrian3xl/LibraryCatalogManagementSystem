/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import CrudManager.AuthorManager;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.table.AbstractTableModel;
import org.apache.log4j.Logger;

/**
 *
 * @author Adrian
 */
public class ResultSetTblModel extends AbstractTableModel{

    private Boolean connectToDatabase= false;
     private AuthorManager authorMgr;
    private ResultSet resultSet;
    private ResultSetMetaData mataData;
    private int numberOfRows; 
    
       final static Logger logger = Logger.getLogger(ResultSetTblModel.class); 
    
    public ResultSetTblModel ()
    { 
    }
    
    /**
     *
     * @param objectType
     */
    public void viewAll(String objectType)
    {
        try {
            
        if(objectType.equals("author"))
        {
            authorMgr = new AuthorManager();
            System.out.println("Getting ResultSet");
            resultSet= (ResultSet) authorMgr.getAllAuthors();
            System.out.println("Got ResultSet");
            connectToDatabase=true;
            System.out.println("connect to database set to true");
        }
        
        
        mataData= resultSet.getMetaData();
        
        resultSet.last();
        numberOfRows=resultSet.getRow();
        
        fireTableStructureChanged();
        
    }catch (SQLException ex) {
                  
    logger.error(ex.getMessage());
     }
    }
    
    @Override
    public int getRowCount() {
       
        return numberOfRows;
    }

    @Override
    public int getColumnCount() {
        
        int numColumn = 0;
        
        try {
            numColumn=mataData.getColumnCount();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(ResultSetTblModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  numColumn;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        Object obj = new Object();
        try{
            
            resultSet.absolute(rowIndex + 1);
            obj=resultSet.getObject(columnIndex +1 );
            
        }catch(SQLException ex){
            
          java.util.logging.Logger.getLogger(ResultSetTblModel.class.getName()).log(Level.SEVERE, null, ex);  
        }
        return obj;
    }
    

}
