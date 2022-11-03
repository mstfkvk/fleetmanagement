package com.perfleet.step_definitions.login_US;

import com.perfleet.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class _5_with_Enter_Button_Login {

    LoginPage loginPage = new LoginPage();

    @When("user types {string} and click ENTER")
    public void user_types_and_click_enter(String string) {
        loginPage.usernameField.sendKeys(string + Keys.ENTER);
    }

    @When("user type {string} and click ENTER")
    public void user_type_and_click_enter(String string) {
        loginPage.passwordField.sendKeys(string + Keys.ENTER);
    }

    @Then("user should see warning message")
    public void user_should_see_warning_message() {
        String validationmessage = loginPage.invalidCredentialMessage.getAttribute("textContent");
        Assert.assertTrue(validationmessage.toLowerCase().contains("invalid"));
    }

}
