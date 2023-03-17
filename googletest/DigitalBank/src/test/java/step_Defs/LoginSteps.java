package step_Defs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utilities.Driver;

public class LoginSteps {
    WebDriver driver= Driver.getDriver();
    LoginPage loginPage = new LoginPage();

    @Given("user open website")
    public void user_open_website(){
        loginPage.openWebsite();
    }
    @When("user do login ")
    public void user_do_login(){
        loginPage.doLogin();
    }
    @Given("^user open digital bank website$")
    public void user_open_digital_bank_website() {
   loginPage.openDigitalBankWebsite();
    }

    @When("^user click on sign up button$")
    public void user_click_on_sign_up_button()  {
loginPage.clickOnSignUpBtn();
    }
    @Then("^verify registration success  message$")
    public void verify_registration_success_message()  {
loginPage.VerifyRegistrationSuccesMsg();
    }
}
