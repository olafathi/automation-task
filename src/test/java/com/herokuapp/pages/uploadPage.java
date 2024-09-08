package com.herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class uploadPage {
    private WebDriver driver;
public uploadPage(WebDriver driver){
    this.driver=driver;
}
    private By fileInput = By.id("file-upload");
    private By submitButton=By.id("file-submit");
    private By message=By.tagName("h3");

    public void uploadFile(){
        WebElement file = driver.findElement(fileInput);
        file.sendKeys("C:\\Users\\HP\\Downloads\\worldwide.png");
        driver.findElement(submitButton).click();
        String text =driver.findElement(message).getText();
    }

}
