package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TripsAndWalksPage extends BasePage{
    @FindBy(xpath = "//a[@href='/category/detskie-kolyaski/p/1922-23799/o/922']")
    private WebElement bucketStrollers;
    public TripsAndWalksPage(WebDriver driver) {
        super(driver);
    }
    public void clickOnFilterStrollers() {
        bucketStrollers.click();
    }
}
