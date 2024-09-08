package com.herokuapp.base;

import com.herokuapp.factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTests {
    protected WebDriver driver;


    @BeforeMethod
    public void setup(){
        driver=new DriverFactory().initializeDriver();
    }


    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
