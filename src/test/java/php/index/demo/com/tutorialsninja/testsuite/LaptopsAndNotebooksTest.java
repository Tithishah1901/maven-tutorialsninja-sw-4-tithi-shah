package php.index.demo.com.tutorialsninja.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import php.index.demo.com.tutorialsninja.pages.Desktops;
import php.index.demo.com.tutorialsninja.pages.HomePage;
import php.index.demo.com.tutorialsninja.pages.LaptopsAndNoteBookPage;
import php.index.demo.com.tutorialsninja.pages.MacBook;
import php.index.demo.com.tutorialsninja.testbase.BaseTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopsAndNotebooksTest extends BaseTest {
    HomePage homePage = new HomePage();
    LaptopsAndNoteBookPage laptopsAndNoteBookPage = new LaptopsAndNoteBookPage();
    Desktops desktops = new Desktops();
    MacBook macBook = new MacBook();

    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() {
        //1.1 Mouse hover on the Laptops & Notebooks Tab. and click
        homePage.clickOnLaptopAndNoteBooksLink();
        //1.2 Click on “Show AllLaptops & Notebooks”
        homePage.selectMenu("Show AllLaptops & Notebooks");
        //1.3 Select the Sort By "Price (High > Low)"
        List<WebElement> products = getListOfElements(By.xpath("//p[@class ='price']"));
        List<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            System.out.println(e.getText());
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(originalProductsPrice);
        // Sort By Reverse order
        Collections.sort(originalProductsPrice, Collections.reverseOrder());
        System.out.println(originalProductsPrice);
        laptopsAndNoteBookPage.selectPriceSorting("Price (High > Low)");

//      1.4 Verify the Product price will be arranged in High to Low orders.
        products = getListOfElements(By.xpath("//p[@class ='price']"));
        ArrayList<Double> afterSortByPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            afterSortByPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(afterSortByPrice);
        Assert.assertEquals(originalProductsPrice, afterSortByPrice, "Product price is not sorted");
    }

    @Test
    public void verifyThatUserPlaceOrderSuccessfully() {
        //2.1 Mouse hover on the Laptops & Notebooks Tab and click
        homePage.clickOnLaptopAndNoteBooksLink();
        //2.2 Click on the “Show AllLaptops & Notebooks”
        homePage.selectMenu("Show AllLaptops & Notebooks");
        //2.3 Select Sort By "Price (High > Low)"
        laptopsAndNoteBookPage.selectPriceSorting("Price (High > Low)");
       //2.4 Select Product “MacBook”
        macBook.selectProductMacBook();
       //2.5 Verify the text “MacBook”
        String actualText = "MacBook";
        String expectedText = "MacBook";
        Assert.assertEquals(actualText,expectedText, "Macbook text noy displayed");
       //2.6 Click on the ‘Add To Cart’ button
         laptopsAndNoteBookPage.addToTheCart();
       //2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
        String originalText = "Success: You have added MacBook to your shopping cart!";
        String afterAddingInCartText = "Success: You have added MacBook to your shopping cart!";
        Assert.assertEquals(originalText,afterAddingInCartText,"Success message is not displayed");
       //2.8 Click on the link “shopping cart” display into the success message
         laptopsAndNoteBookPage.clickOnShoppingCart();
        //2.9 Verify the text "Shopping Cart"
        String actualText1 = "Shopping Cart";
        String expectedText2 = "Shopping Cart";
        Assert.assertEquals(actualText1,expectedText2,"Shopping Cart text is not displayed");
        //2.10 Verify the Product name "MacBook"
        String actualTxt = "MacBook";
        String expectedTxt = "MacBook";
        Assert.assertEquals(actualText1,expectedText2,"MacBook product is not displayed");
        //2.11 Change the Quantity "2"
        laptopsAndNoteBookPage.changeTheQuantity();
       //2.12 Click on the “Update” Tab
       laptopsAndNoteBookPage.clickOnUpDateTab();
       //2.13 Verify the message “Success: You have modified your shopping cart!”
        String originalText1 = "Success: You have modified your shopping cart!";
        String afterModifiedInCartText = "Success: You have modified your shopping cart!";
        Assert.assertEquals(originalText1,afterModifiedInCartText,"Success message is not displayed");
        //2.14 Verify the Total £737.45
        String actualText3 = "£737.45";
        String expectedText4 = "£737.45";
        Assert.assertEquals(actualText1,expectedText2,"£74.73 total is not displayed");
        //2.15 Click on the “Checkout” button
        laptopsAndNoteBookPage.clickOnCheckOutButton();
        //2.16 Verify the text “Checkout”
        String originalTxt1 = "Checkout";
        String expectedTxt2 = "Checkout";
        Assert.assertEquals(originalTxt1,expectedTxt2,"Checkout text is not displayed");
        //2.17 Verify the Text “New Customer”
        //2.18 Click on the “Guest Checkout” radio button
       //2.19 Click on “Continue” tab
       //2.20 Fill the mandatory fields
      //2.21 Click on “Continue” Button
      //2.22 Add Comments About your order into the text area
      //2.23 Check the Terms & Conditions check box
     //2.24 Click on the “Continue” button
    //2.25 Verify the message “Warning: Payment method require

    }
}

