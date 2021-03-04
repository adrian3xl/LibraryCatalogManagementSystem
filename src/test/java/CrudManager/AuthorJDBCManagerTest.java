/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudManager;

import Domain.Author;
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
public class AuthorJDBCManagerTest {
    
    public AuthorJDBCManagerTest() {
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
     * Test of addAuthorJDBC method, of class AuthorJDBCManager.
     */
    @Test
    public void testAddAuthorJDBC() {
        System.out.println("addAuthorJDBC");
        Author anAuthor = new Author(20,"Adrian","Peterson","AP1");
        AuthorJDBCManager instance = new AuthorJDBCManager();
        instance.addAuthorJDBC(anAuthor);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorJDBC method, of class AuthorJDBCManager.
     */
    @Test
    public void testGetAuthorJDBC() {
        System.out.println("getAuthorJDBC");
        int authorId = 1;
        AuthorJDBCManager instance = new AuthorJDBCManager();
        Author expResult = new Author(20,"Adrian","Bailey","AB1");
        Author result = instance.getAuthorJDBC(authorId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of updateAuthorJDBC method, of class AuthorJDBCManager.
     */
    @Test
    public void testUpdateAuthorJDBC() {
        System.out.println("updateAuthorJDBC");
        Author anAuthor = null;
        AuthorJDBCManager instance = new AuthorJDBCManager();
        instance.updateAuthorJDBC(anAuthor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllAuthorsJDBC method, of class AuthorJDBCManager.
     */
    @Test
    public void testGetAllAuthorsJDBC() {
        System.out.println("getAllAuthorsJDBC");
        AuthorJDBCManager instance = new AuthorJDBCManager();
        ResultSet expResult = null;
        ResultSet result = instance.getAllAuthorsJDBC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAuthorJDBC method, of class AuthorJDBCManager.
     */
    @Test
    public void testDeleteAuthorJDBC() {
        System.out.println("deleteAuthorJDBC");
        int authorId = 0;
        AuthorJDBCManager instance = new AuthorJDBCManager();
        instance.deleteAuthorJDBC(authorId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
