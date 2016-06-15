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
    
    private Utilitarios util;
    
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
        util = new Utilitarios();
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
        int[] vetor = new int[3];
        vetor[0] = 0;
        vetor[1] = 0;
        vetor[2] = 0;
        int[] vetor2 = new int[3];
        vetor2[0] = 5;
        vetor2[1] = 55;
        vetor2[2] = 15;
        Utilitarios.zerarVet(vetor2);
        assertArrayEquals(vetor, vetor2);
    }

    /**
     * Test of verificarQuantNumeros method, of class Utilitarios.
     */
    @Test
    public void testVerificarQuantNumeros() {
        System.out.println("verificarQuantNumeros");
        int[] combinacao = new int[3];
        combinacao[0] = 2;
        combinacao[1] = 0;
        combinacao[2] = 8;
        int expResult = 2;
        int result = util.verificarQuantNumeros(combinacao);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of ordenar method, of class Utilitarios.
     */
    @Test
    public void testOrdenar() {
        System.out.println("ordenar");
        int[] vetor = new int[4];
        vetor[0] = 3;
        vetor[1] = 8;
        vetor[2] = 1;
        vetor[3] = 7;
        int[] vetorEsperado = new int[4];
        vetorEsperado[0] = 1;
        vetorEsperado[1] = 3;
        vetorEsperado[2] = 7;
        vetorEsperado[3] = 8;
        Utilitarios.ordenar(vetor);
        assertArrayEquals(vetorEsperado, vetor);
    }

    /**
     * Test of verificarRepetido method, of class Utilitarios.
     */
    @Test
    public void testVerificarRepetido() {
        System.out.println("verificarRepetido");
        int num = 5;
        int[] combinacao = new int[3];
        combinacao[0] = 1;
        combinacao[1] = 6;
        combinacao[2] = 5;
        boolean expResult = true;
        boolean result = Utilitarios.verificarRepetido(num, combinacao);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of carregarUltimoSorteio method, of class Utilitarios.
     */
    @Test
    public void testCarregarUltimoSorteio() {
        System.out.println("carregarUltimoSorteio");
        int[] ultimoSorteio = new int[15];
        int[] expResult = new int[15];
        expResult[0] = 1;
        expResult[1] = 2;
        expResult[2] = 3;
        expResult[3] = 4;
        expResult[4] = 6;
        expResult[5] = 8;
        expResult[6] = 9;
        expResult[7] = 13;
        expResult[8] = 15;
        expResult[9] = 17;
        expResult[10] = 18;
        expResult[11] = 19;
        expResult[12] = 20;
        expResult[13] = 22;
        expResult[14] = 23;
        int[] result = Utilitarios.carregarUltimoSorteio(ultimoSorteio);
        
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of paresUltimoSorteio method, of class Utilitarios.
     */
    @Test
    public void testParesUltimoSorteio() {
        System.out.println("paresUltimoSorteio");
        int[] sorteioAnterior = new int[15];
        sorteioAnterior[0] = 1;
        sorteioAnterior[1] = 2;
        sorteioAnterior[2] = 3;
        sorteioAnterior[3] = 4;
        sorteioAnterior[4] = 6;
        sorteioAnterior[5] = 8;
        sorteioAnterior[6] = 9;
        sorteioAnterior[7] = 13;
        sorteioAnterior[8] = 15;
        sorteioAnterior[9] = 17;
        sorteioAnterior[10] = 18;
        sorteioAnterior[11] = 19;
        sorteioAnterior[12] = 20;
        sorteioAnterior[13] = 22;
        sorteioAnterior[14] = 23;
        ArrayList expResult = new ArrayList();
        expResult.add(2);
        expResult.add(4);
        expResult.add(6);
        expResult.add(8);
        expResult.add(18);
        expResult.add(20);
        expResult.add(22);
        ArrayList result = Utilitarios.paresUltimoSorteio(sorteioAnterior);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of imparesUltimoSorteio method, of class Utilitarios.
     */
    @Test
    public void testImparesUltimoSorteio() {
        System.out.println("imparesUltimoSorteio");
        int[] sorteioAnterior = new int[15];
        sorteioAnterior[0] = 1;
        sorteioAnterior[1] = 2;
        sorteioAnterior[2] = 3;
        sorteioAnterior[3] = 4;
        sorteioAnterior[4] = 6;
        sorteioAnterior[5] = 8;
        sorteioAnterior[6] = 9;
        sorteioAnterior[7] = 13;
        sorteioAnterior[8] = 15;
        sorteioAnterior[9] = 17;
        sorteioAnterior[10] = 18;
        sorteioAnterior[11] = 19;
        sorteioAnterior[12] = 20;
        sorteioAnterior[13] = 22;
        sorteioAnterior[14] = 23;
        ArrayList expResult = new ArrayList();
        expResult.add(1);
        expResult.add(3);
        expResult.add(9);
        expResult.add(13);
        expResult.add(15);
        expResult.add(17);
        expResult.add(19);
        expResult.add(23);
        ArrayList result = Utilitarios.imparesUltimoSorteio(sorteioAnterior);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of paresQueNaoSairam method, of class Utilitarios.
     */
    @Test
    public void testParesQueNaoSairam() {
        System.out.println("paresQueNaoSairam");
        int[] sorteioAnterior = new int[15];
        sorteioAnterior[0] = 1;
        sorteioAnterior[1] = 2;
        sorteioAnterior[2] = 3;
        sorteioAnterior[3] = 4;
        sorteioAnterior[4] = 6;
        sorteioAnterior[5] = 8;
        sorteioAnterior[6] = 9;
        sorteioAnterior[7] = 13;
        sorteioAnterior[8] = 15;
        sorteioAnterior[9] = 17;
        sorteioAnterior[10] = 18;
        sorteioAnterior[11] = 19;
        sorteioAnterior[12] = 20;
        sorteioAnterior[13] = 22;
        sorteioAnterior[14] = 23;
        ArrayList paresNaoRepetidos = new ArrayList();
        for(int cont = 1; cont <= 25; cont++){
            boolean contem = Utilitarios.verificarRepetido(cont, sorteioAnterior);
            if(!contem){
                if(cont % 2 == 0)
                    paresNaoRepetidos.add(cont);
            }
        }
        ArrayList result = Utilitarios.paresQueNaoSairam(sorteioAnterior);
        assertEquals(paresNaoRepetidos, result);

    }

    /**
     * Test of imparesQueNaoSairam method, of class Utilitarios.
     */
    @Test
    public void testImparesQueNaoSairam() {
        System.out.println("imparesQueNaoSairam");
        int[] sorteioAnterior = new int[15];
        sorteioAnterior[0] = 1;
        sorteioAnterior[1] = 2;
        sorteioAnterior[2] = 3;
        sorteioAnterior[3] = 4;
        sorteioAnterior[4] = 6;
        sorteioAnterior[5] = 8;
        sorteioAnterior[6] = 9;
        sorteioAnterior[7] = 13;
        sorteioAnterior[8] = 15;
        sorteioAnterior[9] = 17;
        sorteioAnterior[10] = 18;
        sorteioAnterior[11] = 19;
        sorteioAnterior[12] = 20;
        sorteioAnterior[13] = 22;
        sorteioAnterior[14] = 23;
        ArrayList imparesNaoRepetidos = new ArrayList();
        for(int cont = 1; cont <= 25; cont++){
            boolean contem = Utilitarios.verificarRepetido(cont, sorteioAnterior);
            if(!contem){
                if(cont % 2 != 0)
                    imparesNaoRepetidos.add(cont);
            }
        }
        ArrayList result = Utilitarios.imparesQueNaoSairam(sorteioAnterior);
        assertEquals(imparesNaoRepetidos, result);
    }

    /**
     * Test of adicionarZero method, of class Utilitarios.
     */
    @Test
    public void testAdicionarZero() {
        System.out.println("adicionarZero");
        int[] combinacoes = new int[5];
        combinacoes[0] = 1;
        combinacoes[1] = 2;
        combinacoes[2] = 3;
        combinacoes[3] = 10;
        combinacoes[4] = 11;
        String expResult = " 01 02 03 10 11";
        String result = Utilitarios.adicionarZero(combinacoes);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of ordenarCartela method, of class Utilitarios.
     */
    @Test
    public void testOrdenarCartela() {
        System.out.println("ordenarCartela");
        int[] vetor = new int[4];
        vetor[0] = 3;
        vetor[1] = 8;
        vetor[2] = 1;
        vetor[3] = 7;
        int[] vetorEsperado = new int[4];
        vetorEsperado[0] = 1;
        vetorEsperado[1] = 3;
        vetorEsperado[2] = 7;
        vetorEsperado[3] = 8;
        vetor = Utilitarios.ordenarCartela(vetor);
        assertArrayEquals(vetorEsperado, vetor);
    }

    /**
     * Test of gerarRandom method, of class Utilitarios.
     */
    
    /* Como testa classe rand? Ver com Luciana
    @Test
    public void testGerarRandom() {
        System.out.println("gerarRandom");
        int min = 0;
        int max = 5;
        int qntNumerosGerados = 3;
        int[] expResult = null;
        int[] result = Utilitarios.gerarRandom(min, max, qntNumerosGerados);
        assertArrayEquals(expResult, result);

    }*/
    
}
