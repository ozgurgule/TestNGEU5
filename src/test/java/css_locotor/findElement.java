package css_locotor;

import cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class findElement {
    public static void main(String[] args) {
       WebDriver driver = WebDriverFactory.getDriver("chrome");
       driver.get("http://www.mycoa.nl/");
       WebElement s = driver.findElement(By.xpath("//span[@class=\"field-content\"]"));
       s.click();

    }
}
