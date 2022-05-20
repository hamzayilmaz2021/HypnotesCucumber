package stepdefinitions;

import io.cucumber.java.en.When;
import pages.DashboardPage;

public class US046_SD {
    DashboardPage page = new DashboardPage();
    @When("user clicks on the scheduling on the dashboard")
    public void userClicksOnTheSchedulingOnTheDashboard() {
        page.schedulingLink.click();
    }
}
