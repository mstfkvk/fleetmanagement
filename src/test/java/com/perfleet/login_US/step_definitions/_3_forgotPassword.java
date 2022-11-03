package com.perfleet.login_US.step_definitions;

import com.perfleet.login_US.pages.ForgotPasswordPage;
import com.perfleet.login_US.pages.LoginPage;
import com.perfleet.login_US.utilities.ConfigurationReader;
import com.perfleet.login_US.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class _3_forgotPassword {
    LoginPage loginPage = new LoginPage();
    ForgotPasswordPage forgotPasswordPage=new ForgotPasswordPage();

    @When("user clicks Forgot your password? link")
    public void user_clicks_link() {
        Driver.getDriver().get(ConfigurationReader.getProperty("URL"));
        LoginPage.forgotYourPasswordLink.click();
    }

    @When("user goes to forgot_password_page")
    public void user_goes_to() {

    }

    @When("user types username and clicks request button")
    public void user_types_username_and_clicks_request_button() {
        forgotPasswordPage.usernameOrEmailField.sendKeys("salesmanager101");
        forgotPasswordPage.requestBtn.click();
    }

    @Then("user should see message")
    public void user_Should_See_Message(String message) {

        Assert.assertEquals("correct",message,forgotPasswordPage.warnMessage.getAttribute("outerText"));
    }
}
