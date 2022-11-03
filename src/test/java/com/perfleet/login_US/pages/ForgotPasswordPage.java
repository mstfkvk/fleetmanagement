package com.perfleet.login_US.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.PublicKey;

public class ForgotPasswordPage extends BasePage {

    @FindBy(id = "prependedInput")
    public WebElement usernameOrEmailField;


    @FindBy(xpath = "//*[.='Request']")
    public WebElement requestBtn;


    // css="fieldset.oro-forgot-password > div.alert"
    // it valids for both
    @FindBy(css = ".alert-error")
    public WebElement errorMessage;

    @FindBy(css = ".alert-warn")
    public WebElement warnMessage;


}
