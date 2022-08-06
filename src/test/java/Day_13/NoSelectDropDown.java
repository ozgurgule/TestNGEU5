package Day_13;

import cybertek.utilities.WebDriverFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;


public class NoSelectDropDown {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");

    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
    @Test
    public void test(){
        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement dropdownElement = driver.findElement(By.id("dropdownMenuLink"));
        dropdownElement.click();

        List<WebElement> dropdownOptions = driver.findElements(By.className("dropdown-item"));
        System.out.println("dropdownOptions = " + dropdownOptions);
        //print size of options
        System.out.println("dropdownOptions.size() = " + dropdownOptions.size());
        Assert.assertEquals(dropdownOptions.size(),5,"verify size of options");

        //print them one by one
        for (WebElement option : dropdownOptions) {
            System.out.println(option.getText());
        }

        //click yahoo
        dropdownOptions.get(2).click();
        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());

    }

}
