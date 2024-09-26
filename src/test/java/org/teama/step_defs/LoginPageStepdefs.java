package org.teama.step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.teama.pages.LoginPage;

public class LoginPageStepdefs {

    LoginPage loginPage = new LoginPage();

    @And("fill email credentials")
    public void fillEmailCredentials() {
        loginPage.fillEmailCredentials();
    }

    @And("fill password credentials")
    public void fillPasswordCredentials() {
        loginPage.fillPasswordCredentials();
    }

    @When("open codease page")
    public void openCodeasePage() {
        loginPage.openCodeasePage();
    }
}
