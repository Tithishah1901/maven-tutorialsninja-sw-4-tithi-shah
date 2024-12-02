package php.index.demo.com.tutorialsninja.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import php.index.demo.com.tutorialsninja.utilities.Utility;

import java.util.List;

/**
 * //    Create the class MyAccountsTest
 * //1.1 create a method with the name "selectMyAccountOptions" It has one parameter
 * //    name "option" of type string
 * //1.2 This method should click on the options of whatever name is passed as a parameter.
 * //            (Hint: Handle List of Element and Select options)
 */

public class MyAccountPage extends Utility {
    By myAccountLink = By.xpath("//span[contains(text(),'My Account')]");

    public void selectMyAccountOptions(String option) {
        List<WebElement> myAccountList = getListOfElements(By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li"));
        try {
            for (WebElement options : myAccountList) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            myAccountList = getListOfElements(By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li"));
        }
    }

    public void clickOnMyAccountLink(){
        clickOnElement(myAccountLink);
    }

}
