/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acesso.dados;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import regras.negocio.Usuario;

/**
 *
 * @author junio
 */
public class PrepStateTest {
    
    public PrepStateTest() {
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
     * Test of salvarSorteio method, of class PrepState.
     */
    @Test
    public void testSalvarSorteio() {
        System.out.println("salvarSorteio");
        String numerosSorteados = "";
        PrepState instance = new PrepState();
        instance.salvarSorteio(numerosSorteados);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of salvar method, of class PrepState.
     */
    @Test
    public void testSalvar() {
        System.out.println("salvar");
        Usuario user = null;
        PrepState instance = new PrepState();
        instance.salvar(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
