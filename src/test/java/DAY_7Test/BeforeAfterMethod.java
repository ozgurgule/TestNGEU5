package DAY_7Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethod {
    @BeforeClass

            public void beforecla (){
        System.out.println("---------BEFORE CLASS-----------");
    }

    @Test
    public void test1(){
        System.out.println("First Test Case");
    }
    @Test
    public void test2(){
        System.out.println("My second test");
    }
    @BeforeMethod
    public void setUp(){
        System.out.println("WebDriver, Opening Browser");

    }
    @AfterMethod
    public void TearDown(){
        System.out.println("Closin browser, quit");
    }
}
