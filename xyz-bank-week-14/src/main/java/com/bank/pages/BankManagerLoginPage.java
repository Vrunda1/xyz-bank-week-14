package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class BankManagerLoginPage extends Utility {
    public BankManagerLoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[2]")
    WebElement openAccoutnButton;
    public void clickOnOpenAccoutnButton() {
        Reporter.log("Clicking on Open Accoutn Button"+ openAccoutnButton.toString()+ "<br>");
        clickOnElement(openAccoutnButton);
    }

        @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[1]")
        WebElement addCustomer;

        public void clickOnAddCustomerButton(){
            Reporter.log("Clicking on Add Customer Button"+ addCustomer.toString()+ "<br>");
            clickOnElement(addCustomer);
        }
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[3]")
    WebElement customers;

    public void clickOnCustomersButton(){

        Reporter.log("Clicking on Customers Button"+ customers.toString()+ "<br>");
        clickOnElement(customers);
    }

    }

