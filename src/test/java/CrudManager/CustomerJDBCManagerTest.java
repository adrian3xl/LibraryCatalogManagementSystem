/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudManager;

import Domain.Customer;
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
public class CustomerJDBCManagerTest {
    
    public CustomerJDBCManagerTest() {
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
     * Test of addCustomerJDBC method, of class CustomerJDBCManager.
     */
    @Test
    public void testAddCustomerJDBC() {
        System.out.println("addCustomerJDBC");
        Customer anCustomer = null;
        CustomerJDBCManager instance = new CustomerJDBCManager();
        instance.addCustomerJDBC(anCustomer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomerJDBC method, of class CustomerJDBCManager.
     */
    @Test
    public void testGetCustomerJDBC() {
        System.out.println("getCustomerJDBC");
        int customerId = 0;
        CustomerJDBCManager instance = new CustomerJDBCManager();
        Customer expResult = null;
        Customer result = instance.getCustomerJDBC(customerId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCustomerJDBC method, of class CustomerJDBCManager.
     */
    @Test
    public void testUpdateCustomerJDBC() {
        System.out.println("updateCustomerJDBC");
        Customer anCustomer = null;
        CustomerJDBCManager instance = new CustomerJDBCManager();
        instance.updateCustomerJDBC(anCustomer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllCustomerJDBC method, of class CustomerJDBCManager.
     */
    @Test
    public void testGetAllCustomerJDBC() {
        System.out.println("getAllCustomerJDBC");
        CustomerJDBCManager instance = new CustomerJDBCManager();
        ResultSet expResult = null;
        ResultSet result = instance.getAllCustomerJDBC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteCustomerJDBC method, of class CustomerJDBCManager.
     */
    @Test
    public void testDeleteCustomerJDBC() {
        System.out.println("deleteCustomerJDBC");
        int customerId = 0;
        CustomerJDBCManager instance = new CustomerJDBCManager();
        instance.deleteCustomerJDBC(customerId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
