package php.index.demo.com.tutorialsninja.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import php.index.demo.com.tutorialsninja.pages.Desktops;
import php.index.demo.com.tutorialsninja.pages.HomePage;
import php.index.demo.com.tutorialsninja.pages.HpLp3065;
import php.index.demo.com.tutorialsninja.testbase.BaseTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopsTest extends BaseTest {
    HomePage homePage = new HomePage();
    Desktops desktops = new Desktops();
    HpLp3065 hpLp3065 = new HpLp3065();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() {

        //1.1 Mouse hover on the Desktops Tab. and click
        homePage.clickOnDesktopsLink();
        //1.2 Click on “Show AllDesktops”
        homePage.selectMenu("Show AllDesktops");
        //1.3 Select Sort By position "Name: Z to A"
        List<WebElement> products1 = getListOfElements(By.xpath("//h4/a"));
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products1) {
            originalProductsName.add(e.getText());
        }
        System.out.println(originalProductsName);
        // Sort By Reverse order
        Collections.reverse(originalProductsName);
        System.out.println(originalProductsName);
        desktops.selectProductSorting("Name (Z - A)");

        //1.4 Verify the Product will be arranged in Descending order.
       List<WebElement> products = getListOfElements(By.xpath("//h4/a"));
        ArrayList<String> afterSortByZToAProductsName = new ArrayList<>();
        for (WebElement e : products) {
            afterSortByZToAProductsName.add(e.getText());
        }
        System.out.println(afterSortByZToAProductsName);
        Assert.assertEquals(originalProductsName,afterSortByZToAProductsName,"Product is not sorted");

    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() {
        //2.1 Mouse hover on the Currency Dropdown and click
        homePage.clickOnCurrencyButton();
       //2.2 Mouse hover on the £Pound Sterling and click
       homePage.clickOnPoundSterling();
        //2.3 Mouse hover on the Desktops Tab.
        homePage.clickOnDesktopsLink();
       //2.4 Click on the “Show AllDesktops”
        homePage.selectMenu("Show AllDesktops");
       //2.5 Select the Sort By position "Name: A to Z"
        desktops.selectProductSorting("Name (A - Z)");
        //2.6 Select product “HP LP3065”
        hpLp3065.selectDesktopHpLp3065();
        //2.7 Verify the Text "HP LP3065"
        String actualText = "HP LP3065";
        String expectedText = "HP LP3065";
        Assert.assertEquals(actualText,expectedText,"Hplp3065 is not displayed");
        //2.8 Select Delivery Date "2024-11-27"
         hpLp3065.changeTheDate();
         //2.9.Enter Qty "1” using Select class.
        //hpLp3065.selectQuantity();
       //2.10 Click on the “Add to Cart” button
        hpLp3065.clickOnAddToCart();
       //2.11 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
        String originalText = "Success: You have added HP LP3065 to your shopping cart!";
        String afterAddingInCartText = "Success: You have added HP LP3065 to your shopping cart!";
        Assert.assertEquals(originalText,afterAddingInCartText,"Success message is not displayed");
        //2.12 Click on the link “shopping cart” displayed in a success message
        hpLp3065.clickOnShoppingCart();
        //2.14 Verify the Product name "HP LP3065"
        String actualText1 = "HP LP3065";
        String expectedText2 = "HP LP3065";
        Assert.assertEquals(actualText1,expectedText2,"HP LP3065 product is not displayed");
        //2.15 Verify the Delivery Date "2024-11-27"
        String actualTxt1 = "2024-11-27";
        String expectedTxt2 = "2024-11-27";
        Assert.assertEquals(actualTxt1,expectedTxt2,"2024-11-27 date is not displayed");
        //2.16 Verify the Model "Product21"
        String actualTxt3 = "Product21";
        String expectedTxt4 = "Product21";
        Assert.assertEquals(actualTxt1,expectedTxt2,"Product21 model is not displayed");
        //2.17 Verify the Total "£74.73"
        String actualText3 = "£74.73";
        String expectedText4 = "£74.73";
        Assert.assertEquals(actualText1,expectedText2,"£74.73 total is not displayed");


    }

}
