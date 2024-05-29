/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package cadastroee.servlets;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author F A M I L I A
 */
public class ServletProdutoTest {
    
    public ServletProdutoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of processRequest method, of class ServletProduto.
     */
    @Test
    public void testProcessRequest() throws Exception {
        System.out.println("processRequest");
        Object request = null;
        Object response = null;
        ServletProduto instance = new ServletProduto();
        instance.processRequest(request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doGet method, of class ServletProduto.
     */
    @Test
    public void testDoGet() throws Exception {
        System.out.println("doGet");
        Object request = null;
        Object response = null;
        ServletProduto instance = new ServletProduto();
        instance.doGet(request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doPost method, of class ServletProduto.
     */
    @Test
    public void testDoPost() throws Exception {
        System.out.println("doPost");
        Object request = null;
        Object response = null;
        ServletProduto instance = new ServletProduto();
        instance.doPost(request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getServletInfo method, of class ServletProduto.
     */
    @Test
    public void testGetServletInfo() {
        System.out.println("getServletInfo");
        ServletProduto instance = new ServletProduto();
        String expResult = "";
        String result = instance.getServletInfo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
