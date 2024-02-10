package com.seleniumadvance.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DriverManager {

    //Static Method - Shared by all test cases
    //Thread Local - 1 Class or Test per Driver

    static WebDriver driver;

    public static void init() {
        if (driver == null) {
            driver = new EdgeDriver();

        }
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static void down() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
