package smokeTests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CheckAddToCart extends BaseTest{
    private static final String NUMBER_OF_PRODUCTS="1";

    @Test
    public void checkThatProductAddedToCart(){
    getHomePage().clickOnButtonTripsAndWalks();
    getTripsAndWalksPage().waitForPageLoadComplete(30);
    getTripsAndWalksPage().clickOnFilterStrollers();
    getStrollersPage().implicitWait(30);
    getStrollersPage().firstElementOnPage();
    getStrollerPage().waitForPageLoadComplete(30);
    getStrollerPage().clickOnButtonAddToCart();
    assertEquals(getStrollerPage().cartTakeValue(),NUMBER_OF_PRODUCTS);
    }
}
