package com.seleniumadvance.pages.PageObjectModel;

import com.seleniumadvance.base.CommonToAllPage;
import com.seleniumadvance.utils.PropertyReader;
import org.openqa.selenium.By;

public class LoginPage_POM extends CommonToAllPage {

    LoginPage_POM() {
        super();
    }

    //Page Locators
    By username = By.id("login-username");
    By password = By.id("login-password");
    By signButton = By.id("js-login-btn");

    public LoginPage_POM loginToVWO() throws Exception {
        enterInput(username, PropertyReader.readKey("username"));
        enterInput(password, PropertyReader.readKey("password"));
        clickElements(signButton);
        //Pass the control to the DashBoard page
        return this;
    }

    public void loginToVWONegative() throws Exception {
        enterInput(username, PropertyReader.readKey("username"));
        enterInput(password, PropertyReader.readKey("password"));
        clickElements(signButton);
        //error String
    }

    public DashboardPage_POM afterLogin() {
        return new DashboardPage_POM();
    }


}
