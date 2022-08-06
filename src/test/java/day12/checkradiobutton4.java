package day12;

import cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class checkradiobutton4 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        List<WebElement> radioButtons = (List<WebElement>) driver.findElement(By.cssSelector("input[tyepe='radio']"));
        for (WebElement radio: radioButtons){
            System.out.println(radio.getAttribute("id"));
        }
        driver.close();
    }


}
