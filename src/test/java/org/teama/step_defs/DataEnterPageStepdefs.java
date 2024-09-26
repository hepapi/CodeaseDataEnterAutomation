package org.teama.step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.teama.pages.DataEnterPage;

public class DataEnterPageStepdefs {

    DataEnterPage dataEnterPage = new DataEnterPage();

    @And("open {int} task")
    public void openTask(int amount) {
        dataEnterPage.addTask(amount);
    }

    @And("set {int} {string} customer")
    public void setCustomer(int amount, String customerName) {
        dataEnterPage.setCustomers(customerName,amount);
    }

    @And("set projects to {string}")
    public void setProjectsTo(String project) {
        dataEnterPage.setProject(project);
    }

    @And("set {string} for day")
    public void setForDay(String day) {
        dataEnterPage.setDays(day);
    }

    @Then("wait for manuel enter")
    public void waitForManuelEnter() {
        dataEnterPage.waitForManuelEnter();
    }
}
