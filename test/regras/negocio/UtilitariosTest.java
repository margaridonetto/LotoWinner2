/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regras.negocio;

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
public class UtilitariosTest {
    
    public UtilitariosTest() {
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
     * Test of zerarVet method, of class Utilitarios.
     */
    @Test
    public void testZerarVet() {
        System.out.println("zerarVet");
        int[] vetor = null;
        Utilitarios.zerarVet(vetor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarQuantNumeros method, of class Utilitarios.
     */
    @Test
    public void testVerificarQuantNumeros() {
        System.out.println("verificarQuantNumeros");
        int[] combinacao = null;
        int expResult = 0;
        int result = Utilitarios.verificarQuantNumeros(combinacao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ordenar method, of class Utilitarios.
     */
    @Test
    public void testOrdenar() {
        System.out.println("ordenar");
        int[] vetor = null;
        Utilitarios.ordenar(vetor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarRepetido method, of class Utilitarios.
     */
    @Test
    public void testVerificarRepetido() {
        System.out.println("verificarRepetido");
        int num = 0;
        int[] combinacao = null;
        boolean expResult = false;
        boolean result = Utilitarios.verificarRepetido(num, combinacao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of carregarUltimoSorteio method, of class Utilitarios.
     */
    @Test
    public void testCarregarUltimoSorteio() {
        System.out.println("carregarUltimoSorteio");
        int[] ultimoSorteio = null;
        int[] expResult = null;
        int[] result = Utilitarios.carregarUltimoSorteio(ultimoSorteio);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of paresUltimoSorteio method, of class Utilitarios.
     */
    @Test
    public void testParesUltimoSorteio() {
        System.out.println("paresUltimoSorteio");
        int[] sorteioAnterior = null;
        ArrayList expResult = null;
        ArrayList result = Utilitarios.paresUltimoSorteio(sorteioAnterior);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of imparesUltimoSorteio method, of class Utilitarios.
     */
    @Test
    public void testImparesUltimoSorteio() {
        System.out.println("imparesUltimoSorteio");
        int[] sorteioAnterior = null;
        ArrayList expResult = null;
        ArrayList result = Utilitarios.imparesUltimoSorteio(sorteioAnterior);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of paresQueNaoSairam method, of class Utilitarios.
     */
    @Test
    public void testParesQueNaoSairam() {
        System.out.println("paresQueNaoSairam");
        int[] sorteioAnterior = null;
        ArrayList expResult = null;
        ArrayList result = Utilitarios.paresQueNaoSairam(sorteioAnterior);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of imparesQueNaoSairam method, of class Utilitarios.
     */
    @Test
    public void testImparesQueNaoSairam() {
        System.out.println("imparesQueNaoSairam");
        int[] sorteioAnterior = null;
        ArrayList expResult = null;
        ArrayList result = Utilitarios.imparesQueNaoSairam(sorteioAnterior);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adicionarZero method, of class Utilitarios.
     */
    @Test
    public void testAdicionarZero() {
        System.out.println("adicionarZero");
        int[] combinacoes = null;
        String expResult = "";
        String result = Utilitarios.adicionarZero(combinacoes);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ordenarCartela method, of class Utilitarios.
     */
    @Test
    public void testOrdenarCartela() {
        System.out.println("ordenarCartela");
        int[] vetor = null;
        int[] expResult = null;
        int[] result = Utilitarios.ordenarCartela(vetor);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gerarRandom method, of class Utilitarios.
     */
    @Test
    public void testGerarRandom() {
        System.out.println("gerarRandom");
        int min = 0;
        int max = 0;
        int qntNumerosGerados = 0;
        int[] expResult = null;
        int[] result = Utilitarios.gerarRandom(min, max, qntNumerosGerados);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
