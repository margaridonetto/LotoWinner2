/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preferencias;

import java.util.ArrayList;
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
public class ParesImparesTest {
    
    public ParesImparesTest() {
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
     * Test of getQuantPares method, of class ParesImpares.
     */
    @Test
    public void testGetQuantPares() {
        System.out.println("getQuantPares");
        ParesImpares instance = new ParesImpares();
        int expResult = 0;
        int result = instance.getQuantPares();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantPares method, of class ParesImpares.
     */
    @Test
    public void testSetQuantPares() {
        System.out.println("setQuantPares");
        int quantPares = 0;
        ParesImpares instance = new ParesImpares();
        instance.setQuantPares(quantPares);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of quantidadePares method, of class ParesImpares.
     */
    @Test
    public void testQuantidadePares() {
        System.out.println("quantidadePares");
        int[] combinacao = null;
        int expResult = 0;
        int result = ParesImpares.quantidadePares(combinacao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gerarPares method, of class ParesImpares.
     */
    @Test
    public void testGerarPares() {
        System.out.println("gerarPares");
        int num = 0;
        int expResult = 0;
        int result = ParesImpares.gerarPares(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gerarRepetidosPares method, of class ParesImpares.
     */
    @Test
    public void testGerarRepetidosPares() {
        System.out.println("gerarRepetidosPares");
        int num = 0;
        int[] sorteioAnterior = null;
        int expResult = 0;
        int result = ParesImpares.gerarRepetidosPares(num, sorteioAnterior);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gerarNaoRepetidosPares method, of class ParesImpares.
     */
    @Test
    public void testGerarNaoRepetidosPares() {
        System.out.println("gerarNaoRepetidosPares");
        int num = 0;
        int[] sorteioAnterior = null;
        int expResult = 0;
        int result = ParesImpares.gerarNaoRepetidosPares(num, sorteioAnterior);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gerarImpares method, of class ParesImpares.
     */
    @Test
    public void testGerarImpares() {
        System.out.println("gerarImpares");
        int num = 0;
        int expResult = 0;
        int result = ParesImpares.gerarImpares(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gerarRepetidosImpares method, of class ParesImpares.
     */
    @Test
    public void testGerarRepetidosImpares() {
        System.out.println("gerarRepetidosImpares");
        int num = 0;
        int[] sorteioAnterior = null;
        int expResult = 0;
        int result = ParesImpares.gerarRepetidosImpares(num, sorteioAnterior);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gerarNaoRepetidosImpares method, of class ParesImpares.
     */
    @Test
    public void testGerarNaoRepetidosImpares() {
        System.out.println("gerarNaoRepetidosImpares");
        int num = 0;
        int[] sorteioAnterior = null;
        int expResult = 0;
        int result = ParesImpares.gerarNaoRepetidosImpares(num, sorteioAnterior);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gerarNumero method, of class ParesImpares.
     */
    @Test
    public void testGerarNumero() {
        System.out.println("gerarNumero");
        int min = 0;
        int max = 0;
        int expResult = 0;
        int result = ParesImpares.gerarNumero(min, max);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gerarNumeroApartirArray method, of class ParesImpares.
     */
    @Test
    public void testGerarNumeroApartirArray() {
        System.out.println("gerarNumeroApartirArray");
        ArrayList arrayParaAtualizar = null;
        int expResult = 0;
        int result = ParesImpares.gerarNumeroApartirArray(arrayParaAtualizar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarRepetido method, of class ParesImpares.
     */
    @Test
    public void testVerificarRepetido() {
        System.out.println("verificarRepetido");
        int num = 0;
        int[] combinacao = null;
        boolean expResult = false;
        boolean result = ParesImpares.verificarRepetido(num, combinacao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retirarNum method, of class ParesImpares.
     */
    @Test
    public void testRetirarNum() {
        System.out.println("retirarNum");
        ArrayList array = null;
        int num = 0;
        ArrayList expResult = null;
        ArrayList result = ParesImpares.retirarNum(array, num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
