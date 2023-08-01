package com.kraftech.stepDefinitions;

import com.kraftech.pages.LoginPage;
import com.kraftech.utilities.BrowserUtils;
import com.kraftech.utilities.ConfigurationReader;
import com.kraftech.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;


public class Login_StepDefs {

   /* ExcelUtil excelUtil = new ExcelUtil("src/test/resources/KT_B4 DDF test.xlsx", "QA 1");
    List<Map<String, String>> dataList = excelUtil.getDataList();

    */

    LoginPage loginPage = new LoginPage();

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        //System.out.println("I open the browser and navigate to kraftech web page");
        Driver.get().get(ConfigurationReader.get("url"));


    }

    @When("The user enters teacher credentials")
    public void the_user_enters_teacher_credentials() throws InterruptedException {
        //System.out.println("I enter userEmail and password and click login button");
        loginPage.login(ConfigurationReader.get("teacherEmail"), ConfigurationReader.get("teacherPassword"));

    }

    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {
        //System.out.println("I verify that url changed dashboard");
        String actual = Driver.get().getCurrentUrl();
        String expected = "https://www.krafttechexlab.com/index";//sayfaya girdikten sonraki url
        Assert.assertEquals(expected, actual);


    }

    @When("The user enters student credentials")
    public void the_user_enters_student_credentials() {
        //System.out.println("I enter student userEmail and password and click login button");
        loginPage.login(ConfigurationReader.get("studentEmail"), ConfigurationReader.get("studentPassword"));


    }

    @When("The user enters developer credentials")
    public void the_user_enters_developer_credentials() {

        //System.out.println("I enter developer userEmail and password and click login button");
        loginPage.login(ConfigurationReader.get("developerEmail"), ConfigurationReader.get("developerPassword"));
        // Assert.assertTrue(false);

    }

    @When("The user enters SDET credentials")
    public void the_user_enters_sdet_credentials() {
        System.out.println("I enter SDET userEmail and password and click login button");

    }

    @When("The user logs in using {string} and {string}")
    public void theUserLogsInUsingAnd(String arg0, String arg1) {
        loginPage.login(arg0, arg1);
    }

    @Then("Validate that username is {string}")
    public void validateThatUsernameIs(String arg0) {
        String expected = arg0;
        String actual = loginPage.getUserAccountName();
        Assert.assertEquals(expected, actual);

    }
    @Then("Validate that warning message is {string}")
    public void validateThatWarningMessageIs(String expectedMessage) {
        BrowserUtils.waitFor(1);
        String actualWarningMessageText = loginPage.getWarningMessageText(expectedMessage);
        Assert.assertEquals(expectedMessage, actualWarningMessageText);
    }

    @When("The user enters {string} and row number {int}")
    public void the_user_enters_and_row_number(String sheetName, Integer rowNumber, Map<String, String> datalist) {
//        ExcelUtil excelUtil=new ExcelUtil("src/test/resources/KT_B4 DDF test.xlsx",sheetName);
//        List<Map<String, String>> dataList = excelUtil.getDataList();
        //loginPage.login(dataList.get(0).get("username"),dataList.get(0).get("password"));
        //loginPage.login(dataList.get(rowNumber).get("username"), dataList.get(rowNumber).get("password"));
        loginPage.getDataList(sheetName, datalist).get(rowNumber);


    }

    @Then("The user verify that account name equals {string} {int}")
    public void the_user_verify_that_account_name_equals(String string, Integer rowNumberForName) {
        String actualUsername = loginPage.userAccountName.getText();
        System.out.println("actualUsername = " + actualUsername);
        //Assert.assertEquals(actualUsername, dataList.get(rowNumberForName).get("name"));
    }

    @Then("The user verify that job name is equal {string} in the {string}")
    public void the_user_verify_that_job_name_is_equal_in_the(String string, String string2) {

    }

}
