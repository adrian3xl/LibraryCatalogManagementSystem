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
public class GenreJDBCManagerTest {
    
    public GenreJDBCManagerTest() {
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
     * Test of addGenreJDBC method, of class GenreJDBCManager.
     */
    @Test
    public void testAddGenreJDBC() {
        System.out.println("addGenreJDBC");
        Genre anGenre = null;
        GenreJDBCManager instance = new GenreJDBCManager();
        instance.addGenreJDBC(anGenre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGenreJDBC method, of class GenreJDBCManager.
     */
    @Test
    public void testGetGenreJDBC() {
        System.out.println("getGenreJDBC");
        int genreId = 0;
        GenreJDBCManager instance = new GenreJDBCManager();
        Genre expResult = null;
        Genre result = instance.getGenreJDBC(genreId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateGenreJDBC method, of class GenreJDBCManager.
     */
    @Test
    public void testUpdateGenreJDBC() {
        System.out.println("updateGenreJDBC");
        Genre anGenre = null;
        GenreJDBCManager instance = new GenreJDBCManager();
        instance.updateGenreJDBC(anGenre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllGenreJDBC method, of class GenreJDBCManager.
     */
    @Test
    public void testGetAllGenreJDBC() {
        System.out.println("getAllGenreJDBC");
        GenreJDBCManager instance = new GenreJDBCManager();
        ResultSet expResult = null;
        ResultSet result = instance.getAllGenreJDBC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteGenreJDBC method, of class GenreJDBCManager.
     */
    @Test
    public void testDeleteGenreJDBC() {
        System.out.println("deleteGenreJDBC");
        int genreId = 0;
        GenreJDBCManager instance = new GenreJDBCManager();
        instance.deleteGenreJDBC(genreId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
