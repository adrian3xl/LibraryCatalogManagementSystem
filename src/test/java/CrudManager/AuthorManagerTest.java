/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudManager;

import Domain.Author;
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
public class AuthorManagerTest {
    
    public AuthorManagerTest() {
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
     * Test of addAuthor method, of class AuthorManager.
     */
    @Test
    public void testAddAuthor() {
        System.out.println("addAuthor");
        Author anAuthor = null;
        AuthorManager instance = new AuthorManager();
        instance.addAuthor(anAuthor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthor method, of class AuthorManager.
     */
    @Test
    public void testGetAuthor() {
        System.out.println("getAuthor");
        int authorId = 0;
        AuthorManager instance = new AuthorManager();
        Author expResult = null;
        Author result = instance.getAuthor(authorId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateAuthor method, of class AuthorManager.
     */
    @Test
    public void testUpdateAuthor() {
        System.out.println("updateAuthor");
        Author anAuthor = null;
        AuthorManager instance = new AuthorManager();
        instance.updateAuthor(anAuthor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllAuthors method, of class AuthorManager.
     */
    @Test
    public void testGetAllAuthors() {
        System.out.println("getAllAuthors");
        AuthorManager instance = new AuthorManager();
        List<Author> expResult = null;
        List<Author> result = instance.getAllAuthors();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAuthor method, of class AuthorManager.
     */
    @Test
    public void testDeleteAuthor() {
        System.out.println("deleteAuthor");
        Class Author = null;
        int authorId = 0;
        AuthorManager instance = new AuthorManager();
        instance.deleteAuthor(Author, authorId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
