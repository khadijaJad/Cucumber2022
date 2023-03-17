package step_Defs;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.RegistrationPage;

public class RegistrationSteps {



    RegistrationPage registrationPage=new RegistrationPage();
    @Then("^verify register page is displayed$")
    public void verify_register_page_is_displayed()  {
        registrationPage.verifyPage();

    }

    @When("^user fill all details on register page$")
    public void user_fill_all_details_on_register_page()  {
        registrationPage.fillAllRegistrationDetails();
    }

    @When("^click on register button$")
    public void click_on_register_button() {
        registrationPage.ClickOnRegistrationbtn();
    }
}
