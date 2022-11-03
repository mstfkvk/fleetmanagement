package com.perfleet.login_US.pages;

import com.perfleet.login_US.utilities.ConfigurationReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(css = "#user-menu > a")
    public WebElement userNameBtn;


    @FindBy(css = "a[href='/user/logout']")
    public WebElement logOutBtn;

    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public WebElement homeTitle;

    @FindBy(xpath = "(//*[.='×'])[2]")
    public WebElement messageFirst;

    @FindBy(xpath = "(//*[.='×'])[3]")
    public WebElement messageSecond;



}
