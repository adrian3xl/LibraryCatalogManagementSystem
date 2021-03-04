/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudManager;

import Domain.Customer;
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
public class CustomerManagerTest {
    
    public CustomerManagerTest() {
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
     * Test of addCustomer method, of class CustomerManager.
     */
    @Test
    public void testAddCustomer() {
        System.out.println("addCustomer");
        Customer anCustomer = null;
        CustomerManager instance = new CustomerManager();
        instance.addCustomer(anCustomer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomer method, of class CustomerManager.
     */
    @Test
    public void testGetCustomer() {
        System.out.println("getCustomer");
        int customerId = 0;
        CustomerManager instance = new CustomerManager();
        Customer expResult = null;
        Customer result = instance.getCustomer(customerId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCustomer method, of class CustomerManager.
     */
    @Test
    public void testUpdateCustomer() {
        System.out.println("updateCustomer");
        Customer anCustomer = null;
        CustomerManager instance = new CustomerManager();
        instance.updateCustomer(anCustomer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllCustomer method, of class CustomerManager.
     */
    @Test
    public void testGetAllCustomer() {
        System.out.println("getAllCustomer");
        CustomerManager instance = new CustomerManager();
        List<Customer> expResult = null;
        List<Customer> result = instance.getAllCustomer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteCustomer method, of class CustomerManager.
     */
    @Test
    public void testDeleteCustomer() {
        System.out.println("deleteCustomer");
        Class Customer = null;
        int customerId = 0;
        CustomerManager instance = new CustomerManager();
        instance.deleteCustomer(Customer, customerId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
