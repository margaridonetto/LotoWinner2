/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regras.negocio;

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
public class UsuarioTest {
    
    private Usuario usu;
    
    public UsuarioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        usu = new Usuario();
        usu.setNome("Teste");
        usu.setCpf("Teste");
        usu.setCelular("Teste");
        usu.setEmail("Teste");
        usu.setSenha("Teste");
        usu.setTelefone("Teste");
        usu.setUser("Teste");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNome method, of class Usuario.
     */
    @Test
    public void testGetNome() {
        
        System.out.println("getNome");
        String expResult = "Teste";
        usu.setNome("Teste");
        String result = usu.getNome();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNome method, of class Usuario.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String expResult = "Teste";
        usu.setNome("Teste");
        String result = usu.getNome();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCpf method, of class Usuario.
     */
    @Test
    public void testGetCpf() {
        System.out.println("getCpf");
        String expResult = "Teste";
        String result = usu.getCpf();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCpf method, of class Usuario.
     */
    @Test
    public void testSetCpf() {
        System.out.println("setCpf");
        String cpf = "Teste";
        usu.setCpf(cpf);
    }

    /**
     * Test of getTelefone method, of class Usuario.
     */
    @Test
    public void testGetTelefone() {
        System.out.println("getTelefone");
        String expResult = "Teste";
        String result = usu.getTelefone();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTelefone method, of class Usuario.
     */
    @Test
    public void testSetTelefone() {
        System.out.println("setTelefone");
        String telefone = "Teste";
        usu.setTelefone(telefone);
    }

    /**
     * Test of getCelular method, of class Usuario.
     */
    @Test
    public void testGetCelular() {
        System.out.println("getCelular");
        String expResult = "Teste";
        String result = usu.getCelular();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCelular method, of class Usuario.
     */
    @Test
    public void testSetCelular() {
        System.out.println("setCelular");
        String celular = "Teste";
        usu.setCelular(celular);
    }

    /**
     * Test of getEmail method, of class Usuario.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        String expResult = "Teste";
        String result = usu.getEmail();
        assertEquals(expResult, result);;
    }

    /**
     * Test of setEmail method, of class Usuario.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "Teste";
        usu.setEmail(email);
    }

    /**
     * Test of getSenha method, of class Usuario.
     */
    @Test
    public void testGetSenha() {
        System.out.println("getSenha");
        String expResult = "Teste";
        String result = usu.getSenha();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSenha method, of class Usuario.
     */
    @Test
    public void testSetSenha() {
        System.out.println("setSenha");
        String senha = "Teste";
        usu.setSenha(senha);
    }

    /**
     * Test of getUser method, of class Usuario.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        String expResult = "Teste";
        String result = usu.getUser();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUser method, of class Usuario.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        String user = "Teste";
        usu.setUser(user);
    }
    
}
