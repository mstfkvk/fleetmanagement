package com.perfleet.step_definitions.login_US;


import com.perfleet.pages.HomePage;
import com.perfleet.pages.LoginPage;
import com.perfleet.utilities.ConfigurationReader;
import com.perfleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class _4_remember_Me {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @When("user chooses remember_Me_checkbox")
    public void user_chooses_remember_me_checkbox() throws InterruptedException {
        LoginPage.rememberMeCheckBox.click();
        Thread.sleep(3000);
    }

    @When("user should be on the home page")
    public void user_should_be_on_the_home_page() {
        String home_url = ConfigurationReader.getProperty("home_URL");
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(home_url));
    }

    @When("user logouts")
    public void user_logouts() {
        homePage.logOut();
    }

    @Then("user should see {string} and {string}")
    public void user_should_see_and(String string, String string2) {
        boolean valueOfUsername = loginPage.usernameField.getAttribute("value").equalsIgnoreCase(string);
        boolean valueOfPassword = loginPage.passwordField.getAttribute("value").equalsIgnoreCase(string2);

        System.out.println("username: " + loginPage.usernameField.getAttribute("value"));
        System.out.println("password: " + loginPage.passwordField.getAttribute("value"));


        Assert.assertFalse(valueOfUsername && valueOfPassword);
    }

}
