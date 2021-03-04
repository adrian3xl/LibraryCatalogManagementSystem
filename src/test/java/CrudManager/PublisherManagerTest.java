/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudManager;

import Domain.Publisher;
import java.util.List;
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
public class PublisherManagerTest {
    
    public PublisherManagerTest() {
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
     * Test of addPublisher method, of class PublisherManager.
     */
    @Test
    public void testAddPublisher() {
        System.out.println("addPublisher");
        Publisher anPublisher = null;
        PublisherManager instance = new PublisherManager();
        instance.addPublisher(anPublisher);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPublisher method, of class PublisherManager.
     */
    @Test
    public void testGetPublisher() {
        System.out.println("getPublisher");
        int PublisherId = 0;
        PublisherManager instance = new PublisherManager();
        Publisher expResult = null;
        Publisher result = instance.getPublisher(PublisherId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePublisher method, of class PublisherManager.
     */
    @Test
    public void testUpdatePublisher() {
        System.out.println("updatePublisher");
        Publisher anPublisher = null;
        PublisherManager instance = new PublisherManager();
        instance.updatePublisher(anPublisher);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllPublishers method, of class PublisherManager.
     */
    @Test
    public void testGetAllPublishers() {
        System.out.println("getAllPublishers");
        PublisherManager instance = new PublisherManager();
        List<Publisher> expResult = null;
        List<Publisher> result = instance.getAllPublishers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletePublisher method, of class PublisherManager.
     */
    @Test
    public void testDeletePublisher() {
        System.out.println("deletePublisher");
        Class Publisher = null;
        int publisherId = 0;
        PublisherManager instance = new PublisherManager();
        instance.deletePublisher(Publisher, publisherId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
