package Day_13;

import cybertek.utilities.WebDriverFactory;
import org.junit.experimental.theories.Theories;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Day13_DropDown {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException{
        Thread.sleep(Long.parseLong("2000"));
      driver.quit();

    }
    @Test
    public void test1(){
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
       // Assert.assertTrue(false,"it is false tell me");
        List<WebElement> buttons = driver.findElements(By.tagName("Button"));
        System.out.println("buttons.size() = " + buttons.size());
    Assert.assertEquals(buttons.size(),6,"verify buttons size");
        for (WebElement button : buttons) {
            System.out.println("button.isDisplayed() = " + button.isDisplayed());
       Assert.assertTrue(button.isDisplayed(),"verify is display");
       buttons.get(1).click();
        }
    }
}
