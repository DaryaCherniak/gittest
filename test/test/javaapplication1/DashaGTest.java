/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

import org.apache.log4j.Logger;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.DataProvider;
import org.testng.annotations.*;

/**
 *
 * @author Р”РђРЁРљРђ
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
    logger.info("Р Р°Р±РѕС‚Р°РµРј СЃ РєР°Р»СЊРєСѓР»СЏС‚РѕСЂРѕРј");
    }

    @Test(dataProvider = "datpr")
    public void add(int c, int addDigit) {
      assertEquals(c, addDigit);
      logger.debug("РЎСѓРјРјР°:" + c);
    }
    @Test(dataProvider = "datpr")
    public void sub(int c, int subDigit) {
    assertEquals(c, subDigit);
     logger.error("РќРµРІРµСЂРЅС‹Рµ РґР°РЅРЅС‹Рµ!");
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
