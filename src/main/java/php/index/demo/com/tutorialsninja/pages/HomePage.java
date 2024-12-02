package php.index.demo.com.tutorialsninja.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import php.index.demo.com.tutorialsninja.utilities.Utility;

import java.util.List;

/**
 * create a class "TopMenuTest"
 * 1.1 create a method with the name "selectMenu" It has one parameter named "menu" of
 * type string
 * 1.2 This method should click on the menu whatever name is passed as a parametcreate a class "TopMenuTest"
 * 1.1 create a method with the name "selectMenu" It has one parameter named "menu" of
 * type string
 * 1.2 This method should click on the menu whatever name is passed as a parameter
 */
public class HomePage extends Utility {

    By components = By.linkText("Components");
    By desktops = By.linkText("Desktops");
    By laptopAndNoteBooks = By.linkText("Laptops & Notebooks");
    By currency = By.xpath("//button[@class='btn btn-link dropdown-toggle']");
    By poundSterling = By.xpath("//button[normalize-space()='£Pound Sterling']");
    public void selectMenu(String menu) {
        List<WebElement> topMenuList = getListOfElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = getListOfElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        }
    }


    public void clickOnDesktopsLink() {
        clickOnElement(desktops);
    }
    public void clickOnComponentLink() {
        clickOnElement(components);
    }
    public void clickOnLaptopAndNoteBooksLink() {
        clickOnElement(laptopAndNoteBooks);
    }
    public  void clickOnCurrencyButton(){
        clickOnElement(currency);
    }
    public void clickOnPoundSterling(){
        clickOnElement(poundSterling);
    }

}

