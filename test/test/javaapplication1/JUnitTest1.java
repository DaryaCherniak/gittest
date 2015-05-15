/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.Assert;
import static junit.framework.Assert.assertEquals;
import junit.framework.AssertionFailedError;
import java.lang. AssertionError;
import static org.testng.Assert.assertEquals;

/**
 *
 * @author smw
 */
public class JUnitTest1 {

    @Test
    public void add()
    {
    Assert.assertEquals(4, Calculator.add( 2, 2));
    Assert.assertEquals(1, Calculator.sub( 3, 2));
    }
    @Test
    public void expt() throws Exception {
   Assert.assertEquals(6, Calculator.add(4,2));
   try {
   Calculator.add('a',2);
   Assert.fail("Не должно работать!");
   } catch (Exception ex) {
   assertEquals("Не должно быть букв",
   ex.getMessage());
     }

    }
    @Test
    public void BIG() {
    Assert.assertEquals(Integer.MAX_VALUE * Integer.MAX_VALUE, Calculator.add(Integer.MAX_VALUE, Integer.MAX_VALUE));
    System.out.println("Proizoshla Oshibka!");
	}
    @Test 
    public void Zer() {
    new AssertionError ("Divide error by zero!");
    Assert.assertEquals(4, Calculator.div(27, 0));
	}

    public JUnitTest1() {

    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
}

