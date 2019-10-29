$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Training_h2a.06.17/Desktop/java project/eclipse_abhijit/mycasestudycucumber/casestudycucumbertestme/casestudy2.feature");
formatter.feature({
  "name": "Demoweb shop",
  "description": "  I want to login into demo webshop",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "sucessful demowebshop",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "user clicks on demoweb url",
  "keyword": "Given "
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "name": "user gives correct credentials like \"\u003cemail\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user moves to home page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "pax@gmail.com",
        "krish123"
      ]
    },
    {
      "cells": [
        "kish1243@gmail.com",
        "krish1234"
      ]
    }
  ]
});
formatter.scenario({
  "name": "sucessful demowebshop",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "user clicks on demoweb url",
  "keyword": "Given "
});
formatter.match({
  "location": "demowebshoplogin.user_clicks_on_demoweb_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "demowebshoplogin.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user gives correct credentials like \"pax@gmail.com\" and \"krish123\"",
  "keyword": "When "
});
formatter.match({
  "location": "demowebshoplogin.user_gives_correct_credentials_like_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user moves to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "demowebshoplogin.user_moves_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "sucessful demowebshop",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "user clicks on demoweb url",
  "keyword": "Given "
});
formatter.match({
  "location": "demowebshoplogin.user_clicks_on_demoweb_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "demowebshoplogin.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user gives correct credentials like \"kish1243@gmail.com\" and \"krish1234\"",
  "keyword": "When "
});
formatter.match({
  "location": "demowebshoplogin.user_gives_correct_credentials_like_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user moves to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "demowebshoplogin.user_moves_to_home_page()"
});
formatter.result({
  "status": "passed"
});
});