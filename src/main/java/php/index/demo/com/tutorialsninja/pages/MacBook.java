package php.index.demo.com.tutorialsninja.pages;

import org.openqa.selenium.By;
import php.index.demo.com.tutorialsninja.utilities.Utility;

public class MacBook extends Utility {
    By selectMacBook = By.linkText("MacBook");

    public void selectProductMacBook(){
        clickOnElement(selectMacBook);
    }
}
