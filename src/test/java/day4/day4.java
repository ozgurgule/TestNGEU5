package day4;

import cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class day4 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.nl/");

        String expectedUrl = driver.getCurrentUrl();
        WebElement clickbutton = driver.findElement(By.id("twotabsearchtextbox"));
        clickbutton.click();
        WebElement click = driver.findElement(By.name("email"));
        click.click();


    }
}
