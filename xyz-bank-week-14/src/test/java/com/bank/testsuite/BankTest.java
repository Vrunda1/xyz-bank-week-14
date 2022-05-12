package com.bank.testsuite;

;
import com.bank.pages.*;
import com.bank.testbase.TestBase;
import javafx.scene.control.Tab;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * Created by Jay Vaghani
 */

public class BankTest extends TestBase {

    HomePage homePage;
    CustomerloginPage customerloginPage;
    AddCustomerPage addCustomerPage;
    AccountPage accountPage;
    BankManagerLoginPage bankManagerLoginPage;
    OpenAccountPage openAccountPage = new OpenAccountPage();
    CustomerPage customerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        customerloginPage = new CustomerloginPage();
        addCustomerPage = new AddCustomerPage();
        accountPage = new AccountPage();
        bankManagerLoginPage = new BankManagerLoginPage();
        openAccountPage = new OpenAccountPage();
        customerPage = new CustomerPage();

    }

    @Test(groups = {"sanity", "regression"})
    public void bankManagerShouldAddCustomerSuccessfully() {
        homePage.clickOnbankManagerLogin();
        bankManagerLoginPage.clickOnAddCustomerButton();
        addCustomerPage.enterFirstName("Rina");
        addCustomerPage.enterLastName("Bailey");
        addCustomerPage.enterPostCode("w1 0nh");
        addCustomerPage.clickOnAddCusterdownBtn();
        SoftAssert softAssert = new SoftAssert();
        switchToAlert();
        softAssert.assertEquals(addCustomerPage.verifyAlertText().substring(0, 27), "Customer added successfully", "");
        acceptAlert();
       softAssert.assertAll();



    }

    @Test(groups = {"sanity","smoke", "regression"})
    public void bankManagerShouldOpenAccountSuccessfully() throws InterruptedException {
        homePage.clickOnHomeHeader();
        homePage.clickOnbankManagerLogin();
        bankManagerLoginPage.clickOnOpenAccoutnButton();
        Thread.sleep(1000);
        openAccountPage.selectCustomer("Rina Bailey");
        openAccountPage.setCurrency("Pound");
        openAccountPage.clickOnProcessButton();
        SoftAssert softAssert = new SoftAssert();
        try {
            switchToAlert();
            softAssert.assertEquals(openAccountPage.verifyAlertText().substring(0, 28), "Account created successfully");
            acceptAlert();
        }catch (Exception e) {
        }
        softAssert.assertAll();
    }

    @Test(groups = {"smoke","regression"})
  public void customerShouldLoginAndLogoutSuceessfully(){
        homePage.clickOnHomeHeader();
      homePage.clickOnCustomerLogin();
        customerloginPage.selectSearchCustomerField("Harry Potter");
        customerPage.clickOnLoginButton();
       SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(accountPage.verifyLogOutButton(),"Logout","");
        accountPage.clickOnLogOutButton();


   }
   @Test(groups = {"smoke","regression"})
    public void customerShouldDepositMoneySuccessfully(){
       homePage.clickOnHomeHeader();
       homePage.clickOnCustomerLogin();
       customerloginPage.selectSearchCustomerField("Harry Potter");
       customerPage.clickOnLoginButton();
        accountPage.clickOnDepositeButton();
       accountPage.enterAmount("100");
        accountPage.clickOnDepositedBox();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(accountPage.verifyDepositeSuccessfulMessage(),"Deposit Successful");

    }
    @Test(groups = {"regression"})
    public void customerShouldWithdrawMoneySuccessfully(){
        homePage.clickOnHomeHeader();
        homePage.clickOnCustomerLogin();
        customerloginPage.selectSearchCustomerField("Harry Potter");
        customerPage.clickOnLoginButton();
        accountPage.clickOnWithdrawButton();
       accountPage.enterWithDrawAmount("50");
      accountPage.clickOnwithdrawDown();
        SoftAssert softAssert = new SoftAssert();
       softAssert.assertEquals(accountPage.verifyWithTransactionSuccessfulMessage(),"Transaction successful","");

    }
}





