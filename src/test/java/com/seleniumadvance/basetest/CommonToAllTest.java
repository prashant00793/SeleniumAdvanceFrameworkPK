package com.seleniumadvance.basetest;

import com.seleniumadvance.driver.DriverManagerTL;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

public class CommonToAllTest {

    //To start the WebDriver and down the WebDriver

    @BeforeMethod
    protected void setUp() throws MalformedURLException {
        DriverManagerTL.init();
    }

    @AfterMethod
    protected void tearDown() {
        DriverManagerTL.down();
    }
}
