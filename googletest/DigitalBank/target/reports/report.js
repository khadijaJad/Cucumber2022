$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/DigitalBankSignUp.feature");
formatter.feature({
  "line": 1,
  "name": "Verify Sign up functionality of digital bank",
  "description": "",
  "id": "verify-sign-up-functionality-of-digital-bank",
  "keyword": "Feature"
});
formatter.before({
  "duration": 18338500,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify User can Sign Up",
  "description": "",
  "id": "verify-sign-up-functionality-of-digital-bank;verify-user-can-sign-up",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user open digital bank website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user click on sign up button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "verify sign up page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user fill all details on sign up page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "click on next button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "verify register page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user fill all details on register page",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "click on register button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "verify registration success  message",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "verify all details updated in database",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_open_digital_bank_website()"
});
formatter.result({
  "duration": 12219101400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_click_on_sign_up_button()"
});
formatter.result({
  "duration": 2116815900,
  "status": "passed"
});
formatter.match({
  "location": "SignUpSteps.verify_sign_up_page_is_displayed()"
});
formatter.result({
  "duration": 187023900,
  "status": "passed"
});
formatter.match({
  "location": "SignUpSteps.user_fill_all_details_on_sign_up_page()"
});
formatter.result({
  "duration": 1887077100,
  "status": "passed"
});
formatter.match({
  "location": "SignUpSteps.click_on_next_button()"
});
formatter.result({
  "duration": 2844103200,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.verify_register_page_is_displayed()"
});
formatter.result({
  "duration": 132542100,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.user_fill_all_details_on_register_page()"
});
formatter.result({
  "duration": 1694584200,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.click_on_register_button()"
});
formatter.result({
  "duration": 3316607800,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.verify_registration_success_message()"
});
formatter.result({
  "duration": 69689800,
  "status": "passed"
});
formatter.match({
  "location": "DbValidationSteps.verify_all_details_updated_in_database()"
});
formatter.result({
  "duration": 10163900,
  "error_message": "java.lang.NullPointerException\r\n\tat step_Defs.DbValidationSteps.verify_all_details_updated_in_database(DbValidationSteps.java:21)\r\n\tat ✽.And verify all details updated in database(features/DigitalBankSignUp.feature:14)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1141700900,
  "status": "passed"
});
});