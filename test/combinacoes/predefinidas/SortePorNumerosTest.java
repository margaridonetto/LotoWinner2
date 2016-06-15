/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combinacoes.predefinidas;

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

public class SortePorNumerosTest {
    
    private SortePorNumeros sorte; //Declara a classe que deseja testar.
    private ArrayList<Integer> numerosSelecionados = new ArrayList<Integer>();
    
    public SortePorNumerosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        sorte = new SortePorNumeros(); //Instancia a classe no setUp.
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of gera01Cartela20Numeros method, of class SortePorNumeros.
     */
    @Test
    public void testGera01Cartela20Numeros() {
        System.out.println("gera01Cartela20Numeros");
        for (int i = 1; i <= 20; i++) {
            numerosSelecionados.add(i); //Números que quero testar
        }
        int[] expResult = new int[15]; //Resultado que espero
        expResult[0] = 1;
        expResult[1] = 2;
        expResult[2] = 3;
        expResult[3] = 4;
        expResult[4] = 6;
        expResult[5] = 7;
        expResult[6] = 8;
        expResult[7] = 9;
        expResult[8] = 10;
        expResult[9] = 11;
        expResult[10] = 12;
        expResult[11] = 13;
        expResult[12] = 15;
        expResult[13] = 16;
        expResult[14] = 20;
        
        int[] result = sorte.gera01Cartela20Numeros(numerosSelecionados); //Jogo os numeros de teste na classe q quero.
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of gera02Cartela20Numeros method, of class SortePorNumeros.
     */
    @Test
    public void testGera02Cartela20Numeros() {
        System.out.println("gera02Cartela20Numeros");
        for (int i = 1; i <= 20; i++) {
            numerosSelecionados.add(i);
        }
        int[] expResult = new int[15]; 
        expResult[0] = 1;
        expResult[1] = 2;
        expResult[2] = 4;
        expResult[3] = 5;
        expResult[4] = 6;
        expResult[5] = 8;
        expResult[6] = 10;
        expResult[7] = 11;
        expResult[8] = 12;
        expResult[9] = 14;
        expResult[10] = 15;
        expResult[11] = 16;
        expResult[12] = 17;
        expResult[13] = 18;
        expResult[14] = 19;
        
        int[] result = sorte.gera02Cartela20Numeros(numerosSelecionados);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of gera03Cartela20Numeros method, of class SortePorNumeros.
     */
    @Test
    public void testGera03Cartela20Numeros() {
        System.out.println("gera03Cartela20Numeros");
        for (int i = 1; i <= 20; i++) {
            numerosSelecionados.add(i);
        }
        int[] expResult = new int[15]; 
        expResult[0] = 1;
        expResult[1] = 3;
        expResult[2] = 4;
        expResult[3] = 5;
        expResult[4] = 6;
        expResult[5] = 7;
        expResult[6] = 9;
        expResult[7] = 10;
        expResult[8] = 12;
        expResult[9] = 13;
        expResult[10] = 14;
        expResult[11] = 17;
        expResult[12] = 18;
        expResult[13] = 19;
        expResult[14] = 20;
        
        int[] result = sorte.gera03Cartela20Numeros(numerosSelecionados);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of gera04Cartela20Numeros method, of class SortePorNumeros.
     */
    @Test
    public void testGera04Cartela20Numeros() {
        System.out.println("gera04Cartela20Numeros");
        for (int i = 1; i <= 20; i++) {
            numerosSelecionados.add(i);
        }
        int[] expResult = new int[15]; 
        expResult[0] = 2;
        expResult[1] = 3;
        expResult[2] = 5;
        expResult[3] = 7;
        expResult[4] = 8;
        expResult[5] = 9;
        expResult[6] = 11;
        expResult[7] = 13;
        expResult[8] = 14;
        expResult[9] = 15;
        expResult[10] = 16;
        expResult[11] = 17;
        expResult[12] = 18;
        expResult[13] = 19;
        expResult[14] = 20;
        
        int[] result = sorte.gera04Cartela20Numeros(numerosSelecionados);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of gera01Cartela22Numeros method, of class SortePorNumeros.
     */
    @Test
    public void testGera01Cartela22Numeros() {
        System.out.println("gera01Cartela22Numeros");
        for (int i = 1; i <= 22; i++) {
            numerosSelecionados.add(i);
        }
        int[] expResult = new int[15]; 
        expResult[0] = 1;
        expResult[1] = 2;
        expResult[2] = 4;
        expResult[3] = 6;
        expResult[4] = 8;
        expResult[5] = 11;
        expResult[6] = 12;
        expResult[7] = 13;
        expResult[8] = 14;
        expResult[9] = 15;
        expResult[10] = 16;
        expResult[11] = 17;
        expResult[12] = 18;
        expResult[13] = 19;
        expResult[14] = 20;
        
        int[] result = sorte.gera01Cartela22Numeros(numerosSelecionados);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of gera02Cartela22Numeros method, of class SortePorNumeros.
     */
    @Test
    public void testGera02Cartela22Numeros() {
        System.out.println("gera02Cartela22Numeros");
        for (int i = 1; i <= 22; i++) {
            numerosSelecionados.add(i);
        }
        int[] expResult = new int[15]; 
        expResult[0] = 3;
        expResult[1] = 5;
        expResult[2] = 7;
        expResult[3] = 9;
        expResult[4] = 10;
        expResult[5] = 11;
        expResult[6] = 13;
        expResult[7] = 14;
        expResult[8] = 15;
        expResult[9] = 16;
        expResult[10] = 17;
        expResult[11] = 18;
        expResult[12] = 19;
        expResult[13] = 20;
        expResult[14] = 21;
        
        int[] result = sorte.gera02Cartela22Numeros(numerosSelecionados);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of gera03Cartela22Numeros method, of class SortePorNumeros.
     */
    @Test
    public void testGera03Cartela22Numeros() {
        System.out.println("gera03Cartela22Numeros");
        for (int i = 1; i <= 22; i++) {
            numerosSelecionados.add(i);
        }
        int[] expResult = new int[15]; 
        expResult[0] = 1;
        expResult[1] = 2;
        expResult[2] = 4;
        expResult[3] = 6;
        expResult[4] = 8;
        expResult[5] = 12;
        expResult[6] = 14;
        expResult[7] = 15;
        expResult[8] = 16;
        expResult[9] = 17;
        expResult[10] = 18;
        expResult[11] = 19;
        expResult[12] = 20;
        expResult[13] = 21;
        expResult[14] = 22;
        
        int[] result = sorte.gera03Cartela22Numeros(numerosSelecionados);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of gera04Cartela22Numeros method, of class SortePorNumeros.
     */
    @Test
    public void testGera04Cartela22Numeros() {
        System.out.println("gera04Cartela22Numeros");
        for (int i = 1; i <= 22; i++) {
            numerosSelecionados.add(i);
        }
        int[] expResult = new int[15]; 
        expResult[0] = 3;
        expResult[1] = 5;
        expResult[2] = 7;
        expResult[3] = 9;
        expResult[4] = 10;
        expResult[5] = 13;
        expResult[6] = 14;
        expResult[7] = 15;
        expResult[8] = 16;
        expResult[9] = 17;
        expResult[10] = 18;
        expResult[11] = 19;
        expResult[12] = 20;
        expResult[13] = 21;
        expResult[14] = 22;
        
        int[] result = sorte.gera04Cartela22Numeros(numerosSelecionados);
        assertArrayEquals(expResult, result);
    }
    
}
