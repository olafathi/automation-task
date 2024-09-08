package com.herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class dynamic_loading2Page {
    private WebDriver driver;

    public dynamic_loading2Page(WebDriver driver) {
        this.driver = driver;
    }

     By startButton= By.xpath("//*[@id=\"start\"]/button");
     By message=By.id("finish");
    public void clickOnStart(){
        driver.findElement(startButton).click();
    }
    public String getMessage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement msg = wait.until(ExpectedConditions.visibilityOfElementLocated(message));
         return msg.getText();
       // assertEquals(message,"Hello World!");
    }
}
