package day3;

import cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class CallWebDriverFactory {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://giftlandspain.com/");
        String title = driver.getTitle();

        System.out.println("title = " + title);
        driver.get("https://transfermarkt.com");

    }
}
