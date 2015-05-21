

import static org.testng.Assert.*;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviders {

    @DataProvider
    public Object[][] datpr() {
    return new Object[][]{
              {6, Calculator.add(5, 1)},
              {25, Calculator.add(20, 5)},
              {9, Calculator.add(3, 6)}
        };
    }
    @DataProvider
   public Object[][] datprsub() {
    return new Object[][]{
            {40, Calculator.sub(50, 10)},
            {25, Calculator.sub(30, 5)},
           {9, Calculator.sub(10, 1)}
      };

   }

    public DataProviders() {

    }

    @Test(dataProvider = "datpr")
    public void add(int c, int addDigit) {
        assertEquals(c, addDigit);
         System.out.print("Test execution");
       
        
    }
     
  @Test(dataProvider = "datprsub")
    public void sub(int c, int subDigit) {
        assertEquals(c, subDigit);


    }}



