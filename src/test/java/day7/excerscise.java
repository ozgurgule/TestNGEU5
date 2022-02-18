package day7;

import cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class excerscise {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.nl/");
        WebElement s =  driver.findElement(By.xpath("//input[@type=\"text\"]"));

               s.sendKeys("Selenium");
               driver.findElement(By.id("nav-search-submit-button")).click();

              // System.out.println(driver.get("//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]");

               WebElement sa =driver.findElement(By.xpath("//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]"));
        System.out.println("sa.getText() = " + sa.getText());


    }
}
