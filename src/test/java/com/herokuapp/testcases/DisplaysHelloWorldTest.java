package com.herokuapp.testcases;

import com.herokuapp.base.BaseTests;
import com.herokuapp.pages.dynamic_loading2Page;
import com.herokuapp.pages.dynamic_loadingPage;
import com.herokuapp.pages.homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.IOException;
import java.time.Duration;


public class DisplaysHelloWorldTest extends BaseTests {

    @Test
    public void DisplaysHelloWorld() throws IOException {

        homePage homepage=new homePage(driver);
        homepage.visitUrl();
        homepage.clickOnDynamicLoading();

        dynamic_loadingPage dynamicLoadingPage=new dynamic_loadingPage(driver);
        dynamicLoadingPage.clickOnExample2();

        dynamic_loading2Page dynamicLoading2Page=new dynamic_loading2Page(driver);
        dynamicLoading2Page.clickOnStart();

        String msg= dynamicLoading2Page.getMessage();
       assertEquals(msg,"Hello World!");

    }
}