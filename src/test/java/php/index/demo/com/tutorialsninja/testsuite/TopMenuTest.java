package php.index.demo.com.tutorialsninja.testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import php.index.demo.com.tutorialsninja.pages.ComponentsPage;
import php.index.demo.com.tutorialsninja.pages.Desktops;
import php.index.demo.com.tutorialsninja.pages.HomePage;
import php.index.demo.com.tutorialsninja.pages.LaptopsAndNoteBookPage;
import php.index.demo.com.tutorialsninja.testbase.BaseTest;

/**
 * 1. verifyUserShouldNavigateToDesktopsPageSuccessfully()
 * 1.1 Mouse hover on the “Desktops” Tab and click
 * 1.2 call the selectMenu() method and pass the menu = “Show AllDesktops”
 * 1.3 Verify the text ‘Desktops’
 * 2. verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully()
 * 2.1 Mouse hover on the “Laptops & Notebooks” Tab and click
 * 2.2 call selectMenu() method and pass the menu = “Show AllLaptops & Notebooks”
 * 2.3 Verify the text ‘Laptops & Notebooks’
 * 3. verifyUserShouldNavigateToComponentsPageSuccessfully()
 * 3.1 Mouse hover on the “Components” Tab and click
 * 3.2 call the selectMenu() method and pass the menu = “Show AllComponents”
 * 3.3 Verify the text ‘Components'.
 */
public class TopMenuTest extends BaseTest {
    HomePage homePage = new HomePage();
    LaptopsAndNoteBookPage laptopsAndNoteBookPage = new LaptopsAndNoteBookPage();
    ComponentsPage componentsPage = new ComponentsPage();
    Desktops desktops = new Desktops();

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        //1.1 Mouse hover on the “Desktops” Tab and click
        homePage.clickOnDesktopsLink();
        //1.2 call the selectMenu() method and pass the menu = “Show AllDesktops”
        homePage.selectMenu("Show AllDesktops");
        //1.3 Verify the text ‘Desktops’
        String expectedText = "Desktops";
        String actualText = desktops.getDesktopText();
        Assert.assertEquals(actualText, expectedText, "Desktop page not displayed");
    }

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() throws InterruptedException {
        // 2.1 Mouse hover on the “Laptops & Notebooks” Tab and click
        homePage.clickOnLaptopAndNoteBooksLink();
        // 2.2 call selectMenu() method and pass the menu = “Show AllLaptops & Notebooks”
        Thread.sleep(3000);
        homePage.selectMenu("Show AllLaptops & NoteBooks");
        //* 2.3 Verify the text ‘Laptops & Notebooks’
        String expectedText = "Laptops & Notebooks";
        String actualText = laptopsAndNoteBookPage.getLaptopAndNotebookText();
        Assert.assertEquals(actualText, expectedText, "Laptops and Notebooks page not displayed");

    }

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {
        //3.1 Mouse hover on the “Components” Tab and click
        homePage.clickOnComponentLink();
        //3.2 call the selectMenu() method and pass the menu = “Show AllComponents”
        homePage.selectMenu("SHow AllComponents");
        //* 3.3 Verify the text ‘Components'.
        String expectedText = "Components";
        String actualText = componentsPage.getComponentsText();
        Assert.assertEquals(actualText, expectedText, "Components page not displayed");
    }
}




