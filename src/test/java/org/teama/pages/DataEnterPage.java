package org.teama.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.teama.utils.Utils;

import java.util.List;

public class DataEnterPage extends BasePage{

    int taskCount = 0;

    @FindAll(@FindBy(xpath = "//select[@name=\"Musteri\"]"))
    public List<WebElement> customers;
    @FindAll(@FindBy(xpath = "//select[@name=\"Proje\"]"))
    public List<WebElement>  project;
    @FindAll(@FindBy(xpath = "//input[@class=\"ui-form-datetimebox ui-control ui-form-picker hasDatepicker\"]"))
    public List<WebElement>  day;
    @FindAll(@FindBy(xpath = "YapilanGorev"))
    public List<WebElement>  description;
    @FindAll(@FindBy(css = ".ui-form-numericbox.ui-control"))
    public List<WebElement>  time;
    @FindBy(xpath = "//button[@class=(\"ak-btn primary  \")]")
    public WebElement newAddBtn;

    public void addTask(int amount){
        for (int i=0;i<amount-1;i++){
            Utils.clickElement(newAddBtn);
        }
        Utils.staticWait(3000);
    }

    public void setCustomers(String _customer,int amount){
        amount += taskCount;
        for (int i=taskCount;i<amount;i++){
            taskCount++;
            Select select = new Select(customers.get(i));
            select.selectByVisibleText(_customer);
        }
    }

    public void setProject(String _project){
        int amount = project.size();
        for (int i=0; i<amount; i++){
            Select select = new Select(project.get(i));
            select.selectByVisibleText(_project);
        }
        Utils.staticWait(3000);
    }

    public void setDays(String _day) {
        int amount = day.size();
        for (int i=0; i<amount; i++){
            day.get(i).sendKeys(_day);
        }
    }

    public void waitForManuelEnter() {
        Utils.staticWait(1800000000);
    }


}
