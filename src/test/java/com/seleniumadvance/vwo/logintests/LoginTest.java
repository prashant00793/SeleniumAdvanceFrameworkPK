package com.seleniumadvance.vwo.logintests;

import com.seleniumadvance.basetest.CommonToAllTest;
import com.seleniumadvance.pages.PageObjectModel.DashboardPage_POM;
import com.seleniumadvance.pages.PageObjectModel.LoginPage_POM;
import com.seleniumadvance.utils.PropertyReader;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class LoginTest extends CommonToAllTest {

    @Test

    public void testLoginPositive() throws Exception {
        //who will start the webdriver - CommonToAllTest
        //How to enter credentials and go to the dashboard to verify
        //who will close the

        LoginPage_POM pagePom = new LoginPage_POM();
        DashboardPage_POM dashboardPagePom = pagePom.openURL(PropertyReader.readKey("url")).loginToVWOPositive().afterLogin();
        String expected_username = dashboardPagePom.loggedInUsername();
        Assertions.assertThat(expected_username)
                .isNotNull()
                .isNotBlank()
                .contains(PropertyReader.readKey("expected_username"));


    }
}
