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
public class VStackTest {
    
    public VStackTest() {
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
     * Test of push method, of class VStack.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object valor = null;
        VStack instance = new VStack();
        instance.push(valor);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of pop method, of class VStack.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        VStack instance = new VStack();
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
