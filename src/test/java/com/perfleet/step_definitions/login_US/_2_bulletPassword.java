package com.perfleet.step_definitions.login_US;


import com.perfleet.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class _2_bulletPassword {

    LoginPage loginPage = new LoginPage();

    @When("user types password")
    public void user_types_password() {
        loginPage.passwordField.sendKeys("dsfafas");
    }

    @Then("sees bullet sign")
    public void seesBulletSign() {
        Assert.assertTrue(loginPage.passwordField.getAttribute("type").equals("password"));
    }
}

