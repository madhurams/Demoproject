$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:FeatureFiles/Home.feature");
formatter.feature({
  "name": "Verify after successful login check the values are stored",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify whether the User is able to login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Home"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I launch the application",
  "keyword": "Given "
});
formatter.match({
  "location": "Login3.i_launch_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I login to the application using Username \"ravi.kiran1@gmail.com\" and Password \"rkiran\"",
  "keyword": "When "
});
formatter.match({
  "location": "Login3.i_login_to_the_application_using_Username_and_Password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "Login3.i_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see that the User is able to successfully login",
  "keyword": "Then "
});
formatter.match({
  "location": "Login3.i_should_see_that_the_User_is_able_to_successfully_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Amount header in the transaction table",
  "keyword": "Then "
});
formatter.match({
  "location": "Home.i_click_on_Amount_header_in_the_transaction_table()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check the values are stored",
  "keyword": "And "
});
formatter.match({
  "location": "Home.check_the_values_are_stored()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});