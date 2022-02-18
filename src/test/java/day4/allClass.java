package day4;

import cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class allClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        String expectedUrl =driver.getCurrentUrl();
        WebElement button = driver.findElement(By.id("form_submit"));
        button.click();

        String actualUrl = driver.getCurrentUrl();
        if(expectedUrl.equals(actualUrl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAİL");
        }
        Thread.sleep(3000);
        driver.quit();




    }
}
