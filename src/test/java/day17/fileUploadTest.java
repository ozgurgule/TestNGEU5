package day17;

import cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class fileUploadTest {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");

    }
    @AfterMethod
    public void tearDown () throws InterruptedException {
        Thread.sleep(2000);
        // driver.quit();
    }
    @Test
    public void Test1(){
        driver.get("http://practice.cybertekschool.com/upload");
        WebElement chooseFile = driver.findElement(By.name("file"));
        chooseFile.sendKeys("C:\\Users\\wuslat\\Desktop\\file.txt");
        driver.findElement(By.id("file-submit")).click();
        String actualFileName = driver.findElement(By.id("uploaded-files")).getText();
        Assert.assertEquals(actualFileName,"file.txt");

    }
    @Test
    public void test1(){
        // /Users/jamaldemir/IdeaProjects/fromgit/EU3TestNGSelenium/src/test/resources/textfile.txt

        // /Users/jamaldemir/IdeaProjects/fromgit/EU3TestNGSelenium src/test/resources/textfile.txt;
        //System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("os.name"));
        String projectPath = System.getProperty("user.dir");
        System.out.println("projectPath = " + projectPath);

        String filePath = "src/test/resources/textfile.txt";

        String fullPath = projectPath+"/"+filePath;
        System.out.println(fullPath);

    }

   // C:\Users\wuslat\IdeaProjects\TestNGEU5\src\test\resources\textfile.txt
}
