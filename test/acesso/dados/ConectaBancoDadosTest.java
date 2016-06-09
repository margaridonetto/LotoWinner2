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

/**
 *
 * @author junio
 */
public class ConectaBancoDadosTest {
    
    public ConectaBancoDadosTest() {
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
     * Test of conexao method, of class ConectaBancoDados.
     */
    @Test
    public void testConexao() {
        System.out.println("conexao");
        ConectaBancoDados instance = new ConectaBancoDados();
        instance.conexao();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of executaSql method, of class ConectaBancoDados.
     */
    @Test
    public void testExecutaSql() {
        System.out.println("executaSql");
        String comandoSql = "";
        ConectaBancoDados instance = new ConectaBancoDados();
        instance.executaSql(comandoSql);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of desconexao method, of class ConectaBancoDados.
     */
    @Test
    public void testDesconexao() {
        System.out.println("desconexao");
        ConectaBancoDados instance = new ConectaBancoDados();
        instance.desconexao();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
