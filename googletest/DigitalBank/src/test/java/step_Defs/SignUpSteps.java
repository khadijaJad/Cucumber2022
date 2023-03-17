package step_Defs;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.SignUpPage;
import utilities.Driver;

public class SignUpSteps {
    WebDriver driver= Driver.getDriver();

SignUpPage signUpPage =new SignUpPage();
    @Then("^verify sign up page is displayed$")
    public void verify_sign_up_page_is_displayed()  {
        signUpPage.verifyPage();
    }

    @When("^user fill all details on sign up page$")
    public void user_fill_all_details_on_sign_up_page()  {
        signUpPage.fillAllSignUpDetails();
    }

    @When("^click on next button$")
    public void click_on_next_button(){
signUpPage.clickOnNextBtn();
    }
}
