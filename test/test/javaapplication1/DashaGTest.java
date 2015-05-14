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
/**
 *
 * @author ДАШКА
 */
public class DashaGTest {
 
    @DataProvider 
    public Object [][] datpr(){
    return new Object[][]{
        {6, Calculator.add(5, 1)},
        {15, Calculator.sub(36, 21)},
        {9, Calculator.mul(3, 3)}
         };
    
    }
    public DashaGTest() {
    }

    @Test(dataProvider  = "datpr")
    public void add(int c, int addDigit) {
      assertEquals(c, addDigit);
      }
    
    public void sub(int c, int subDigit) {
      assertEquals(c, subDigit);
      }
     
     public void mul(int c, int mulDigit) {
      assertEquals(c, mulDigit);
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
