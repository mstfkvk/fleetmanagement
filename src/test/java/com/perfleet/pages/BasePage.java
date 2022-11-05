package com.perfleet.pages;

import com.perfleet.utilities.ConfigurationReader;
import com.perfleet.utilities.Driver;
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
