package smokeTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.HomePage;
import pages.StrollerPage;
import pages.StrollersPage;
import pages.TripsAndWalksPage;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTest {
    private WebDriver driver;
    private static final String PAMPIK_URL = "https://pampik.com/";


    @BeforeTest
    public void profileSetup() {
        chromedriver().setup();
    }

    @BeforeMethod
    public void testsSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(PAMPIK_URL);
    }

    @AfterTest
    public void tearDown() {
        driver.close();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public HomePage getHomePage() {
        return new HomePage(getDriver());
    }

    public TripsAndWalksPage getTripsAndWalksPage() {
        return new TripsAndWalksPage(getDriver());
    }

    public StrollersPage getStrollersPage() {
        return new StrollersPage(getDriver());
    }
    public StrollerPage getStrollerPage() {
        return new StrollerPage(getDriver());
    }
}
