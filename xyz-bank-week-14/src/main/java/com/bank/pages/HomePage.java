package com.bank.pages;


import com.bank.utility.Utility;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

/**
 * Created by Jay Vaghani
 */
public class HomePage extends Utility {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement bankManagerLoginBtn;
    public void clickOnbankManagerLogin()    {
        Reporter.log("Clicking on bank Manager Login"+ bankManagerLoginBtn.toString()+ "<br>");
        clickOnElement(bankManagerLoginBtn);
    }

    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement customerLogin;
    public void clickOnCustomerLogin(){
        Reporter.log("Clicking on Customer Login"+ customerLogin.toString()+ "<br>");
        clickOnElement(customerLogin);
    }
    @FindBy(xpath = "//button[contains(text(),'Home')]")
    WebElement homeHeader;
    public void clickOnHomeHeader(){
        Reporter.log("Clicking on Home button "+ customerLogin.toString()+ "<br>");
        clickOnElement(homeHeader);
    }

}

