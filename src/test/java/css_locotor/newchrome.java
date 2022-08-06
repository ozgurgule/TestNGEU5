package css_locotor;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newchrome {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");

    }
}
