

import static org.testng.Assert.*;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PageObject {

    private String username;
    private String passname;
    private String URL;
    private WebDriver driver;


    @Test
    public void SignIN() {
        this.username = "DaryaCherniak";
        this.passname = "123dashKA";
        this.URL = "https://github.com";
        this.driver = new FirefoxDriver();
        this.driver.get(this.URL);


        HomePage homep = new HomePage(this.driver);
        homep.SignIN(this.username, this.passname);

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
