/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudManager;

import Domain.Genre;
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
public class GenreManagerTest {
    
    public GenreManagerTest() {
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
     * Test of addGenre method, of class GenreManager.
     */
    @Test
    public void testAddGenre() {
        System.out.println("addGenre");
        Genre anGenre = null;
        GenreManager instance = new GenreManager();
        instance.addGenre(anGenre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGenre method, of class GenreManager.
     */
    @Test
    public void testGetGenre() {
        System.out.println("getGenre");
        int genreId = 0;
        GenreManager instance = new GenreManager();
        Genre expResult = null;
        Genre result = instance.getGenre(genreId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateGenre method, of class GenreManager.
     */
    @Test
    public void testUpdateGenre() {
        System.out.println("updateGenre");
        Genre anGenre = null;
        GenreManager instance = new GenreManager();
        instance.updateGenre(anGenre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllGenre method, of class GenreManager.
     */
    @Test
    public void testGetAllGenre() {
        System.out.println("getAllGenre");
        GenreManager instance = new GenreManager();
        ResultSet expResult = null;
        ResultSet result = instance.getAllGenre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteGenre method, of class GenreManager.
     */
    @Test
    public void testDeleteGenre() {
        System.out.println("deleteGenre");
        Class Genre = null;
        int genreId = 0;
        GenreManager instance = new GenreManager();
        instance.deleteGenre(Genre, genreId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
