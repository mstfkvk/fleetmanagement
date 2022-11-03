package com.perfleet.login_US.pages;

import com.perfleet.login_US.utilities.ConfigurationReader;
import com.perfleet.login_US.utilities.Driver;
import org.jsoup.Connection;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    protected WebDriver driver;

    public BasePage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void goToPage() {
        driver.get(ConfigurationReader.getProperty("URL"));
    }



}
