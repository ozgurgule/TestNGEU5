package day4;

import cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyURLchange {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement button = driver.findElement(By.name("email"));

        button.sendKeys("hello@worldhere.com");
       WebElement button2 =driver.findElement(By.id("form_submit"));
        button2.click();

        String exectedURL= "http://practice.cybertekschool.com/email_s";

        String actualURL = driver.getCurrentUrl();
        if (exectedURL.equals(actualURL)){
            System.out.println("PASS");
        }else {
            System.out.println("FAİL");
            System.out.println("actualURL = " + actualURL);
            System.out.println("exectedURL = " + exectedURL);

        }driver.quit();



    }
}
