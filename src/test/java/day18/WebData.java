package day18;

import cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebData {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/tables");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
    @Test
    public void printTable(){
        WebElement table =driver.findElement(By.xpath("//table[@id='table1']"));
        System.out.println(table.getText());
        Assert.assertTrue(table.getText().contains("jdoe@hotmail.com"));
    }
    @Test
    public void getAllHeaders(){
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));
        System.out.println("headers.size() = " + headers.size());
        for (WebElement header : headers) {
            System.out.println(header.getText());

        }
    }
    @Test
    public void printTableSize(){
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));
        System.out.println("headers.size() = " + headers.size());
        //number of rows
        List<WebElement> allRowsWithHeader = driver.findElements(By.xpath("//table[@id='table1']//tr"));
        System.out.println(allRowsWithHeader.size());

        //number of rows without header(we prefer this)
        List<WebElement> allRowsWithoutHeader = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        System.out.println(allRowsWithoutHeader.size());
    }
    @Test
    public void getRow(){
        WebElement row2 = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[2]"));
    List<WebElement> numRows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        for (int i = 1; i < numRows.size(); i++) {
             WebElement row = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[\"+i+\"]"));
            System.out.println(i + "-" + row.getText());
        }
    }
    @Test
    public void getAllCellInOneRow(){
        List<WebElement> allCellInOneRow = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td"));
        for (WebElement Element : allCellInOneRow) {
            System.out.println(Element.getText());

        }

    }
    @Test
    public void getSingleCell(){
        WebElement singleCell = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[1]/td[3]"));
        System.out.println("singleCell.getText() = " + singleCell.getText());
    }



}
