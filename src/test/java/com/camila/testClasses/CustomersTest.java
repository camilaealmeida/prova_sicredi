package com.camila.testClasses;

import com.camila.pageObjects.AddCustomerPage;
import com.camila.pageObjects.CutomersPage;
import com.camila.scripts.Utils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class CustomersTest {

    private CutomersPage customersPage;
    private AddCustomerPage addCustomerPage;

    @Before
    public void setup() {

        ChromeDriver driver = new ChromeDriver();
        addCustomerPage = new AddCustomerPage();
        customersPage = new CutomersPage();
        customersPage.setDriver(driver);
        addCustomerPage.setDriver(driver);
    }

    @Test
    public void addCustomerTest() {
        //Login into grocery store
        customersPage.getDriver().manage().window().maximize();
        customersPage.getDriver().get("https://www.grocerycrud.com/demo/bootstrap_theme");
        //Select Version
        customersPage.selectVersion("bootstrap_theme_v4");
        //Wait page to load
        Utils.waitForJSToLoad(customersPage.getDriver());
        //Click Add Customers button
        customersPage.clickAddCustomers();
        //Wait page to load
        Utils.waitForJSToLoad(customersPage.getDriver());
        //Fill name
        addCustomerPage.FillName("Teste ");
        //Fill Last Name
        addCustomerPage.FillLastName("Teste");
        //Fill Contact First Name
        addCustomerPage.FillContactFirstName("Camila Almeida");
        //Fill Phone
        addCustomerPage.FillPhone("51 9999-9999");
        //Fill Address Line 1
        addCustomerPage.FillAddress1("Av Assis Brasil, 3970");
        //Fill Address Line 2
        addCustomerPage.FillAddress2("Torre D");
        //Fill City
        addCustomerPage.FillCity("Porto Alegre");
        //Fill State
        addCustomerPage.FillState("RS");
        //Fill Postal Code
        addCustomerPage.FillPostalCode("91000-000");
        //Fill Country
        addCustomerPage.FillCountry("Brasil");
        //Select Employer
        addCustomerPage.SelectEmployer("Bow");
        //Fill Credit Limit
        addCustomerPage.FillCreditLimit("200");
        //Click Save
        addCustomerPage.clickSave();
        //Wait for success message
        Utils.waitForJSToLoad(customersPage.getDriver());
        //Validate message
        Assert.assertEquals("Your data has been successfully stored into the database. Edit Customer or Go back to list", addCustomerPage.getSuccessMessage());

    }

    @After
    public void closePage(){
        customersPage.getDriver().close();
    }



}
