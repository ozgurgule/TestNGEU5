package day7;

import cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class practice {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://www.amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 13 max");
        driver.findElement(By.id("nav-search-submit-button")).click();
        String title = driver.getTitle();
        System.out.println("title = " + title);


    }
}
