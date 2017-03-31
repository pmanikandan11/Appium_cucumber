Feature: Booking a hotel

  Scenario Outline: Verify user is able to book hotel successfully
    Given I have started the appium server on device
    And the "<AppName>" application is installed
    And environment is setup
    #When Login to app
    #Then search for hotel
    #And Select the hotel and room
    #And Make payment through card
    And at last I stop appium server

    Examples: 
      | AppName      |
      | Orbitz       |
      | Cheaptickets |