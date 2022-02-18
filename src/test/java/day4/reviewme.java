package day4;

import cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class reviewme {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://www.amazon.com");
        WebElement button =driver.findElement(By.id("twotabsearchtextbox"));
        button.sendKeys("ıphone 13 max");
        WebElement search =driver.findElement(By.id("nav-search-submit-button"));
        search.click();

    }
}
