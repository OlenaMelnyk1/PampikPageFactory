package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(xpath = "//div [@class='offers-menu-wrapper']//a[@href='/promo']")
    private WebElement buttonPromo;
    @FindBy(xpath = "//li[contains(@class,'first')]/a[contains(@href,'category/progulki-i-poezdki')]")
    private WebElement buttonTrips;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnButtonPromo() {
        buttonPromo.click();
    }
    public void clickOnButtonTripsAndWalks() {
        buttonTrips.click();
    }

}
