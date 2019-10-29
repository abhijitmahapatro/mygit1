$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Training_h2a.06.17/Desktop/java project/eclipse_abhijit/mycasestudycucumber/casestudycucumbertestme/mydemocasestudy.feature");
formatter.feature({
  "name": "Demo Web Shop APP",
  "description": "   user  wants to REGISTER MULTIPLE USERS",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Sucessful regisration",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@registration"
    }
  ]
});
formatter.step({
  "name": "user is  on demoweb url",
  "keyword": "Given "
});
formatter.step({
  "name": "user clicks on register button",
  "keyword": "And "
});
formatter.step({
  "name": "user gives correct credentials like \"\u003cemail\u003e\" and \"\u003cpassword\u003e\" and \"\u003cconfirmpassword\u003e\" and \"\u003cfirstname\u003e\" and \"\u003clastname\u003e\" and \"\u003cgender\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user gets sucessful registration message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "gender",
        "email",
        "password",
        "confirmpassword",
        "firstname",
        "lastname"
      ]
    },
    {
      "cells": [
        "Male",
        "pax@gmail.com",
        "krish123",
        "krish123",
        "krishu",
        "sinh"
      ]
    },
    {
      "cells": [
        "Female",
        "kish1243@gmail.com",
        "krish1234",
        "krish1234",
        "paki",
        "sing"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Sucessful regisration",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@registration"
    }
  ]
});
formatter.step({
  "name": "user is  on demoweb url",
  "keyword": "Given "
});
formatter.match({
  "location": "demowebshopcase.user_is_on_demoweb_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on register button",
  "keyword": "And "
});
formatter.match({
  "location": "demowebshopcase.user_clicks_on_register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user gives correct credentials like \"pax@gmail.com\" and \"krish123\" and \"krish123\" and \"krishu\" and \"sinh\" and \"Male\"",
  "keyword": "When "
});
formatter.match({
  "location": "demowebshopcase.user_gives_correct_credentials_like_and_and_and_and_and(String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user gets sucessful registration message",
  "keyword": "Then "
});
formatter.match({
  "location": "demowebshopcase.user_gets_sucessful_registration_message()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Sucessful regisration",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@registration"
    }
  ]
});
formatter.step({
  "name": "user is  on demoweb url",
  "keyword": "Given "
});
formatter.match({
  "location": "demowebshopcase.user_is_on_demoweb_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on register button",
  "keyword": "And "
});
formatter.match({
  "location": "demowebshopcase.user_clicks_on_register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user gives correct credentials like \"kish1243@gmail.com\" and \"krish1234\" and \"krish1234\" and \"paki\" and \"sing\" and \"Female\"",
  "keyword": "When "
});
formatter.match({
  "location": "demowebshopcase.user_gives_correct_credentials_like_and_and_and_and_and(String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user gets sucessful registration message",
  "keyword": "Then "
});
formatter.match({
  "location": "demowebshopcase.user_gets_sucessful_registration_message()"
});
formatter.result({
  "status": "passed"
});
});