package com.seleniumadvance.pages.PageObjectModel;

import com.seleniumadvance.base.CommonToAllPage;
import com.seleniumadvance.driver.DriverManagerTL;
import com.seleniumadvance.utils.PropertyReader;
import org.openqa.selenium.By;

public class LoginPage_POM extends CommonToAllPage {

    public LoginPage_POM() {
        super();
    }

    //Page Locators
    By username = By.id("login-username");
    By password = By.id("login-password");
    By signButton = By.id("js-login-btn");

    By error_message = By.id("js-notification-box-msg");

    public LoginPage_POM loginToVWOPositive() throws Exception {
        enterInput(username, PropertyReader.readKey("username"));
        enterInput(password, PropertyReader.readKey("password"));
        clickElements(signButton);
        //Pass the control to the DashBoard page
        return this;
    }

    public LoginPage_POM openURL(String url){
        DriverManagerTL.getDriver().get(url);
        return this;
    }

    public String loginToVWONegative() throws Exception {
        enterInput(username, "admin");
        enterInput(password, PropertyReader.readKey("password"));
        clickElements(signButton);
        //error String
        visibilityOfElement(error_message);
         return  getElement(error_message).getText();

    }

    public DashboardPage_POM afterLogin() {
        return new DashboardPage_POM();
    }


}
