package com.kraftech.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigationMenu_StepDef {
    @When("Login as Mike")
    public void login_as_mike() {
        System.out.println("Login as Mike");
    }

    @Then("Validate that Dashboard text is visible")
    public void validate_that_text_is_visible() {
        System.out.println("Validate that dashboard text is visible");
    }

    @When("The go to developer Menu")
    public void theGoToDeveloperMenu() {
        System.out.println("Go to Developer Menu");

    }

    @Then("Validate that Deveolopers text is visible")
    public void validateThatDeveolopersTextIsVisible() {
        System.out.println("Validate that develoopers text is visible");
    }
    @When("Login as Sebastian")
    public void login_as_sebastian() {
        System.out.println("Login as Sebastian");
    }
    @When("The go to Forms-Input Menu")
    public void the_go_to_forms_ınput_menu() {
        System.out.println("Go to Forms-Input Menu");

    }
    @Then("Validate that General Form Element-Input text is visible")
    public void validate_that_general_form_element_ınput_text_is_visible() {
        System.out.println("Validate that General Form Element-Input text is visible");

    }

    @When("Login as John")
    public void loginAsJohn() {
        System.out.println("Login as John");

    }

    @When("The go to My profil Menu")
    public void theGoToMyProfilMenu() {
        System.out.println("Go to My Profil Menu");


    }

    @Then("Validate that User profil text is visible")
    public void validateThatUserProfilTextIsVisible() {
        System.out.println("Validate that User profil text is Visible");
    }
}
