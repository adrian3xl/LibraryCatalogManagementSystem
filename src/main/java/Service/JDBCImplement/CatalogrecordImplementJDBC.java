/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.JDBCImplement;

import Domain.Catalogrecord;
import Service.ICatalogrecordServiceJDBC;
import java.sql.ResultSet;

/**
 *
 * @author Adrian
 */
public class CatalogrecordImplementJDBC extends JDBCMainConfiguration implements ICatalogrecordServiceJDBC{

    @Override
    public void addCatalogrecordJDBC(Catalogrecord catalogrecord) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateCatalogrecordJDBC(Catalogrecord catalogrecord) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Catalogrecord getCatalogrecordJDBC(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet getAllCatalogrecordJDBC() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteCatalogrecordJDBC(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
