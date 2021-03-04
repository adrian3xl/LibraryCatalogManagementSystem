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
import org.junit.Ignore;

/**
 *
 * @author Adrian
 */
@Ignore
public class CatalogloanrecordManagerTest {
    
    public CatalogloanrecordManagerTest() {
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
     * Test of addCatalogloanrecord method, of class CatalogloanrecordManager.
     */
    @Test
    public void testAddCatalogloanrecord() {
        System.out.println("addCatalogloanrecord");
        Catalogloanrecord anCatalogloanrecord = null;
        CatalogloanrecordManager instance = new CatalogloanrecordManager();
        instance.addCatalogloanrecord(anCatalogloanrecord);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCatalogloanrecord method, of class CatalogloanrecordManager.
     */
    @Test
    public void testGetCatalogloanrecord() {
        System.out.println("getCatalogloanrecord");
        int catalogloanrecordId = 0;
        CatalogloanrecordManager instance = new CatalogloanrecordManager();
        Catalogloanrecord expResult = null;
        Catalogloanrecord result = instance.getCatalogloanrecord(catalogloanrecordId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCatalogloanrecord method, of class CatalogloanrecordManager.
     */
    @Test
    public void testUpdateCatalogloanrecord() {
        System.out.println("updateCatalogloanrecord");
        Catalogloanrecord anCatalogloanrecord = null;
        CatalogloanrecordManager instance = new CatalogloanrecordManager();
        instance.updateCatalogloanrecord(anCatalogloanrecord);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllCatalogloanrecord method, of class CatalogloanrecordManager.
     */
    @Test
    public void testGetAllCatalogloanrecord() {
        System.out.println("getAllCatalogloanrecord");
        CatalogloanrecordManager instance = new CatalogloanrecordManager();
        ResultSet expResult = null;
        ResultSet result = instance.getAllCatalogloanrecord();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteCatalogloanrecord method, of class CatalogloanrecordManager.
     */
    @Test
    public void testDeleteCatalogloanrecord() {
        System.out.println("deleteCatalogloanrecord");
        int catalogloanrecordId = 0;
        CatalogloanrecordManager instance = new CatalogloanrecordManager();
        instance.deleteCatalogloanrecord(catalogloanrecordId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
