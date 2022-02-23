/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ceti
 */
public class calculadoraTest {
    
    public calculadoraTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    


    /**
     * Test of Suma method, of class calculadora.
     */
    @org.junit.jupiter.api.Test
    public void testSuma() {
        System.out.println("Suma");
        int a = 1;
        int b = 1;
        int expResult = 2;
        int result = calculadora.Suma(a, b);
        assertEquals(expResult, result);

    }

    /**
     * Test of Resta method, of class calculadora.
     */
    @org.junit.jupiter.api.Test
    public void testResta() {
        System.out.println("Resta");
        int a = 2;
        int b = 1;
        int expResult = 1;
        int result = calculadora.Resta(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of Multiplicacion method, of class calculadora.
     */
    @org.junit.jupiter.api.Test
    public void testMultiplicacion() {
        System.out.println("Multiplicacion");
        int a = 3;
        int b = 3;
        int expResult = 9;
        int result = calculadora.Multiplicacion(a, b);
        assertEquals(expResult, result);

    }

    /**
     * Test of Division method, of class calculadora.
     */
    @org.junit.jupiter.api.Test
    public void testDivision() {
        System.out.println("Division");
        int a = 5;
        int b = 5;
        int expResult = 1;
        int result = calculadora.Division(a, b);
        assertEquals(expResult, result);

    }

    /**
     * Test of Suma_3_parametros method, of class calculadora.
     */
    @org.junit.jupiter.api.Test
    public void testSuma_3_parametros() {
        System.out.println("Suma_3_parametros");
        int a = 1;
        int b = 3;
        int c = 5;
        int expResult = 9;
        int result = calculadora.Suma_3_parametros(a, b, c);
        assertEquals(expResult, result);

    }


    
}
