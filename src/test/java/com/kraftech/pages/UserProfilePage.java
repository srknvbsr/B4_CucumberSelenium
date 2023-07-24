package com.kraftech.pages;
import com.kraftech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class UserProfilePage extends BasePage {

    @FindBy(css = "[role='alert']")
    public WebElement updateMessage;

    @FindBy(css = "[class='nav nav-tabs nav-tabs-bordered']>li")
    public List<WebElement> tabList;





    public void navigateToOverViewMenu(String tab) {
        WebElement tabElement = Driver.get().findElement(By.xpath("//li/button[.='" + tab + "']"));
        tabElement.click();
    }

    public String updateMessageGetText() {
        return updateMessage.getText();
    }

}
