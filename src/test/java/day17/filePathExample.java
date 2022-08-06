package day17;

import cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class filePathExample {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
       // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        // Thread.sleep(2000);
       // driver.quit();
    }
    @Test
    public void test1() throws InterruptedException {
        driver.get("https://demoqa.com/browser-windows");
        driver.findElement(By.id("tabButton")).click();
        List<String> tab = new ArrayList<>(driver.getWindowHandles());

        System.out.println(tab.size());
        driver.switchTo().window(tab.get(1));
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(4000);
        driver.close();



    }
}
