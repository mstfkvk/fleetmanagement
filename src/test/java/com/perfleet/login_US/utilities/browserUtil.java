package com.perfleet.login_US.utilities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class browserUtil {


    public static void waitUntilLoadingBarDisappeared(WebElement element, int time) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), time);
        wait.until(ExpectedConditions.invisibilityOf(element));
    }



    public static void verifySubTitle(String expected, WebElement element) {
        String actual = element.getText();
        Assert.assertTrue(expected.contains(actual));
    }

    public static void verifyURL(String expectedURL, boolean true_false) {
        expectedURL = ConfigurationReader.getProperty(expectedURL);
        String actualURL = Driver.getDriver().getCurrentUrl();
        if (!true_false) {
            Assert.assertFalse(expectedURL.contains(actualURL));
        } else {
            Assert.assertTrue(expectedURL.contains(actualURL));
        }
    }


    /**
     * waits for backgrounds processes on the browser to complete
     *
     * @param timeOutInSeconds
     */
    public static void waitForPageToLoad(long timeOutInSeconds) {
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeOutInSeconds);
            wait.until(expectation);
        } catch (Throwable error) {
            error.printStackTrace();
        }
    }


}
