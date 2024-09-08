package com.herokuapp.testcases;

import com.herokuapp.base.BaseTests;
import com.herokuapp.factory.DriverFactory;
import com.herokuapp.pages.homePage;
import com.herokuapp.pages.uploadPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FileUploadTest extends BaseTests {
@Test
    public void fileUpload() throws IOException {
    homePage homePage=new homePage(driver);
    homePage.visitUrl();
    homePage.clickOnFileUpload();
    uploadPage upload=new uploadPage(driver);
    upload.uploadFile();
}
}
