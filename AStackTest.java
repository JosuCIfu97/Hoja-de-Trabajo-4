/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Josue
 */
public class AStackTest {
    
    public AStackTest() {
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
     * Test of push method, of class AStack.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object valor = null;
        AStack instance = new AStack();
        instance.push(valor);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of pop method, of class AStack.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        AStack instance = new AStack();
        Object expResult = null;
        Object result = null;
        try{
            result = instance.pop();
        }
        catch (IndexOutOfBoundsException e){
            result = null;
        }
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
