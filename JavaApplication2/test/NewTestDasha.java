/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import static org.junit.Assert.*;

/**
 *
 * @author smw
 */
public class NewTestDasha {


    public NewTestDasha() {

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
     @Test
     public void hello() {
    WebDriver driver =  new ChromeDriver();
    driver.get("https://github.com");
    WebElement searchBut= driver.findElement(By.linkText("Sign in"));
    searchBut.click();
    WebElement username = driver.findElement(By.name("login"));
    username.sendKeys("DaryaCherniak");
    WebElement passname = driver.findElement(By.name("password"));
    passname.sendKeys("123dashKA");
    WebElement searchButT= driver.findElement(By.linkText("commit"));
    searchButT.click();
     }

}