/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preferencias;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author junio
 */
public class UltimoSorteioTest {
    
    public UltimoSorteioTest() {
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
     * Test of getQuantRepetidos method, of class UltimoSorteio.
     */
    @Test
    public void testGetQuantRepetidos() {
        System.out.println("getQuantRepetidos");
        UltimoSorteio instance = new UltimoSorteio();
        int expResult = 0;
        int result = instance.getQuantRepetidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantRepetidos method, of class UltimoSorteio.
     */
    @Test
    public void testSetQuantRepetidos() {
        System.out.println("setQuantRepetidos");
        int quantRepetidos = 0;
        UltimoSorteio instance = new UltimoSorteio();
        instance.setQuantRepetidos(quantRepetidos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
