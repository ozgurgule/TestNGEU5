package day22;

import Utilities.TestBase;
import cybertek.pages.LoginPage;
import io.cucumber.java.an.E;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegatifLoginTestWithReport extends TestBase {

    @Test
    public void wronngPasswordTest() {

        //  driver.findElement(By.id("prependedInput")).sendKeys("user1");
        //  driver.findElement(By.id("prependedInput2")).sendKeys("samepassword");
        // driver.findElement(By.id("_submit")).click();

        extentLogger = report.createTest("Wrong Password Test");

        LoginPage loginPage = new LoginPage();
        loginPage.usernameInput.sendKeys("someusername");

        extentLogger.info("Enter Username : User1");

        loginPage.passwordInput.sendKeys("UserUser123");

        extentLogger.info("Enter Password : Somepassword");

        loginPage.loginBtn.click();
        extentLogger.info("Click login button");


        Assert.assertEquals(driver.getCurrentUrl(), "https://qa1.vytrack.com/user/login");
extentLogger.pass("Wrong Password Test is Passed");
    }
    @Test
    public void wrongUsernameTest(){
        extentLogger = report.createTest("Wrong Username Test");

        LoginPage loginPage = new LoginPage();
        extentLogger.info("Enter username : someusername");
        loginPage.usernameInput.sendKeys("someusername");
        extentLogger.info("Enter password : somepassword");

        loginPage.passwordInput.sendKeys("UserUser123");
        extentLogger.info("Click login Button");

        loginPage.loginBtn.click();
        extentLogger.info("Verify page URL");

        Assert.assertEquals(driver.getCurrentUrl(),"https://qa1.vytrack.com/user/login");
        extentLogger.pass("Wrong password Test is Passed");
    }


}
