package day19;

import Utilities.ConfigurationReader;
import cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PropertiesTest {
    @Test
    public void test1(){
        String browserType = ConfigurationReader.get("browser");
        System.out.println("browserType = " + browserType);
    }
    @Test
    public void open(){
        WebDriver driver = WebDriverFactory.getDriver(ConfigurationReader.get("browser"));
        driver.get(ConfigurationReader.get("url"));

        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");
        driver.findElement(By.id("prependedInput")).sendKeys("User1254");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123" + Keys.ENTER);

    }
}
