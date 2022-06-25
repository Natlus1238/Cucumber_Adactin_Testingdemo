Feature: Adactin Hotel Booking App

@Smoketest
Scenario: user Logging in the Webapp
Given user Lauching the url of Adactin Webpage
When user enetering the username
And user entering the password
Then user clicking the login button to navigate to search hotel page

@Smoketest
Scenario: user searching for hotel
When user entering location 
And user selecting hotel
And user selecting room type
And user selecting no of rooms 
And user check in date
And user check out date
And user selecting no of adults
And user selecting no of childs
Then user clicking on the search button

Scenario: user selecing the hotel
When user confirming the selection
Then user cclicking on continue button

Scenario: user giving additional details for booking hotel
When user giving first name
And user giving last name
And user giving address
And user giving card number
And user giving card type
And user giving card expiry mon
And user giving card expiry yeaar
And user giving card ccv number
Then user booking hotel








