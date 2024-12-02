package php.index.demo.com.tutorialsninja.pages;

import org.openqa.selenium.By;
import php.index.demo.com.tutorialsninja.utilities.Utility;

public class Desktops extends Utility {
    By desktopText =By.xpath("//h2[normalize-space()='Desktops']");
    By sortingProduct = By.id("input-sort");


        public String getDesktopText(){
        return getTextFromElement(desktopText);
    }

    public void selectProductSorting(String type){
    selectByVisibleTextFromDropDown(sortingProduct, type);
    }

}
