package day19;

import Utilities.ConfigurationReader;
import Utilities.TestBase;
import day1.driver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class LoginTest extends TestBase {
    @Test
    public void OpenBrowserWithConf() {

        driver.get(ConfigurationReader.get("url"));

        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");

        driver.findElement(By.id("prependedInput")).sendKeys(username);
        driver.findElement(By.id("prependedInput2")).sendKeys(password);
    }

}
