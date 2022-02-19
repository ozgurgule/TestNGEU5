package css_locotor;

import cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class css_locotor {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://www.amazon.nl/");

       // driver.findElement(By.cssSelector("//div[@class=\"OrdL9b\"]"));
        WebElement s = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        s.click();
        s.sendKeys("Samsung s20 ultra");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#nav-search-submit-button")).click();





    }
}
