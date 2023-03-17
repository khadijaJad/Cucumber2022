package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;


public class LoginPage extends BasePage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    WebDriver driver= Driver.getDriver();

    @FindBy(id="user-name")
    WebElement userNameEle;
    @FindBy(id="password")
    WebElement passwordEle;
    @FindBy(id="login-button")
    WebElement loginBtn;
    @FindBy(xpath="//div[@class='register-link m-t-15 text-center']//p//a")
    WebElement signUpButton;

    @FindBy (xpath ="//span[text()='Success']")
    WebElement registrationSuccessMsg;



   public void doLogin(){
       userNameEle.sendKeys(ConfigReader.getProperties("login.username"));
       userNameEle.sendKeys(ConfigReader.getProperties("login.password"));
       loginBtn.click();
   }
   public void verifyPage(){
       Assert.assertTrue("Username input is missing from Login Page",userNameEle.isDisplayed());
       Assert.assertTrue("Password input is missing from Login Page",passwordEle.isDisplayed());
   }

    public void openWebsite(){

        driver.get(ConfigReader.getProperties("digitalBankUrl"));


    }
    public void openDigitalBankWebsite(){
        driver.get(ConfigReader.getProperties("digitalBankUrl"));

    }
    public void clickOnSignUpBtn() {
       signUpButton.click();
    }

    public void VerifyRegistrationSuccesMsg() {
       Assert.assertTrue("Registration success message is not displayed",registrationSuccessMsg.isDisplayed());
    }
}
