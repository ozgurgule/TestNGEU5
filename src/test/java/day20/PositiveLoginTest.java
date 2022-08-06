package day20;

import Utilities.ConfigurationReader;
import Utilities.TestBase;

import cybertek.pages.LoginPage;
import io.cucumber.java.ja.但し;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveLoginTest extends TestBase {

    @Test
    public  void loginAsDriver(){
        LoginPage loginPage = new LoginPage();
         String username = ConfigurationReader.get("driver_username");
             String password = ConfigurationReader.get("driver_password");


      loginPage.usernameInput.sendKeys(username);
       loginPage.passwordInput.sendKeys(password);
        loginPage.loginBtn.click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://qa1.vytrack.com/");

    }
    @Test
    public void loginAsStoreManager(){
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");
        loginPage.login(username,password);
        Assert.assertEquals(driver.getCurrentUrl(),"https://qa1.vytrack.com/");

    }



}
