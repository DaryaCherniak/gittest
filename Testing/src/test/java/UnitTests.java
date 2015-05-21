


import org.testng.Assert;

import static org.testng.Assert.*;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class UnitTests {

    public UnitTests() {
    }

    @Test
    public void add() {
        Assert.assertEquals(4, Calculator.add(2, 2));
        Assert.assertEquals(1, Calculator.sub(3, 2));
        System.out.println("@Test");
    }

    @Test
    public void expt() throws Exception {
             try {
             Calculator.add('a', 2);
            Assert.fail("Error!");
        } catch (Exception ex) {
            assertEquals("Error!",
                    ex.getMessage());
        }

    }

    @Test
    public void BIG() {
        Assert.assertNotNull(Calculator.div(2, 0), null);
        Assert.fail ("Proizoshla Oshibka!");
    }

 


    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterTest
    public static void tearDownClass() throws Exception {
    System.out.println("@AfterTest");
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
