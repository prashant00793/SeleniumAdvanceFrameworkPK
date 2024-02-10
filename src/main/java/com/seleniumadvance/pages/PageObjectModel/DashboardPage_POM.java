package com.seleniumadvance.pages.PageObjectModel;

import com.seleniumadvance.base.BasePage;
import org.openqa.selenium.By;

public class DashboardPage_POM extends BasePage {

    DashboardPage_POM() {

    }

    By userNameOnDashboard = By.cssSelector("[data-qa=\"lufexuloga\"]");

    public String loggedInUsername() {
        presenceofElement(userNameOnDashboard);
        return getElement(userNameOnDashboard).getText();
    }
}


