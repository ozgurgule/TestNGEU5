package day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driver {
    public static void main(String[] args) {
        System.out.println("Hello world");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://cybertekschool.com");

        if(9<10){
            System.out.println("9 is less than 10");
        }else{
            System.out.println("10 less than 9");
    }











    }

    public static class findacan {
    }
}
