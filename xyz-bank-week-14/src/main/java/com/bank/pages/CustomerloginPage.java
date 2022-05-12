package com.bank.pages;


import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

/**
 * Created by Jay Vaghani
 */
public class CustomerloginPage extends Utility {
    public CustomerloginPage() {
        PageFactory.initElements(driver,this);
    }



    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement searchCustomer;

    public void selectSearchCustomerField(String text){
        Reporter.log("Selecting Search Customer "+text+" from dropdown "+searchCustomer.toString() + "<br>");

       selectByVisibleTextFromDropDown(searchCustomer,text);
    }


}
