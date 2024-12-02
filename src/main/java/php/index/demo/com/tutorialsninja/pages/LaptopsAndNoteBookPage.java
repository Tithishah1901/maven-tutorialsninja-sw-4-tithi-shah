package php.index.demo.com.tutorialsninja.pages;

import org.openqa.selenium.By;
import php.index.demo.com.tutorialsninja.utilities.Utility;

public class LaptopsAndNoteBookPage extends Utility {

    By laptopAndNoteBooks = By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");
    By sortingPrice = By.id("input-sort");
    By addToCart = By.xpath("//button[@id='button-cart']");
    By shoppingCart = By.xpath("//a[contains(text(),'shopping cart')]");
    By upDateTab = By.xpath("//button[contains(@data-original-title, 'Update')]");
    By checkOutButton = By.xpath("//strong[normalize-space()='Checkout']");

    public String getLaptopAndNotebookText (){
        return getTextFromElement(laptopAndNoteBooks);
    }
    public void selectPriceSorting(String type){
        selectByVisibleTextFromDropDown(sortingPrice, type);
    }
    public void addToTheCart(){
        clickOnElement(addToCart);
    }
    public void clickOnShoppingCart(){
        clickOnElement(shoppingCart);
    }
    public void changeTheQuantity(){
        driver.findElement(By.xpath("//tbody/tr[1]/td[4]/div[1]/input[1]")).clear();
        driver.findElement(By.xpath("//tbody/tr[1]/td[4]/div[1]/input[1]")).sendKeys("2");
    }
    public void clickOnUpDateTab(){
        clickOnElement(upDateTab);
    }
    public void clickOnCheckOutButton(){
        clickOnElement(checkOutButton);
    }
}



