/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudManager;

import Domain.Documenttype;
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
public class DocumenttypeJDBCManagerTest {
    
    public DocumenttypeJDBCManagerTest() {
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
     * Test of addDocumenttypeJDBC method, of class DocumenttypeJDBCManager.
     */
    @Test
    public void testAddDocumenttypeJDBC() {
        System.out.println("addDocumenttypeJDBC");
        Documenttype anDocumenttype = null;
        DocumenttypeJDBCManager instance = new DocumenttypeJDBCManager();
        instance.addDocumenttypeJDBC(anDocumenttype);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDocumenttypeJDBC method, of class DocumenttypeJDBCManager.
     */
    @Test
    public void testGetDocumenttypeJDBC() {
        System.out.println("getDocumenttypeJDBC");
        int documenttypeId = 0;
        DocumenttypeJDBCManager instance = new DocumenttypeJDBCManager();
        Documenttype expResult = null;
        Documenttype result = instance.getDocumenttypeJDBC(documenttypeId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateDocumenttypeJDBC method, of class DocumenttypeJDBCManager.
     */
    @Test
    public void testUpdateDocumenttypeJDBC() {
        System.out.println("updateDocumenttypeJDBC");
        Documenttype anDocumenttype = null;
        DocumenttypeJDBCManager instance = new DocumenttypeJDBCManager();
        instance.updateDocumenttypeJDBC(anDocumenttype);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllDocumenttypeJDBC method, of class DocumenttypeJDBCManager.
     */
    @Test
    public void testGetAllDocumenttypeJDBC() {
        System.out.println("getAllDocumenttypeJDBC");
        DocumenttypeJDBCManager instance = new DocumenttypeJDBCManager();
        ResultSet expResult = null;
        ResultSet result = instance.getAllDocumenttypeJDBC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteDocumenttypeJDBC method, of class DocumenttypeJDBCManager.
     */
    @Test
    public void testDeleteDocumenttypeJDBC() {
        System.out.println("deleteDocumenttypeJDBC");
        int documenttypeId = 0;
        DocumenttypeJDBCManager instance = new DocumenttypeJDBCManager();
        instance.deleteDocumenttypeJDBC(documenttypeId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
