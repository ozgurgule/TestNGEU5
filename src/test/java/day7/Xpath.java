package day7;

import cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Xpath {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://amazon.nl");
        //driver.findElement(By.xpath("//button[@onclick='button1()']")).click();
       // driver.findElement(By.xpath("//a[.='Bestsellers']")).click();
       // WebElement fint = driver.findElement(By.xpath("//span[@class='hm-icon-label']"));
       // fint.click();
       // System.out.println("fint = " + fint.getText());
        WebElement dad = driver.findElement(By.xpath("//span[.='Prime']"));
        dad.click();
        System.out.println("dad = " + dad);
        WebElement a = driver.findElement(By.xpath("//input[@class='a-button-input']"));
        a.click();




    }
}
