package com.kraftech.stepDefinitions;

import com.kraftech.pages.HomeWorkPage;
import com.kraftech.utilities.BrowserUtils;
import com.kraftech.utilities.ConfigurationReader;
import com.kraftech.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class HomeWork_StepDef {
    HomeWorkPage homeWorkPage = new HomeWorkPage();


    @Given("The user is on the home page")
    public void the_user_is_on_the_home_page() {
        Driver.get().get(ConfigurationReader.get("url1"));

    }
    @Then("The user should be able to see following demoqaMenu")
        public void the_user_should_be_able_to_see_following_submenu(List<String> expectedList) {
        List<String> actualList = BrowserUtils.getElementsText(homeWorkPage.demoqatabList);
        System.out.println("actualList.size() = " + actualList.size());
        System.out.println("expectedList = " + expectedList);
        System.out.println("actualList = " + actualList);
        Assert.assertEquals(expectedList, actualList);

    }

}
