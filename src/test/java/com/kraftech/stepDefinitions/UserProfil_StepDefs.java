package com.kraftech.stepDefinitions;

import com.kraftech.pages.UserProfilePage;
import com.kraftech.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class UserProfil_StepDefs {

    UserProfilePage userProfilePage = new UserProfilePage();

    @Then("The user should be able to see following submenu")
    public void the_user_should_be_able_to_see_following_submenu(List<String> expectedList) {
        List<String> actualList = BrowserUtils.getElementsText(userProfilePage.tabList);
        System.out.println("actualList.size() = " + actualList.size());
        System.out.println("expectedList = " + expectedList);
        System.out.println("actualList = " + actualList);
        Assert.assertEquals(expectedList, actualList);

    }

}





