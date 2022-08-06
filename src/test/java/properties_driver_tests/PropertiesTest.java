package properties_driver_tests;

import Utilities.ConfigurationReader;
import cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PropertiesTest {
    @Test
    public void test1(){
        String browserType = ConfigurationReader.get("browser");
        WebDriver driver = WebDriverFactory.getDriver(browserType);
        System.out.println("browserType = " + browserType);
    }

}
