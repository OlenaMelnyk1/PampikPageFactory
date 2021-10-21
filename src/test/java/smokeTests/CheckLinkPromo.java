package smokeTests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class CheckLinkPromo extends BaseTest{

    private static final String CHECK_NAME_IN_LINK="promo";

    @Test
    public void checkLinkPromo(){
        getHomePage().clickOnButtonPromo();
        assertTrue(getDriver().getCurrentUrl().contains(CHECK_NAME_IN_LINK));
    }
}
