package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class OpenAccountPage extends Utility
{ public OpenAccountPage() {
    PageFactory.initElements(driver, this);
}


    @FindBy(xpath = "//select[@name='userSelect']")
    WebElement searchCustomer;
    public void selectCustomer(String customer){
        Reporter.log("Selecting Customer "+customer+" from dropdown "+searchCustomer.toString() + "<br>");
        selectByVisibleTextFromDropDown(searchCustomer,customer);
    }
    @FindBy(xpath = "//select[@id='currency']")
    WebElement currency;
    public void setCurrency(String currency1){
        Reporter.log("Selecting Currency "+currency1+" from dropdown "+currency.toString() + "<br>");
        selectByVisibleTextFromDropDown(currency,currency1);
    }

    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement processBtn;
    public void clickOnProcessButton(){
        Reporter.log("Clicking on Process Button"+ processBtn.toString()+ "<br>");
        clickOnElement(processBtn);
    }
    public String verifyAlertText(){
     //   Reporter.log("getting Alert text from "+desktopText.toString()+"<br>");
        return getTextFromAlert();
    }
}
