package com.camila.pageObjects;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

    private ChromeDriver driver;

    public void setDriver(ChromeDriver driver){
        this.driver = driver;
    }

    public ChromeDriver getDriver(){
        return driver;
    }
}
