package php.index.demo.com.tutorialsninja.testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import php.index.demo.com.tutorialsninja.pages.LoginPage;
import php.index.demo.com.tutorialsninja.pages.MyAccountPage;
import php.index.demo.com.tutorialsninja.pages.RegisterPage;
import php.index.demo.com.tutorialsninja.testbase.BaseTest;

public class MyAccountsTest extends BaseTest {
  MyAccountPage myAccountPage = new MyAccountPage();
  RegisterPage registerPage = new RegisterPage();
  LoginPage loginPage = new LoginPage();
   @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {

            //1.1 Click on the My Account Link.
            myAccountPage.clickOnMyAccountLink();
            //1.2 Call the method “selectMyAccountOptions()” method and pass the parameter “Register”
             myAccountPage.selectMyAccountOptions("Register");
            //1.3 Verify the text “Register Account”.
            String actualText = "Register Account";
            String expectedText = "Register Account";
            Assert.assertEquals(actualText,expectedText,"Register Account text is not displayed");
}
   @Test
   public void verifyUserShouldNavigateToLoginPageSuccessfully() {
             //2.1 Click on the My Account Link.
             myAccountPage.clickOnMyAccountLink();
             // 2.2 Call the method “selectMyAccountOptions()” method and pass the parameter “Login”
             myAccountPage.selectMyAccountOptions("Login");
            //2.3 Verify the text “Returning Customer”.
            String actualText = "Returning Customer";
            String expectedText = "Returning Customer";
            Assert.assertEquals(actualText,expectedText,"Returning Customer text is not displayed");
   }
   @Test
   public void verifyThatUserRegisterAccountSuccessfully() {
             //3.1 Click on the My Account Link.
             myAccountPage.clickOnMyAccountLink();
             //3.2 Call the method “selectMyAccountOptions()” method and pass the parameter “Register”
              myAccountPage.selectMyAccountOptions("Register");
             //3.3 Enter the First Name
              registerPage.enterFirstNameInFirstNameFiled();
             //3.4 Enter the Last Name
             registerPage.enterLastNameInLastNameFiled();
             //3.5 Enter the Email
             registerPage.enterEmailInEmailField();
             //3.6 Enter the Telephone
             registerPage.enterTelephoneNumberInTelephoneFiled();
             //3.7 Enter the Password
            registerPage.enterPasswordInPasswordFiled();
            //3.8 Enter the Password Confirm
            registerPage.enterConfirmPasswordInConfirmPasswordFiled();
            //3.9 Select Subscribe Yes radio button
            registerPage.setSelectSubscribeYesRadioButton();
            //3.10 Click on the Privacy Policy check box
            registerPage.setClickOnPrivacyPolicyCheckBox();
            //3.11 Click on the Continue button
            registerPage.setClickOnContinueButton();
            //3.12 Verify the message “Your Account Has Been Created!”
            String actualText = "Your Account Has Been Created!";
            String expectedText = "Your Account Has Been Created!";
            Assert.assertEquals(actualText,expectedText,"Your Account Has Been Created! message not displayed");
            //3.13 Click on the Continue button
            registerPage.setClickOnContinue();
            //3.14 Click on the My Account Link.
            registerPage.setClickOnMyAccountLink();
            //3.15 Call the method “selectMyAccountOptions()” method and pass the parameter “Logout”
            myAccountPage.selectMyAccountOptions("Logout");
            //3.16 Verify the text “Account Logout”
            String actualText1 = "Account Logout";
            String expectedText1 = "Account Logout";
            Assert.assertEquals(actualText1,expectedText1,"Account Logout text is not displayed");
            //3.17 Click on the Continue button
            registerPage.setClickOnContinue();
   }

   @Test
           public void verifyThatUserShouldLoginAndLogoutSuccessfully() {
       //4.1 Click on the My Account Link.
       registerPage.setClickOnMyAccountLink();
       //4.2Call the method “selectMyAccountOptions()” method and pass the parameter “Login”
       myAccountPage.selectMyAccountOptions("Login");
       //4.3 Enter the Email address
       loginPage.enterEmailInEmailFiled();
       //4.4 Enter the Last Name
       //4.5 Enter the Password
       loginPage.enterPasswordInPasswordFiled();
       //4.6 Click on the Login button
       loginPage.setClickOnLoginButton();
       //4.7 Verify text “My Account”
       String actualText = "My Account";
       String expectedText = "My Account";
       Assert.assertEquals(actualText,expectedText, "My Account text is not displayed");
       //4.8 Click on the My Account Link.
       registerPage.setClickOnMyAccountLink();
       //4.9 Call the method “selectMyAccountOptions()” method and pass the parameter “Logout”
       myAccountPage.selectMyAccountOptions("Logout");
       //4.10 Verify the text “Account Logout”
       String actualText1 = "Account Logout";
       String expectedText2 = "Account Logout";
       Assert.assertEquals(actualText1,expectedText2, "Account Logout text is not displayed");
       //4.11 Click on the Continue button
       registerPage.setClickOnContinueButton();
   }
}
