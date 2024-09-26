package org.teama.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.teama.enums.Messages;
import org.teama.utils.Utils;

import java.util.List;

public class HomePage extends BasePage
{
    @FindBy(xpath = "//a[@class = \"ui-folder\"]/span[text()=\"Timesheet\"]")
    public WebElement timesheetButton;

    public void openTimesheetPage(){
        Utils.clickElement(timesheetButton);
    }

    public void verifyHomePageOpened() {
    }
}
