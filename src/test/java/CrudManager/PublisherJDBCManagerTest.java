/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudManager;

import Domain.Publisher;
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
public class PublisherJDBCManagerTest {
    
    public PublisherJDBCManagerTest() {
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
     * Test of addPublisherJBDC method, of class PublisherJDBCManager.
     */
    @Test
    public void testAddPublisherJBDC() {
        System.out.println("addPublisherJBDC");
        Publisher anPublisher = null;
        PublisherJDBCManager instance = new PublisherJDBCManager();
        instance.addPublisherJBDC(anPublisher);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPublisherJDBC method, of class PublisherJDBCManager.
     */
    @Test
    public void testGetPublisherJDBC() {
        System.out.println("getPublisherJDBC");
        int publisherId = 0;
        PublisherJDBCManager instance = new PublisherJDBCManager();
        Publisher expResult = null;
        Publisher result = instance.getPublisherJDBC(publisherId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePublisherJDBC method, of class PublisherJDBCManager.
     */
    @Test
    public void testUpdatePublisherJDBC() {
        System.out.println("updatePublisherJDBC");
        Publisher anPublisher = null;
        PublisherJDBCManager instance = new PublisherJDBCManager();
        instance.updatePublisherJDBC(anPublisher);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllPublishersJDBC method, of class PublisherJDBCManager.
     */
    @Test
    public void testGetAllPublishersJDBC() {
        System.out.println("getAllPublishersJDBC");
        PublisherJDBCManager instance = new PublisherJDBCManager();
        ResultSet expResult = null;
        ResultSet result = instance.getAllPublishersJDBC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletePublisherJDBC method, of class PublisherJDBCManager.
     */
    @Test
    public void testDeletePublisherJDBC() {
        System.out.println("deletePublisherJDBC");
        int publisherId = 0;
        PublisherJDBCManager instance = new PublisherJDBCManager();
        instance.deletePublisherJDBC(publisherId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
