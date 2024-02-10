package com.seleniumadvance.base;

import com.seleniumadvance.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BasePage {
    //Webrivers, URL, Waits , Common Verification can be there in BasePage
    //This page is common to all the pages.

    public BasePage() {
        System.out.println("If you want to call something before every Page Object class, Put your code here ");
        //Open some file , open database connection write code here - futuristic approach
    }

    //Waits

    public void implicitWait() {
        DriverManager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    //Driver Call
    //Common Functions

    public void clickElements(By by) {
        DriverManager.getDriver().findElement(by).click();
    }

    public WebElement presenceofElement(final By elementLocation) {
        return new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(elementLocation));
    }

    public WebElement visibilityOfElement(final By elementLocation) {
        return new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(elementLocation));
    }

    protected void enterInput(By by, String key) {
        DriverManager.getDriver().findElement(by).sendKeys(key);
    }

    protected WebElement getElement(By key) {
        return DriverManager.getDriver().findElement(key);
    }

    public void iWaitForElementToBeVisible(WebElement loc, String url) {
        try {
            WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(20));
            wait.until(ExpectedConditions.visibilityOfAllElements(loc));
            wait.until(ExpectedConditions.urlContains(url));
        } catch (Exception e) {
            System.out.println("Failed to Wait!: " + e.toString());
        }
    }

    //Common Assertions



}


