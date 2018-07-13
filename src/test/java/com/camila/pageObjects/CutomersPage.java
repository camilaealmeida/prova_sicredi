package com.camila.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.Select;

public class CutomersPage extends BasePage {


    public void selectVersion(String version) {
        try {

            //Change version
            Select select = new Select(getDriver().findElement(By.id("switch-version-select")));

            select.selectByValue(version);
            } catch(StaleElementReferenceException elementReferenceException) {
            System.out.println("Stale exception ignored :)");
        }
    }

    public void clickAddCustomers(){
        getDriver().findElementByXPath("//*[@id=\'gcrud-search-form\']/div[1]/div[1]/a").click();
    }

}
