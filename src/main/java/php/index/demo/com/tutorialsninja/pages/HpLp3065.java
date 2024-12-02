package php.index.demo.com.tutorialsninja.pages;

import org.openqa.selenium.By;
import php.index.demo.com.tutorialsninja.utilities.Utility;

public class HpLp3065 extends Utility {

    By selectHpLp3065 = By.xpath("//a[contains(text(),'HP LP3065')]");
    By addToCart = By.xpath("//button[@id='button-cart']");
    By goToShoppingCart = By.xpath("//a[contains(text(),'shopping cart')]");
    public void selectDesktopHpLp3065() {
        clickOnElement(selectHpLp3065);
    }

    public void changeTheDate() {
        driver.findElement(By.xpath("//input[@id='input-option225']")).clear();
        driver.findElement(By.xpath("//input[@id='input-option225']")).sendKeys("2024-11-27");
    }

    public void selectQuantity() {
        sendTextToElement(By.name("quantity"), "1");
    }
    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }
    public void clickOnShoppingCart(){
        clickOnElement(goToShoppingCart);
    }
}


