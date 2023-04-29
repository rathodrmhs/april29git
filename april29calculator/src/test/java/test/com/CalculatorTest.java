/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import com.mycompany.april29calculator.Calculator;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author ratho
 */
public class CalculatorTest {

    Calculator calc;

    public CalculatorTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
        calc = new Calculator();

    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void testAdd() {
        assertEquals(calc.add(2, 4), 6);

    }

    @Test
    public void testMultiply() {

    }

}
