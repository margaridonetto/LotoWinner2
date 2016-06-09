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
public class GerarCombinacaoDuasPreferenciasTest {
    
    public GerarCombinacaoDuasPreferenciasTest() {
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
     * Test of gerarCombinacao method, of class GerarCombinacaoDuasPreferencias.
     */
    @Test
    public void testGerarCombinacao() {
        System.out.println("gerarCombinacao");
        int quantPares = 0;
        int quantRepetidos = 0;
        int[] sorteioAnterior = null;
        int[] excluir = null;
        int[] priorizar = null;
        int[] expResult = null;
        int[] result = GerarCombinacaoDuasPreferencias.gerarCombinacao(quantPares, quantRepetidos, sorteioAnterior, excluir, priorizar);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
