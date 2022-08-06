package Day_13;

import cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class dropDown {
    WebDriver driver;
    @BeforeMethod
    public void testdrop(){
        driver= WebDriverFactory.getDriver("chrome");


    }
    @AfterMethod
    public void testDropafter() throws InterruptedException {
        Thread.sleep(2000);
    }
    @Test
    public void testday13(){
        driver.get("http://www.google.com");
        driver.findElement(By.cssSelector("#L2AGLb")).click();
        System.out.println("driver.getWindowHandles() = " + driver.getWindowHandles());
    }

}
