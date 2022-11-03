package com.perfleet.login_US.step_definitions;

import com.perfleet.login_US.pages.BasePage;
import com.perfleet.login_US.pages.HomePage;
import com.perfleet.login_US.pages.LoginPage;
import com.perfleet.login_US.utilities.browserUtil;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;

public class _1_login {


    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @When("user is on the login page")
    public void user_is_on_the_login_page() {
        loginPage.goToPage();
    }

    @When("user types {string} and {string} and clicks")
    public void user_types_and_and_clicks(String string, String string2) {
        loginPage.login(string, string2);
        browserUtil.waitUntilLoadingBarDisappeared(loginPage.loadingBar, 20);
    }

    @When("user types {string} and {string} and clicks2")
    public void user_types_and_and_clicks2(String string, String string2) {
        loginPage.login(string, string2);
    }

    @When("user types {string} and {string} and clicks3")
    public void user_types_and_and_clicks3(String string, String string2) {
        loginPage.login(string, string2);
    }

    @Then("user should see {string}")
    public void user_should_see(String string) {
        browserUtil.verifySubTitle(string, homePage.homeTitle);
    }

    @Then("user should see {string}1")
    public void user_should_see1(String string) {
        if (loginPage.passwordField.getAttribute("validationMessage").equalsIgnoreCase(string)) {
            Assert.assertEquals("password is empty", string, loginPage.passwordField.getAttribute("validationMessage"));
        } else {
            Assert.assertEquals("username is empty", string, loginPage.usernameField.getAttribute("validationMessage"));
        }

    }

    @Then("user cannot be able to login")
    public void user_cannot_be_able_to_login() {
        browserUtil.verifyURL("home_URL", false);
    }


}
