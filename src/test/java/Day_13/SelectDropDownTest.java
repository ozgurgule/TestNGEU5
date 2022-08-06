package Day_13;


import cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class SelectDropDownTest {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");

    }
    @AfterMethod
    public void teadDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
    @Test
    public void test1(){
        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement dropDownElement = driver.findElement(By.id("state"));
        Select stateDropdown = new Select(dropDownElement);
        List<WebElement> options = stateDropdown.getOptions();
        System.out.println("options.size() = " + options.size());

        for (WebElement option : options) {
            System.out.println("option.getText() = " + option.getText());

        }

    }
    @Test
    public void test2() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement dropdownElement = driver.findElement(By.id("state"));

        Select stateDropdown = new Select(dropdownElement);
        String expectedOption = "Select a State";
        String actualOption = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption,expectedOption,"verify first selection");

        Thread.sleep(2000);
        stateDropdown.selectByVisibleText("Kansas");

        expectedOption = "Kansas";
        actualOption = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption,expectedOption,"verify first selection");
Thread.sleep(2000);
stateDropdown.selectByIndex(51);
        expectedOption = "Wyoming";
        actualOption = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption, expectedOption,"verify first selection");
    }



}
