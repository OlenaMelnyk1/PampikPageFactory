package smokeTests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class CheckListAmount extends BaseTest{

@Test
    public void checkThatListContains20Products(){
        getHomePage().clickOnButtonTripsAndWalks();
        getTripsAndWalksPage().waitForPageLoadComplete(30);
        getTripsAndWalksPage().clickOnFilterStrollers();
        getStrollersPage().waitForPageLoadComplete(30);
        List<WebElement> elements = getStrollersPage().listOfElementsOnPage();
        assertEquals(elements.size(),20);
    }
}
