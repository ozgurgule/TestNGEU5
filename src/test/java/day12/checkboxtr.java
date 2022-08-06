package day12;

import cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class checkboxtr {
    @Test
    public void test() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");
        WebElement BoX = driver.findElement(By.id("username"));
        WebElement el = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div[1]/button"));
        el.click();

        System.out.println("BoX.isDisplayed() = " + BoX.isDisplayed());
        Thread.sleep(7000);
        BoX.sendKeys("hellomyclass");

    }


}
