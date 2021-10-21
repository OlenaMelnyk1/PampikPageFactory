package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class StrollersPage extends BasePage{
    @FindBy(xpath = "//ul[@id='products-list']//li[contains(@class,'listing__item')]" )
    private List<WebElement> firstPageOfStrollers;

    public StrollersPage(WebDriver driver) {
        super(driver);
    }
    public List<WebElement> listOfElementsOnPage() {
        return firstPageOfStrollers;
    }
    public void firstElementOnPage(){
        firstPageOfStrollers.get(0).click();
    }


}
