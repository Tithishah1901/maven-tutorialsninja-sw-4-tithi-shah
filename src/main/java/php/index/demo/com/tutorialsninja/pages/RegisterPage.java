package php.index.demo.com.tutorialsninja.pages;

import org.openqa.selenium.By;
import php.index.demo.com.tutorialsninja.utilities.Utility;

public class RegisterPage extends Utility {
   By selectSubscribeYesRadioButton = By.xpath("//label[normalize-space()='Yes']");
   By clickOnPrivacyPolicyCheckBox = By.xpath("//div[@class = 'buttons']//input[@name='agree']");
   By clickOnContinueButton = By.xpath("//input[@value='Continue']");
   By clickOnContinue = By.xpath("//a[contains(text(),'Continue')]");
   By clickOnMyAccountLink = By.xpath("//span[contains(text(),'My Account')]");

   public void enterFirstNameInFirstNameFiled(){
       sendTextToElement (By.id("input-firstname"),"Tithi");
   }
   public void enterLastNameInLastNameFiled(){
        sendTextToElement(By.name("lastname"), "Shah");
   }
   public void enterEmailInEmailField(){
       sendTextToElement(By.id("input-email"),"Tithi123@gmail.com");
   }
   public void enterTelephoneNumberInTelephoneFiled(){
       sendTextToElement(By.id("input-telephone"),"07448574485");
   }
   public void enterPasswordInPasswordFiled(){
       sendTextToElement(By.id("input-password"), "Tithi1234");
   }
   public void enterConfirmPasswordInConfirmPasswordFiled(){
       sendTextToElement(By.id("input-confirm"),"Tithi1234");

   }
   public void setSelectSubscribeYesRadioButton(){
       clickOnElement(selectSubscribeYesRadioButton);
   }
   public void setClickOnPrivacyPolicyCheckBox(){
       clickOnElement(clickOnPrivacyPolicyCheckBox);
   }
   public void setClickOnContinueButton(){
       clickOnElement(clickOnContinueButton);
   }
   public void setClickOnContinue(){
       clickOnElement(clickOnContinue);
   }
   public void setClickOnMyAccountLink(){
       clickOnElement(clickOnMyAccountLink);
   }

}

