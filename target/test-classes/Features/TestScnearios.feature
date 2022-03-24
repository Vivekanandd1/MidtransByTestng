Feature: Shopping of Pillow from E-commerce Web Application

  Scenario: User will open browser and navigate to Homepage of webApp and pruchase pillow from his/her credit card
    Given User open browser
    And User navigated to home page url
    When User clicked on BUYNOW button
    Then User filled up Checkout form
    And User completed Transaction process