package com.kraftech.stepDefinitions;

import com.kraftech.pages.EditProfilePage;
import com.kraftech.pages.UserProfilePage;
import com.kraftech.utilities.BrowserUtils;
import com.kraftech.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class UserProfil_StepDefs {

    UserProfilePage userProfilePage = new UserProfilePage();
    EditProfilePage editProfilePage = new EditProfilePage();

    @Then("The user should be able to see following submenu")
    public void the_user_should_be_able_to_see_following_submenu(List<String> expectedList) {
        List<String> actualList = BrowserUtils.getElementsText(userProfilePage.tabList);
        System.out.println("actualList.size() = " + actualList.size());
        System.out.println("expectedList = " + expectedList);
        System.out.println("actualList = " + actualList);
        Assert.assertEquals(expectedList, actualList);

    }

    @When("The user navigates to {string}")
    public void the_user_navigates_to(String subMenu) {
        userProfilePage.navigateToOverViewMenu(subMenu);


    }

    @When("The user adds {string} {string}")
    public void the_user_adds(String profileBox, String userInfo) {
        editProfilePage.editProfileInfo(profileBox, userInfo);
        BrowserUtils.waitFor(1);


    }

    @When("The user select {string} from menu")
    public void the_user_select_from_menu(String job) {
        editProfilePage.getSelectedJob(job);


    }

    @When("The user clicks on save changes button")
    public void the_user_clicks_on_save_changes_button() {
        editProfilePage.saveChangeBtn.click();
    }
    @Then("Validate that message is {string}")
    public void validate_that_message_is(String expected) {
        String actualelement = Driver.get().findElement(By.xpath("//div[text()='" + expected + "']")).getText();
        System.out.println("expected = " + expected);
        System.out.println("actualelement = " + actualelement);
        Assert.assertEquals(expected,actualelement);

    }


}





