package com.perfleet.login_US.pages;

import com.perfleet.login_US.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    @FindBy(id = "prependedInput")
    public WebElement usernameField;

    @FindBy(id = "prependedInput2")
    public WebElement passwordField;

    @FindBy(className = "custom-checkbox__icon")
    public WebElement rememberMeCheckBox;

    @FindBy(xpath = "//a[@href='/user/reset-request']")
    public WebElement forgotYourPasswordLink;

    @FindBy(id = "_submit")
    public WebElement loginBtn;

    @FindBy(xpath = "//div[.='Invalid user name or password.']")
    public WebElement invalidCredentialMessage;

    @FindBy(xpath = "//div[@class='bar']")
    public WebElement loadingBar;

    public void login(String username, String password) {
        this.usernameField.sendKeys(username);
        this.passwordField.sendKeys(password);
        this.loginBtn.click();
    }

    public void loginWithRememberMe(String username, String password) {
        this.usernameField.sendKeys(username);
        this.passwordField.sendKeys(password);
        this.rememberMeCheckBox.click();
        this.loginBtn.click();
    }

    public void loginWithEnterBtn(String username, String password) {
        this.usernameField.sendKeys(username + Keys.ENTER);
        this.passwordField.sendKeys(password + Keys.ENTER);
        this.loginBtn.click();
    }



}
