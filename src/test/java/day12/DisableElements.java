package day12;

import cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisableElements {
    @Test
    public void test1(){

        WebDriver driver =
                WebDriverFactory.getDriver("chrome");
        driver.manage().window().fullscreen();
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        WebElement greenRadiBtn = driver.findElement(By.id("green"));
        System.out.println("greenRadiBtn.isEnabled() = " + greenRadiBtn.isEnabled());
        Assert.assertFalse(greenRadiBtn.isEnabled(),"verify green radio button NOT enable(disable)");
        greenRadiBtn.click();
    driver.quit();
    }
}
