package com.herokuapp.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

   public WebDriver initializeDriver() {
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       return driver;
   }
}
