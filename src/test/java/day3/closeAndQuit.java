package day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.experimental.theories.Theories;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeAndQuit {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");
        Thread.sleep(3000);
        driver.navigate().back();

        driver= new ChromeDriver();


        driver.get("http://practice.cybertekschool.com/open_new_tab");
        Thread.sleep(5000);



        driver.quit();
    }
}
