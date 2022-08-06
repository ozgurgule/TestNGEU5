package day12;

import cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class checkBox2 {
    @Test
    public void test1() throws InterruptedException {


        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

        WebElement usernameInput = driver.findElement(By.id("username"));

        System.out.println("usernameInput.isDisplayed() = " + usernameInput.isDisplayed());

        //TASK
        //verify username inputbox is not displayed on the screen
        Assert.assertFalse(usernameInput.isDisplayed(),"verify inputbox is NOT displayed");
        //click start button
        //find start button and click
        driver.findElement(By.cssSelector("#start>button")).click();
        //wait until elements displayed
        Thread.sleep(6000);
        //verify username displayed on the screen
        Assert.assertTrue(usernameInput.isDisplayed(),"verify username inputbox is displayed");
        Assert.assertFalse(usernameInput.isSelected(),"verify not");
        WebElement es = driver.findElement(By.xpath("//input[@type=\"username\"]"));
        es.sendKeys("hello world");
        Thread.sleep(2000);
        WebElement as = driver.findElement(By.cssSelector("#pwd"));
        as.sendKeys("1234sad");

        System.out.println("as = " + as);
        WebElement su = driver.findElement(By.xpath("//button[text()='Submit']"));
        su.click();
        System.out.println("su.isSelected() = " + su.isSelected());


    }
}
