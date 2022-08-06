package Day_13;

import cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class newtab {
    WebDriver driver;
        @BeforeMethod
                public void test1()
        {
            driver= WebDriverFactory.getDriver("chrome");
        }
        @AfterMethod()
                public void newtest() throws InterruptedException {
            Thread.sleep(3000);
          //  driver.quit();
        }

        @Test
    public void sozcu(){
          driver.get("https://www.sozcu.com.tr/");
         // driver.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();

          driver.findElement(By.xpath("//*[.='Kiev tren istasyonunda izdiham'][1]")).click();


        }


}
