/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package cadastroee.servlets;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author F A M I L I A
 */
public class ServletProdutoNGTest {
    
    public ServletProdutoNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
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
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
