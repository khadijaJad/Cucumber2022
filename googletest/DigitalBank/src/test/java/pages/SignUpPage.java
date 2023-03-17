package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import utilities.CommonMethods;
import utilities.ConfigReader;
import utilities.Constant;

public class SignUpPage extends  BasePage{

    @FindBy(id="title")
    WebElement titleDropDown;

    @FindBy(id="firstName")
    WebElement firstName;


    @FindBy(id="lastName")
    WebElement lastName;


    @FindBy(xpath="//input[@value='M']")
    WebElement genderMale;

    @FindBy(id="dob")
    WebElement dateOfBirth;

    @FindBy(id="ssn")
    WebElement ssn;

    @FindBy(id="emailAddress")
    WebElement emailAddress;

    @FindBy(id="password")
    WebElement password;

    @FindBy(id="confirmPassword")
    WebElement  confirmPassword;

    @FindBy(xpath="//button[@type='submit']")
    WebElement submitBtn;

    @Override
    public void verifyPage(){
        Assert.assertTrue("Title  dropDown is missing fromSign Up  Page",titleDropDown.isDisplayed());
        Assert.assertTrue("FirstName input is missing from Sign Up  Page",firstName.isDisplayed());
        
    }

    public void fillAllSignUpDetails() {
        //constants are used to store data from
        String Title=ConfigReader.getProperties("signup_title");

        Constant.inputDataOnUi.put("title ",Title);
        Select dropdownSelect =new Select(titleDropDown);
        dropdownSelect.selectByVisibleText(Title);


         String firstnameValue=ConfigReader.getProperties("signup_firstname");
        Constant.inputDataOnUi.put("firstname ",firstnameValue);
       firstName.sendKeys(firstnameValue);


        Constant.inputDataOnUi.put("lastname ",ConfigReader.getProperties("lastname"));
        lastName.sendKeys(ConfigReader.getProperties("lastname"));


        //Constant.inputDataOnUi.put("gender ",ConfigReader.getProperties("M "));
        genderMale.click();

        Constant.inputDataOnUi.put("dob ",ConfigReader.getProperties("d_ob"));
        dateOfBirth.sendKeys(ConfigReader.getProperties("d_ob"));


        String ssnValue= CommonMethods.generatesRandomSSN();
        Constant.inputDataOnUi.put("ssn ",ssnValue);
        ssn.sendKeys(ssnValue);

        String emailValue= ConfigReader.getProperties("signup_email_prefix")+CommonMethods.generatesRandomSSN()+"@gmail.com";
        Constant.inputDataOnUi.put("ssn ",emailValue);
       emailAddress.sendKeys(emailValue);


        password.sendKeys(ConfigReader.getProperties("password_DigitalBank"));//we don't have to store bcz it is ebcrypted
        confirmPassword.sendKeys(ConfigReader.getProperties("confirm_Password"));

    }

    public void clickOnNextBtn() {
        submitBtn.click();
    }
}
