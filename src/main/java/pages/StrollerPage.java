package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StrollerPage extends BasePage {
    @FindBy(xpath = "//button[@data-href='/cart']")
    private WebElement buttonBuy;

    @FindBy(xpath = "//div[@class='cart-block ']//span[@class='elem-counter']")
    private WebElement buttonCart;

    public StrollerPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnButtonAddToCart() {
        buttonBuy.click();
    }
    public String cartTakeValue(){
        return  buttonCart.getText();
    }
}
