package pages;

import org.junit.Assert;

public class ReviewPage extends BasePage {
LoginPage loginPage=new LoginPage();
    public void verifyPage(){

Assert.assertTrue(loginPage.registrationSuccessMsg.isDisplayed());
    }
}
