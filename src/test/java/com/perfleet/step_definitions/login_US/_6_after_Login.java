package com.perfleet.step_definitions.login_US;


import com.perfleet.login_US.utilities.ConfigurationReader;
import com.perfleet.pages.HomePage;
import com.perfleet.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class _6_after_Login {

    HomePage homePage = new HomePage();

    @When("user login successfully with {string}")
    public void user_login_successfully_with(String string) {
        new LoginPage().login(string, ConfigurationReader.getProperty("password"));
    }

    @Then("user should see {string} in the profile menu")
    public void user_should_see_in_the_profile_menu(String string) {
        System.out.println(homePage.userNameBtn.getText());
        Assert.assertFalse(homePage.userNameBtn.getText().equalsIgnoreCase(string));
    }


}
