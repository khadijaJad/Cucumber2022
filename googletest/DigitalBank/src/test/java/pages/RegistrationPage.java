package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {


    @FindBy(id="address")
    WebElement address;

    @FindBy(id="locality")
    WebElement locality;

    @FindBy(id="region")
    WebElement region;

    @FindBy(id="postalCode")
    WebElement postalCode;

    @FindBy(id="country")
    WebElement country;


    @FindBy(id="homePhone")
    WebElement homePhone;


    @FindBy(id="mobilePhone")
    WebElement mobilePhone;


    @FindBy(id="workPhone")
    WebElement workPhone;

    @FindBy(id="agree-terms")
    WebElement agreeTerms;

    @FindBy(xpath="//button[@type='submit']")
    WebElement registerBtn;



    @Override
    public void verifyPage(){
        Assert.assertTrue("Registration button is missing fromSign Up  Page",registerBtn.isDisplayed());
        Assert.assertTrue("Address input is missing from Sign Up  Page",address.isDisplayed());
    }

    public void fillAllRegistrationDetails() {
        address.sendKeys("test");
        locality.sendKeys("test123");
        region.sendKeys("test234");
        postalCode.sendKeys("25436");
        country.sendKeys("usa");
        homePhone.sendKeys("340-456-7689");
        mobilePhone.sendKeys("340-486-7689");
        workPhone.sendKeys("340-456-7689");
        agreeTerms.click();



    }

    public void ClickOnRegistrationbtn() {
        registerBtn.click();
    }
}


