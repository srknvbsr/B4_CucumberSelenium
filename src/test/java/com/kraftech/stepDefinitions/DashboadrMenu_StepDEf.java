package com.kraftech.stepDefinitions;

import com.kraftech.pages.DashboardPage;
import com.kraftech.pages.LoginPage;
import com.kraftech.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import java.util.List;
import java.util.Map;

public class DashboadrMenu_StepDEf {
    DashboardPage dashboardPage = new DashboardPage();
    LoginPage loginPage = new LoginPage();

    @Then("The user should be able to see following menu")
    public void the_user_should_be_able_to_see_follow_menu(List<String> expectedList) {

        System.out.println("expectedList.size() = " + expectedList.size());
        System.out.println("expectedList = " + expectedList);
        List<String> actualList = BrowserUtils.getElementsText(dashboardPage.upTitles);

        /*
         List<String>actualList=new ArrayList<>();
        for (WebElement elm: dashboardPage.upTitles) {
            actualList.add(elm.getText());

        }
        Gereksiz yazım bu hatayı görmek amacıyla yapıldı.
         */

        System.out.println("actualList = " + actualList);
        Assert.assertEquals(expectedList, actualList);
    }

    @When("The user logs in using following menu")
    public void the_user_logs_in_using_following_menu(Map<String, String> userCredentials) {
        System.out.println("userCredentials = " + userCredentials);

        loginPage.login(userCredentials.get("username"),
                userCredentials.get("password"));
        Assert.assertEquals(userCredentials.get("name"), dashboardPage.userAccountName.getText()
        );
    }

    @When("The user navigates to {string} and {string} subMenu")
    public void the_user_navigates_to_and_sub_menu(String string, String string2) {
        dashboardPage.navigateToModule(string, string2);
    }

}
