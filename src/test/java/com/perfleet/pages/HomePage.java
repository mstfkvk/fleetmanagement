package com.perfleet.pages;

import com.perfleet.login_US.utilities.ConfigurationReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//a[@href='javascript: void(0);']")
    public WebElement userNameBtn;


    @FindBy(xpath = "//a[@href='/user/logout']")
    public WebElement logOutBtn;

    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public WebElement homeTitle;

    @FindBy(xpath = "(//*[.='×'])[2]")
    public WebElement messageFirst;

    @FindBy(xpath = "(//*[.='×'])[3]")
    public WebElement messageSecond;


    public void logOut(){
        userNameBtn.click();
        logOutBtn.click();
    }

}
