package php.index.demo.com.tutorialsninja.pages;

import org.openqa.selenium.By;
import php.index.demo.com.tutorialsninja.utilities.Utility;

public class ComponentsPage extends Utility {

    By components = By.xpath("//h2[contains(text(),'Components')]");

    public String getComponentsText(){
       return getTextFromElement(components);
    }

}
