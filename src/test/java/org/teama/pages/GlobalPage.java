package org.teama.pages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.teama.utils.ConfDataReader;
import org.teama.utils.Driver;

public class GlobalPage extends BasePage {

    private static final Logger log = LoggerFactory.getLogger(GlobalPage.class);
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();


    public void navigateToHomepage() {
        Driver.get().get(ConfDataReader.get("url"));
    }

    public void loginToCodease() {
        loginPage.openCodeasePage();
        loginPage.fillEmailCredentials();
        loginPage.fillPasswordCredentials();
        loginPage.clickLoginButton();
    }
}
