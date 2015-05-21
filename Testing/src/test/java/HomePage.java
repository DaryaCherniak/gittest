
import static org.testng.Assert.*;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.*;
import org.openqa.selenium.WebElement;


public class HomePage {

    private final WebDriver driver;

    @FindBy(linkText = "Sign in")
    private WebElement searchBut;

    @FindBy(name = "login")
    private WebElement username;

    @FindBy(name = "password")
    private WebElement passname;

    @FindBy(name = "commit")
    private WebElement commit;


    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void SignIN(String log, String pass) {

        searchBut.click();
        username.sendKeys(log);
        passname.sendKeys(pass);
        commit.click();


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
