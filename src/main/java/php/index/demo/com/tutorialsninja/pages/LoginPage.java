package php.index.demo.com.tutorialsninja.pages;

import org.openqa.selenium.By;
import php.index.demo.com.tutorialsninja.utilities.Utility;

public class LoginPage extends Utility {

    By clickOnLoginButton = By.xpath("//a[contains(text(),'Continue')]");
    public  void enterEmailInEmailFiled(){
        sendTextToElement(By.id("input-email"), "Tithi123@gmail.com");
    }


    public void enterPasswordInPasswordFiled(){
        sendTextToElement(By.id("input-password"), "Tithi1234");
    }
    public void setClickOnLoginButton(){
        clickOnElement(clickOnLoginButton);
    }

}
