package day12;

import org.testng.Assert;
import org.testng.annotations.Test;

public class day12 {
    @Test
    public void test1()
    {
        System.out.println("First Assertion");
        String expectedTitle = "Cyb";
        String actualTitle = "Cybertek";
        Assert.assertTrue(actualTitle.startsWith(expectedTitle));

    }
    @Test
    public void test4(){
        String email = "mike@smith.com";
        Assert.assertTrue(email.contains("@"));
    }

}
