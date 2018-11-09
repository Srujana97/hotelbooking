#Author: your.email@your.domain.com


Feature: HotelBooking

Background: User has already logged in
and is navigated to hotelbooking page

Scenario: Checking the heading of hotel booking page
Given User is on th e hotel booking form
Then Check the heading of the page

Scenario: Unsuccesful booking due empty field in the first name
Description: to login user need to enter firstname
Given User must enter valid firstname
When User enters invalid details
Then Navigate to hotel booking form

Scenario: Successful Hotel booking with all valid data
Given User is on hotel booking page
When User enters all valid data
Then Navigate to Welcome page

Scenario: Failure in hotel booking on leaving the first Name empty
Given User is on hotel booking page
When User leaves first name blank
And Clicks the button
Then Display alert message


Scenario: Failure in hotel Booking on leaving the last Name blank
Given User is on hotel booking page
When User leaves last Name blank and clicks the button 
Then Display alert msg

Scenario: Failure in hotel Booking on incorrect email format
Given User is on hotel booking page
When User enters all data
But User enters incorrect email format and clicks the button 
Then Display alert msg


Scenario: Failure in hotel Booking on on leaving the mobile no. blank
Given User is on hotel booking page
When User leaves MobileNo blank and  clicks the button
But User enetrs incorrect mobile format with greater than 10 digits and click the button
Then Display alert msg




Scenario: Failure in hotel Booking on incorrect mobile no. format
Given User is on hotel booking page
When User enters incorrect mobileNo and  clicks the button
|7722005780|
|0000000000|
|2456798696|
|45661|
|  |
Then Display alert msg


Scenario: Failure in hotel booking on not selecting the city
Given User is on the hotel booking page
When User does not select any city and clicks the button
Then Display alert msg


Scenario: Failure in hotel booking on not selecting the state
Given User is on the hotel booking page
When User does not select any state and clicks the button
Then Display alert msg



Scenario: Failure in hotel booking on not selecting the city
Given User is on hotel booking page
When User doesnot select city
Then Display alert msg

Scenario: Failure in hotel booking on not selecting the state
Given User is on hotel booking page
When User doesnot select city
Then Display alert msg



Scenario Outline: Validate the number of rooms allotted
Given User is on hotel booking page
When User enters <numberOfGuests>
Then Allocate rooms such that 1 room for minimum 3 guests
Examples:
|numberOfGuests|
|2|
|6|
|9|


Scenario: Failure in hotel booking on leaving the CardHolderName blank
Given User is on hotel booking page
When User leaves CardHolderName blank and clicks the button
Then Display alert msg


Scenario: Failure in hotel booking on leaving the DebitCardNumber blank
Given User is on hotel booking page
When User leaves CardHolderNumber blank and clicks the button
Then Display alert msg








