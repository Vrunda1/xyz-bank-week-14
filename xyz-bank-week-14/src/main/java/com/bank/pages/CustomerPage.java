package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CustomerPage extends Utility {
    public CustomerPage() {
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement loginbutton;

    public void clickOnLoginButton(){
        Reporter.log("Clicking on Login Button"+ loginbutton.toString()+ "<br>");
        clickOnElement(loginbutton);
    }

}
