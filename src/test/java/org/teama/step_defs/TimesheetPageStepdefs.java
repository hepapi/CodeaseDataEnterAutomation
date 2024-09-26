package org.teama.step_defs;

import io.cucumber.java.en.When;
import org.teama.pages.TimesheetPage;

public class TimesheetPageStepdefs {
    TimesheetPage timesheetPage = new TimesheetPage();

    @When("open slats panel")
    public void openSlatsPanel() {
        timesheetPage.clickSlatsPanel();
    }
}
