package org.teama.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.teama.utils.Utils;

public class TimesheetPage extends BasePage{

    @FindBy(className = "ui-slats-panel-content")
    public WebElement slatsPanel;

    public void clickSlatsPanel() {
        Utils.clickElement(slatsPanel);
    }
}
