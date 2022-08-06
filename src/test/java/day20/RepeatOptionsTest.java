package day20;

import Utilities.BrowserUtils;
import Utilities.TestBase;
import cybertek.pages.CalendarEventsPage;
import cybertek.pages.CreateCalendarEventsPage;
import cybertek.pages.DashboardPage;
import cybertek.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RepeatOptionsTest extends TestBase {
    /* Verify Radio Buttons
    Open browser
    Login as driver
    Go to Activities Calendar Event
    Click on create calendar events
    Click on repeat
    Verify that repeat every days is checked
    verify that repeat weekday is not checked */

    @Test
    public void test1(){

        LoginPage loginPage= new LoginPage();
        loginPage.usernameInput.sendKeys("User123");
        loginPage.passwordInput.sendKeys("UserUser123");
        loginPage.loginBtn.click();
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.navigateToModule("Activities", "Calendar Events");
        CalendarEventsPage calendarEventsPage= new CalendarEventsPage();
        calendarEventsPage.waitUntilLoaderScreenDisappear();
       // BrowserUtils.waitForClickablility(calendarEventsPage.createCalendarEvent,5);
        calendarEventsPage.createCalendarEvent.click();
        CreateCalendarEventsPage createCalendarEventsPage = new CreateCalendarEventsPage();
        createCalendarEventsPage.repeat.click();
        Assert.assertTrue(createCalendarEventsPage.days.isSelected(), "Verify repeat days is selected");
        Assert.assertFalse(CreateCalendarEventsPage.weekday.isSelected(),"Verify weekday is not selected");
    }
}
