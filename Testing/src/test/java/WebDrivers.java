
import org.apache.log4j.Logger;

import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDrivers {
    
    public static final Logger LOG=Logger.getLogger(WebDrivers.class);
    
    public WebDrivers() {
        
        LOG.info("Hello World!");
        
        WebDriver driver = new FirefoxDriver();
        driver.get("https://github.com"); 
        WebElement searchBut = driver.findElement(By.linkText("Sign in"));
        searchBut.click();
        
        LOG.info("Hello World!");
        
        WebElement username = driver.findElement(By.name("login"));
        username.sendKeys("DaryaCherniak");
        
        WebElement passname = driver.findElement(By.name("password"));
        passname.sendKeys("123dashKA");
        
        WebElement searchButt = driver.findElement(By.name("commit"));
        searchButt.click();
        
        WebElement dropdowns = driver.findElement(By.className("dropdown-caret"));
        dropdowns.click();
        
        WebElement repo = driver.findElement(By.linkText("New repository"));
        repo.click();
        
        WebElement reponame = driver.findElement(By.id("repository_name"));
        reponame.sendKeys("gettest");
        
        WebElement butsub = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        butsub.click();
        
        LOG.info("Hello World!");
    }

     @Test
     public void hello() {}
}
