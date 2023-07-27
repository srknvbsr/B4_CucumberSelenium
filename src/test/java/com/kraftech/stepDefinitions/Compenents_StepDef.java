package com.kraftech.stepDefinitions;

import com.kraftech.pages.CompenentsPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Compenents_StepDef {
    CompenentsPage compenentsPage = new CompenentsPage();

    @Then("Validate that {string} and {string} and {string}")
    public void validateThatAndAnd(String arg0, String arg1, String arg2) {
        String expected1=arg0;
        String expected2=arg1;
        String expected3=arg2;

        String actual1 = compenentsPage.getHomeButtonText();
        String actual2= compenentsPage.getDashBoardText();
        String actual3 = compenentsPage.getTitleText3();
        Assert.assertEquals(expected1,actual1);
        Assert.assertEquals(expected2,actual2);
        Assert.assertEquals(expected3,actual3);

    }
}
