package day20;

import Utilities.ConfigurationReader;
import Utilities.TestBase;
import cybertek.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTest extends TestBase {
    @Test
    public void wronngPasswordTest() {





      //  driver.findElement(By.id("prependedInput")).sendKeys("user1");
      //  driver.findElement(By.id("prependedInput2")).sendKeys("samepassword");
       // driver.findElement(By.id("_submit")).click();
        LoginPage loginPage = new LoginPage();
        loginPage.usernameInput.sendKeys("someusername");
        loginPage.passwordInput.sendKeys("UserUser123");
        loginPage.loginBtn.click();



        Assert.assertEquals(driver.getCurrentUrl(), "https://qa1.vytrack.com/user/login");
    }
    @Test
    public void wrongUsernameTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.usernameInput.sendKeys("someusername");
        loginPage.passwordInput.sendKeys("UserUser123");
        loginPage.loginBtn.click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://qa1.vytrack.com/user/login");
    }
}
