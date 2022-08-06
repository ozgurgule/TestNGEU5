package DAY9;

import cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.plaf.PanelUI;
import java.util.Set;

public class multipleWindow {


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
    public void  SwitchWindowsTest(){
        driver.get("http://practice.cybertekschool.com/windows");
        System.out.println("Title before new window: "+ driver.getTitle());
    driver.findElement(By.linkText("Click Here")).click();
        System.out.println("Title after new window : " + driver.getWindowHandle());
        String currentWindowHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        for(String handle : windowHandles){
            if (!handle.equals(currentWindowHandle)){
                driver.switchTo().window(handle);
            }
        }
        System.out.println("Title after switch new window: " + driver.getTitle());

    }



}
