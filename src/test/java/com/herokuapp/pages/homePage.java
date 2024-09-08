package com.herokuapp.pages;

import com.herokuapp.utils.propertiesUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.Properties;

import static org.openqa.selenium.By.linkText;

public class homePage {
    private WebDriver driver;
    public homePage(WebDriver driver){
        this.driver=driver;
    }
    private By fileUpload = By.linkText("File Upload");
    private By DynamicLoading = By.linkText("Dynamic Loading");

    public void visitUrl() throws IOException {
      // Properties props= propertiesUtil.loadProperties("com/herokuapp/config/production.properties");
     //  props.getProperty("url");

        driver.get("https://the-internet.herokuapp.com/");

    }
    public void clickOnFileUpload(){
        driver.findElement(fileUpload).click();
    }
    public void clickOnDynamicLoading(){
        driver.findElement(DynamicLoading).click();
    }



}
