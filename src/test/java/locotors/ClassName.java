package locotors;

import cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassName {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");
        WebElement homeLink = driver.findElement(By.className("nav-link"));
homeLink.click();
driver.get("http://practice.cybertekschool.com/multiple_buttons");
        System.out.println("driver.findElement(By.className(\"h3\")).getText() = " + driver.findElement(By.className("h3")).getText());


    }
}
