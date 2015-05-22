import java.util.logging.Logger;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebTest {

   //  private static final Logger log = Logger.getLogger(Web.class);

    @Test
    public void WebDriverTest () {
      //   log.info("Create repository");
        //WebDriver driver = new OperaDriver();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://github.com");

        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.name("login")).sendKeys("AzarkevichO");
        driver.findElement(By.name("password")).sendKeys("Ksu12345k");
        driver.findElement(By.name("commit")).click();
        driver.findElement(By.className("dropdown-caret")).click();
        driver.findElement(By.linkText("New repository")).click();        
        driver.findElement(By.id("repository_name")).sendKeys("NewRepo1");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    }
    
//    @Test
//    public void hello(){
//
//    }

}