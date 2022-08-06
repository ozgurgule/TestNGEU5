package day12;

import cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class shortvideocheckBox {

 @Test
         public void test() throws InterruptedException {

            WebDriver driver = WebDriverFactory.getDriver("chrome");
            driver.get("http://practice.cybertekschool.com/radio_buttons");
            WebElement dr = driver.findElement(By.cssSelector("#blue"));
            dr.click();
            Thread.sleep(3000);
            WebElement dr1 = driver.findElement(By.cssSelector("#red"));
            dr1.click();
            Thread.sleep(3000);
            WebElement dr2 = driver.findElement(By.cssSelector("#yellow"));
            dr2.click();
            Thread.sleep(3000);
            WebElement dr3 = driver.findElement(By.cssSelector("#black"));
            dr3.click();
            Thread.sleep(3000);
            WebElement dr4 = driver.findElement(By.cssSelector("#green"));
            dr4.click();
            Thread.sleep(3000);

            System.out.println("dr3.isDisplayed() = " + dr3.isDisplayed());
            System.out.println("dr4.isDisplayed() = " + dr4.isDisplayed());
            System.out.println("dr4.isSelected() = " + dr4.isSelected());
            System.out.println("dr4.isEnabled() = " + dr4.isEnabled());
            System.out.println("*******************************");
            //dr3.findElement(By.name() )
            //Assert.assertTrue(dr4.isEnabled(),"verify that code it is true or not");
            Assert.assertFalse(dr.isSelected(), "it is true or false");




            driver.quit();




}
}
