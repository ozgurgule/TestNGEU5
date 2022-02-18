package day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driver1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.giftlandspain.com");
        Thread.sleep(5000);
        driver.navigate().to("http://www.amazon.com");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().forward();
        String title = driver.getTitle();
        System.out.println("title = " + title);


    }
}
