package locotors;

import cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.swing.plaf.FontUIResource;

public class locotors_2 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");
        WebElement fullNameInput = driver.findElement(By.name("full_name"));
        fullNameInput.sendKeys("Mike Smith");
        driver.findElement(By.name("email")).sendKeys("my@emailisgmail.com");

        driver.findElement(By.name("wooden_spoon")).click();


    }
}
