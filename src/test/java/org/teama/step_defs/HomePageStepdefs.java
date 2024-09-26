package org.teama.step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.teama.pages.HomePage;

public class HomePageStepdefs {

    HomePage homePage = new HomePage();

    @Then("verify home page successfully opened")
    public void verifyHomePageSuccessfullyOpened() {
        homePage.verifyHomePageOpened();
    }

    @Given("open timesheet page")
    public void openTimesheetPage() {
        homePage.openTimesheetPage();
    }
}
