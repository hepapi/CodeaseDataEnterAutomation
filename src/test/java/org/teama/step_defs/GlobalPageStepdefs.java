package org.teama.step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.teama.pages.GlobalPage;

public class GlobalPageStepdefs {
    GlobalPage globalPage = new GlobalPage();

    @Given("navigate to home page")
    public void navigateToHomePage() {
        globalPage.navigateToHomepage();
    }

    @Then("login to codease")
    public void loginToCodease() {
        globalPage.loginToCodease();
    }
}
