package css_locotor;

import cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class css_locotor {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://www.amazon.nl/");

        driver.findElement(By.cssSelector("//div[@class=\"OrdL9b\"]"));


    }
}
