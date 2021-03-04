/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudManager;

import Domain.Catalogrecord;
import java.sql.ResultSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Adrian
 */
@Ignore
public class CatalogrecordJDBCManagerTest {
    
    public CatalogrecordJDBCManagerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addCatalogrecordJDBC method, of class CatalogrecordJDBCManager.
     */
    @Test
    public void testAddCatalogrecordJDBC() {
        System.out.println("addCatalogrecordJDBC");
        Catalogrecord anCatalogrecord = null;
        CatalogrecordJDBCManager instance = new CatalogrecordJDBCManager();
        instance.addCatalogrecordJDBC(anCatalogrecord);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCatalogrecordJDBC method, of class CatalogrecordJDBCManager.
     */
    @Test
    public void testGetCatalogrecordJDBC() {
        System.out.println("getCatalogrecordJDBC");
        int catalogrecordId = 0;
        CatalogrecordJDBCManager instance = new CatalogrecordJDBCManager();
        Catalogrecord expResult = null;
        Catalogrecord result = instance.getCatalogrecordJDBC(catalogrecordId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCatalogrecordJDBC method, of class CatalogrecordJDBCManager.
     */
    @Test
    public void testUpdateCatalogrecordJDBC() {
        System.out.println("updateCatalogrecordJDBC");
        Catalogrecord anCatalogrecord = null;
        CatalogrecordJDBCManager instance = new CatalogrecordJDBCManager();
        instance.updateCatalogrecordJDBC(anCatalogrecord);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllCatalogrecordJDBC method, of class CatalogrecordJDBCManager.
     */
    @Test
    public void testGetAllCatalogrecordJDBC() {
        System.out.println("getAllCatalogrecordJDBC");
        CatalogrecordJDBCManager instance = new CatalogrecordJDBCManager();
        ResultSet expResult = null;
        ResultSet result = instance.getAllCatalogrecordJDBC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteCatalogrecordJDBC method, of class CatalogrecordJDBCManager.
     */
    @Test
    public void testDeleteCatalogrecordJDBC() {
        System.out.println("deleteCatalogrecordJDBC");
        int catalogrecordId = 0;
        CatalogrecordJDBCManager instance = new CatalogrecordJDBCManager();
        instance.deleteCatalogrecordJDBC(catalogrecordId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
