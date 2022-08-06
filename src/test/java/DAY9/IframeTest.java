package DAY9;

import cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IframeTest {
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
    public void test1() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/iframe");
        driver.switchTo().frame("mce_0_ifr");
        driver.findElement(By.cssSelector("#tinymce")).clear();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#tinymce")).sendKeys("My suitcase");
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#tinymce")).clear();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#tinymce")).sendKeys("MikeSmith WITH INDEX");
        driver.switchTo().parentFrame();
        WebElement iframeElement = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(iframeElement);

        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#tinymce")).sendKeys("MikeSmith WITH WEBELEMENT");
    }
        @Test
        public void test2(){
            driver.get("http://practice.cybertekschool.com/nested_frames");

            //switching to frame top
            driver.switchTo().frame("frame-top");
            //top has 3 frame under left middle and right
            //switch to frame middle
            driver.switchTo().frame("frame-middle");

            System.out.println(driver.findElement(By.id("content")).getText());

            //goes back to top frame
            driver.switchTo().parentFrame();

            //switching right with index
            driver.switchTo().frame(2);

            System.out.println(driver.findElement(By.tagName("body")).getText());

            //go to main html to switch bottom
            driver.switchTo().defaultContent();

            driver.switchTo().frame(1);

            System.out.println(driver.findElement(By.tagName("body")).getText());


        }




}
