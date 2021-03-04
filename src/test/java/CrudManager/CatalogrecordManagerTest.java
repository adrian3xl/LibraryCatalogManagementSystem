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

/**
 *
 * @author Adrian
 */
public class CatalogrecordManagerTest {
    
    public CatalogrecordManagerTest() {
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
     * Test of addCatalogrecord method, of class CatalogrecordManager.
     */
    @Test
    public void testAddCatalogrecord() {
        System.out.println("addCatalogrecord");
        Catalogrecord anCatalogrecord = null;
        CatalogrecordManager instance = new CatalogrecordManager();
        instance.addCatalogrecord(anCatalogrecord);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCatalogrecord method, of class CatalogrecordManager.
     */
    @Test
    public void testGetCatalogrecord() {
        System.out.println("getCatalogrecord");
        int catalogrecordId = 0;
        CatalogrecordManager instance = new CatalogrecordManager();
        Catalogrecord expResult = null;
        Catalogrecord result = instance.getCatalogrecord(catalogrecordId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCatalogrecord method, of class CatalogrecordManager.
     */
    @Test
    public void testUpdateCatalogrecord() {
        System.out.println("updateCatalogrecord");
        Catalogrecord anCatalogrecord = null;
        CatalogrecordManager instance = new CatalogrecordManager();
        instance.updateCatalogrecord(anCatalogrecord);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllCatalogrecord method, of class CatalogrecordManager.
     */
    @Test
    public void testGetAllCatalogrecord() {
        System.out.println("getAllCatalogrecord");
        CatalogrecordManager instance = new CatalogrecordManager();
        ResultSet expResult = null;
        ResultSet result = instance.getAllCatalogrecord();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteCatalogrecord method, of class CatalogrecordManager.
     */
    @Test
    public void testDeleteCatalogrecord() {
        System.out.println("deleteCatalogrecord");
        Class Catalogrecord = null;
        int catalogrecordId = 0;
        CatalogrecordManager instance = new CatalogrecordManager();
        instance.deleteCatalogrecord(Catalogrecord, catalogrecordId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
