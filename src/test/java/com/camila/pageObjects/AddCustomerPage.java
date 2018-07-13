package com.camila.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage extends BasePage {

    public void FillName(String customerName){
        getDriver().findElementByXPath("//*[@id=\'field-customerName\']").sendKeys(customerName);
    }

    public void FillLastName(String lastName){
        getDriver().findElementById("field-contactLastName").sendKeys(lastName);
    }

    public void FillContactFirstName(String contactFirstName){
        getDriver().findElementById("field-contactFirstName").sendKeys(contactFirstName);
    }

    public void FillPhone(String phone){
        getDriver().findElementById("field-phone").sendKeys(phone);
    }

    public void FillAddress1(String address1){
        getDriver().findElementById("field-addressLine1").sendKeys(address1);
    }

    public void FillAddress2(String address2){
        getDriver().findElementById("field-addressLine2").sendKeys(address2);
    }

    public void FillCity(String city){
        getDriver().findElementById("field-city").sendKeys(city);
    }

    public void FillState(String state){
        getDriver().findElementById("field-state").sendKeys(state);
    }

    public void FillPostalCode(String postalcode){
        getDriver().findElementById("field-postalCode").sendKeys(postalcode);
    }

    public void FillCountry(String country){
        getDriver().findElementById("field-country").sendKeys(country);
    }

    public void SelectEmployer(String employer){
        getDriver().findElementById("field_salesRepEmployeeNumber_chosen").click();
        getDriver().findElement(By.xpath("//*[@id=\'field_salesRepEmployeeNumber_chosen\']/div/div/input")).sendKeys(employer + Keys.TAB);

    }

    public void FillCreditLimit(String creditLimit){
        getDriver().findElementById("field-creditLimit").sendKeys(creditLimit);
    }

    public void clickSave(){
        getDriver().findElementById("form-button-save").click();
    }

    public String getSuccessMessage(){

        String msg = getDriver().findElementById("report-success").getText();
        return msg;
    }
}
