package day20;

import Utilities.BrowserUtils;
import Utilities.TestBase;
import cybertek.pages.CalendarEventsPage;
import cybertek.pages.DashboardPage;
import cybertek.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageSubtitleTest extends TestBase {

    /**
     * TestCase
     * Open Browser
     * Login as a Driver
     * Verify that page subtitle is Quick Launcpad
     * Go to Acticities -> Calender Events
     * Verify that page subtitle is Calender Events

     */
    @Test
    public void test1(){
        LoginPage loginPage = new LoginPage();

        loginPage.loginAsDriver();

        String expectedSubtitle = "Quick Launchpad";

        DashboardPage dashboardPage = new DashboardPage();

        String actualSubtitle = dashboardPage.getPageSubTitle();

        Assert.assertEquals(actualSubtitle,expectedSubtitle,"Verify subtitle");

        dashboardPage.navigateToModule("Activities","Calendar Events");

        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

        BrowserUtils.waitFor(2);

        Assert.assertEquals(calendarEventsPage.getPageSubTitle(),"Calendar Events","Verify subtitle Calendar Events");
    }


}
