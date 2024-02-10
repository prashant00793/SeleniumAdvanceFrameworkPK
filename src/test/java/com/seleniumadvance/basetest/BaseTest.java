package com.seleniumadvance.basetest;

import com.seleniumadvance.driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    //To start the WebDriver and down the WebDriver

    @BeforeMethod
    protected void setUp() {
        DriverManager.init();
    }

    @AfterMethod
    protected void tearDown() {
        DriverManager.down();
    }
}
