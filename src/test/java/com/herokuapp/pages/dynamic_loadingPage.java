package com.herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dynamic_loadingPage {

private WebDriver driver;
public dynamic_loadingPage(WebDriver driver){
    this.driver=driver;
}
    private By example2 = By.partialLinkText("Example 2:");

public void clickOnExample2(){
    driver.findElement(example2).click();
}
}
