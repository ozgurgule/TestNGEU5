package day17;

import cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class hovertest {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(6000);
        driver.quit();
    }
    @Test
    public void test1() {
        driver.get("http://practice.cybertekschool.com/hovers");
        WebElement img1 = driver.findElement(By.tagName("img"));
        Actions actions = new Actions(driver);
        actions.moveToElement(img1).perform();
        WebElement vievlink = driver.findElement(By.linkText("Viev profile"));
        Assert.assertTrue(vievlink.isDisplayed(),"verify view link is displayed");


    }
    @Test
    public void oneImage() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/hovers");
        WebElement img1 = driver.findElement(By.tagName("img"));
        Actions actions = new Actions(driver);
        Thread.sleep(2000);
  actions.moveToElement(img1).perform();
    }
}
