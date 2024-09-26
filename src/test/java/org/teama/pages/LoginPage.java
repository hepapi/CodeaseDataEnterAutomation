package org.teama.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.teama.utils.UserDataReader;
import org.teama.utils.Utils;

public class LoginPage extends BasePage{

    UserDataReader user = new UserDataReader();

    @FindBy(css = ".ui-control.username")
    private WebElement email;

    @FindBy(css = ".ui-control.password")
    private WebElement password;

    @FindBy(css = ".primary.ak-btn.ui-loginbutton")
    public WebElement loginButton;

    @FindBy(css = ".fa.fa-fw.ui-login-Organization")
    public WebElement codeaseBtn;

    public void openCodeasePage() {
        Utils.clickElement(codeaseBtn);
    }

    public void fillEmailCredentials() {
        Utils.verifyElement(email);
        email.sendKeys(user.getEmail());
    }

    public void fillPasswordCredentials() {
        Utils.verifyElement(password);
        password.sendKeys(user.getPassword());
    }

    public void clickLoginButton() {
        Utils.clickElement(loginButton);
    }
}
