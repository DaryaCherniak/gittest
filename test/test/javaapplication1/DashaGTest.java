/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import static org.testng.Assert.*;
import javaapplication1.Calculator;
import org.testng.TestNGException;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;

/**
 *
 * @author ДАШКА
 */
public class DashaGTest {

private static final Logger logger = Logger.getLogger(DashaGTest.class);

   @DataProvider
   public Object[][] datpr() {
   return new Object[][]{
     
    {6, Calculator.add(5, 1)},
    {15, Calculator.add(5, 10)},
    {9, Calculator.add(3, 6)}
    };
    }

    public DashaGTest() {
    logger.info("Работаем с калькулятором");
    }

    @Test(dataProvider = "datpr")
    public void add(int c, int addDigit) {
      assertEquals(c, addDigit);
      logger.debug("Сумма:" + c);
    }
    @Test(dataProvider = "datpr")
    public void sub(int c, int subDigit) {
      Assert.assertEquals(c, subDigit);
     logger.error("Неверные данные!");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
