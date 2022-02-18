package day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driver {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");
       // driver.navigate().to("https://www.google.com/?hl=nl");
        String title = driver.getTitle();
        System.out.println("title = " + title);
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);
        String pageSource = driver.getPageSource();
        System.out.println("pageSource = " + pageSource);



        System.out.println(driver.getTitle());


    }
}
