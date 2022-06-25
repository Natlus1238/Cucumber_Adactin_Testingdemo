$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Adactin Hotel Booking App",
  "description": "",
  "id": "adactin-hotel-booking-app",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "user Logging in the Webapp",
  "description": "",
  "id": "adactin-hotel-booking-app;user-logging-in-the-webapp",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Smoketest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Lauching the url of Adactin Webpage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enetering the username",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user entering the password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicking the login button to navigate to search hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition_adactin.user_Lauching_the_url_of_Adactin_Webpage()"
});
formatter.result({
  "duration": 3552196200,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition_adactin.user_enetering_the_username()"
});
formatter.result({
  "duration": 184017000,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition_adactin.user_entering_the_password()"
});
formatter.result({
  "duration": 127178100,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition_adactin.user_clicking_the_login_button_to_navigate_to_search_hotel_page()"
});
formatter.result({
  "duration": 2850043000,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "user searching for hotel",
  "description": "",
  "id": "adactin-hotel-booking-app;user-searching-for-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@Smoketest"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "user entering location",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user selecting hotel",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user selecting room type",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user selecting no of rooms",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user check in date",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user check out date",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user selecting no of adults",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user selecting no of childs",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user clicking on the search button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition_adactin.user_entering_location()"
});
formatter.result({
  "duration": 192491900,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition_adactin.user_selecting_hotel()"
});
formatter.result({
  "duration": 167340100,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition_adactin.user_selecting_room_type()"
});
formatter.result({
  "duration": 178538900,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition_adactin.user_selecting_no_of_rooms()"
});
formatter.result({
  "duration": 178000900,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition_adactin.user_check_in_date()"
});
formatter.result({
  "duration": 123347900,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition_adactin.user_check_out_date()"
});
formatter.result({
  "duration": 110252600,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition_adactin.user_selecting_no_of_adults()"
});
formatter.result({
  "duration": 205724400,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition_adactin.user_selecting_no_of_childs()"
});
formatter.result({
  "duration": 172711200,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition_adactin.user_clicking_on_the_search_button()"
});
formatter.result({
  "duration": 471103000,
  "status": "passed"
});
});