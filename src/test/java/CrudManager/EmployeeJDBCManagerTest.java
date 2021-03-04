/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudManager;

import Domain.Employee;
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
public class EmployeeJDBCManagerTest {
    
    public EmployeeJDBCManagerTest() {
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
     * Test of addEmployeeJDBC method, of class EmployeeJDBCManager.
     */
    @Test
    public void testAddEmployeeJDBC() {
        System.out.println("addEmployeeJDBC");
        Employee anEmployee = null;
        EmployeeJDBCManager instance = new EmployeeJDBCManager();
        instance.addEmployeeJDBC(anEmployee);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmployeeJDBC method, of class EmployeeJDBCManager.
     */
    @Test
    public void testGetEmployeeJDBC() {
        System.out.println("getEmployeeJDBC");
        int employeeId = 0;
        EmployeeJDBCManager instance = new EmployeeJDBCManager();
        Employee expResult = null;
        Employee result = instance.getEmployeeJDBC(employeeId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateEmployeeJDBC method, of class EmployeeJDBCManager.
     */
    @Test
    public void testUpdateEmployeeJDBC() {
        System.out.println("updateEmployeeJDBC");
        Employee anEmployee = null;
        EmployeeJDBCManager instance = new EmployeeJDBCManager();
        instance.updateEmployeeJDBC(anEmployee);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllEmployeeJDBC method, of class EmployeeJDBCManager.
     */
    @Test
    public void testGetAllEmployeeJDBC() {
        System.out.println("getAllEmployeeJDBC");
        EmployeeJDBCManager instance = new EmployeeJDBCManager();
        ResultSet expResult = null;
        ResultSet result = instance.getAllEmployeeJDBC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteEmployeeJDBC method, of class EmployeeJDBCManager.
     */
    @Test
    public void testDeleteEmployeeJDBC() {
        System.out.println("deleteEmployeeJDBC");
        int employeeId = 0;
        EmployeeJDBCManager instance = new EmployeeJDBCManager();
        instance.deleteEmployeeJDBC(employeeId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
