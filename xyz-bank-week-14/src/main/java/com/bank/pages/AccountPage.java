package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AccountPage extends Utility {
    public AccountPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[3]/button[2]")
    WebElement deposite;
    public void clickOnDepositeButton(){
        Reporter.log("Clicking on deposite Button "+ deposite.toString()+ "<br>");
       clickOnElement(deposite);
    }
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]")
    WebElement amount;
    public void enterAmount(String amt){
        Reporter.log("Enter amount "+amt+ " to email field "+amount.toString() + "<br>");
        sendTextToElement(amount,amt);
    }
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]")
    WebElement depositedBtn;
    public void clickOnDepositedBox(){
        Reporter.log("Clicking on DepositedBox"+ depositedBtn.toString()+ "<br>");
        clickOnElement(depositedBtn);
    }
    @FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
    WebElement depositeSuccessText;

    public String verifyDepositeSuccessfulMessage(){
        Reporter.log("getting DepositeSuccessfulMessage from "+depositeSuccessText.toString()+"<br>");
        return getTextFromElement(depositeSuccessText);
    }
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[3]/button[3]")
    WebElement withdrawBtn;
    public void clickOnWithDrawBox(){
        Reporter.log("Clicking on WithDrawBox "+ withdrawBtn.toString()+ "<br>");
        clickOnElement(withdrawBtn);
    }
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]")
    WebElement withdrawDownBtn;
    public void clickOnwithdrawDown(){
        Reporter.log("Clicking on WithdrawButton "+ withdrawBtn.toString()+ "<br>");
        clickOnElement(withdrawDownBtn);
    }

    public void clickOnWithdrawButton() {
        Reporter.log("Clicking on WithdrawButton "+ withdrawBtn.toString()+ "<br>");
        clickOnElement(withdrawBtn);
    }
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]")
    WebElement amountWithdraw;
    public void enterWithDrawAmount(String withAmount){

        Reporter.log("Enter WithDraw Amount "+withAmount+ " to withdraw field "+withdrawBtn.toString() + "<br>");
        sendTextToElement(withdrawBtn,withAmount);
    }

    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement logOutBtn;

    public void clickOnLogOutButton() {

        Reporter.log("Clicking on LogOut Button "+ logOutBtn.toString()+ "<br>");
        clickOnElement(logOutBtn);
    }

    public String verifyLogOutButton() {
        Reporter.log("getting LogOut Button text from "+logOutBtn.toString()+"<br>");
        return getTextFromElement(logOutBtn);
    }
    @FindBy(xpath = "//body/div[3]/div[1]")
    WebElement transactionSuccessText;

    public String verifyWithTransactionSuccessfulMessage(){
        Reporter.log("getting Transaction Successful Message from "+transactionSuccessText.toString()+"<br>");
        return getTextFromElement(transactionSuccessText);
    }
}
