package com.bank.pages;


import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

/**
 * Created by Jay Vaghani
 */
public class AddCustomerPage extends Utility {
    public AddCustomerPage() {
        PageFactory.initElements(driver,this);
    }



    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstName;

    public void enterFirstName(String fname){
        Reporter.log("Enter Firstname "+fname+ " to firstName field "+firstName.toString() + "<br>");
        sendTextToElement(firstName,fname);
    }

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastName;
    public void enterLastName(String lname){
        Reporter.log("Enter lastname "+lname+ " to lastName field "+lastName.toString() + "<br>");
        sendTextToElement(lastName,lname);
    }


    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement postCode;
    public void enterPostCode(String pcode){
        Reporter.log("Enter PostCode "+pcode+ " to postCode field "+postCode.toString() + "<br>");
        sendTextToElement(postCode,pcode);
    }


    public String verifyAlertText(){
     //  Reporter.log("getting alert text from "+getTextFromAlert.toString()+"<br>");
        return getTextFromAlert();
    }
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/button[1]")
    WebElement addCustomerdown;
    public void clickOnAddCusterdownBtn(){
        clickOnElement(addCustomerdown);
    }

}
