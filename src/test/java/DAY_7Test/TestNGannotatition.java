package DAY_7Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGannotatition {
    @Test
    public void test1(){
        System.out.println("First Assertion");
        Assert.assertEquals("title", "title");
        Assert.assertEquals("url", "url");
        System.out.println("Second Assertion");
        System.out.println("Again Hello");
    }




}
