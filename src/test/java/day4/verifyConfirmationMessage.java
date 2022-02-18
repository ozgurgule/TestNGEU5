package day4;

import cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyConfirmationMessage {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement button = driver.findElement(By.name("email"));
        String expectedEmail = "hello@worldhere.com";
        button.sendKeys("hello@worldhere.com");
        WebElement button2 =driver.findElement(By.id("form_submit"));
        button2.click();
        String value = button.getAttribute("value");
        System.out.println("value = " + value);

        if (expectedEmail.equals(value)){
            System.out.println("PASS");
        }else {
            System.out.println("FAİL");
        }
        WebElement button1 = driver.findElement(By.id("form_submit"));
        button.click();
        WebElement actualConfirmationMessage= driver.findElement(By.name("confirmation_message"));
        System.out.println("\"actualConfirmationMessage\" = " + "actualConfirmationMessage");


    }
}
