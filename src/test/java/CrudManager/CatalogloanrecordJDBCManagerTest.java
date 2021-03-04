/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudManager;

import Domain.Catalogloanrecord;
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
public class CatalogloanrecordJDBCManagerTest {
    
    public CatalogloanrecordJDBCManagerTest() {
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
     * Test of addCatalogloanrecordJDBC method, of class CatalogloanrecordJDBCManager.
     */
    @Test
    public void testAddCatalogloanrecordJDBC() {
        System.out.println("addCatalogloanrecordJDBC");
        Catalogloanrecord anCatalogloanrecord = null;
        CatalogloanrecordJDBCManager instance = new CatalogloanrecordJDBCManager();
        instance.addCatalogloanrecordJDBC(anCatalogloanrecord);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCatalogloanrecordJDBC method, of class CatalogloanrecordJDBCManager.
     */
    @Test
    public void testGetCatalogloanrecordJDBC() {
        System.out.println("getCatalogloanrecordJDBC");
        int catalogloanrecordId = 0;
        CatalogloanrecordJDBCManager instance = new CatalogloanrecordJDBCManager();
        Catalogloanrecord expResult = null;
        Catalogloanrecord result = instance.getCatalogloanrecordJDBC(catalogloanrecordId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCatalogloanrecordJDBC method, of class CatalogloanrecordJDBCManager.
     */
    @Test
    public void testUpdateCatalogloanrecordJDBC() {
        System.out.println("updateCatalogloanrecordJDBC");
        Catalogloanrecord anCatalogloanrecord = null;
        CatalogloanrecordJDBCManager instance = new CatalogloanrecordJDBCManager();
        instance.updateCatalogloanrecordJDBC(anCatalogloanrecord);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllCatalogloanrecordJDBC method, of class CatalogloanrecordJDBCManager.
     */
    @Test
    public void testGetAllCatalogloanrecordJDBC() {
        System.out.println("getAllCatalogloanrecordJDBC");
        CatalogloanrecordJDBCManager instance = new CatalogloanrecordJDBCManager();
        ResultSet expResult = null;
        ResultSet result = instance.getAllCatalogloanrecordJDBC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteCatalogloanrecordJDBC method, of class CatalogloanrecordJDBCManager.
     */
    @Test
    public void testDeleteCatalogloanrecordJDBC() {
        System.out.println("deleteCatalogloanrecordJDBC");
        int catalogloanrecordId = 0;
        CatalogloanrecordJDBCManager instance = new CatalogloanrecordJDBCManager();
        instance.deleteCatalogloanrecordJDBC(catalogloanrecordId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
