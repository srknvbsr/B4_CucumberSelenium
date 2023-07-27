package com.kraftech.stepDefinitions;

import com.kraftech.pages.LoginPage;
import com.kraftech.utilities.BrowserUtils;
import com.kraftech.utilities.ConfigurationReader;
import com.kraftech.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.concurrent.ConcurrentHashMap;

public class Login_StepDefs {

    LoginPage loginPage =new LoginPage();

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        //System.out.println("I open the browser and navigate to kraftech web page");
        Driver.get().get(ConfigurationReader.get("url"));


    }
    @When("The user enters teacher credentials")
    public void the_user_enters_teacher_credentials() throws InterruptedException {
        //System.out.println("I enter userEmail and password and click login button");
        loginPage.login(ConfigurationReader.get("teacherEmail"),ConfigurationReader.get("teacherPassword"));

    }
    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {
        //System.out.println("I verify that url changed dashboard");
        String actual=Driver.get().getCurrentUrl();
        String expected ="https://www.krafttechexlab.com/index";//sayfaya girdikten sonraki url
        Assert.assertEquals(expected,actual);


    }
    @When("The user enters student credentials")
    public void the_user_enters_student_credentials() {
        //System.out.println("I enter student userEmail and password and click login button");
        loginPage.login(ConfigurationReader.get("studentEmail"),ConfigurationReader.get("studentPassword"));



    }
    @When("The user enters developer credentials")
    public void the_user_enters_developer_credentials() {

        //System.out.println("I enter developer userEmail and password and click login button");
        loginPage.login(ConfigurationReader.get("developerEmail"),ConfigurationReader.get("developerPassword"));
       // Assert.assertTrue(false);

    }
    @When("The user enters SDET credentials")
    public void the_user_enters_sdet_credentials() {
        System.out.println("I enter SDET userEmail and password and click login button");

    }

    @When("The user logs in using {string} and {string}")
    public void theUserLogsInUsingAnd(String arg0, String arg1) {
        loginPage.login(arg0,arg1);
    }

    @Then("Validate that username is {string}")
    public void validateThatUsernameIs(String arg0) {
        String expected = arg0;
        String actual = loginPage.getUserAccountName();
        Assert.assertEquals(expected,actual);

    }
    @Then("Validate that warning message is {string}")
    public void validate_that_warning_message_is(String expectedMessage) {
        BrowserUtils.waitFor(1);
        String actualWarningMessageText = loginPage.getWarningMessageText(expectedMessage);
        Assert.assertEquals(expectedMessage,actualWarningMessageText);

    }


}
