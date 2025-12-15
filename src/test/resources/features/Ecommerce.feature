Feature: Landing Page

    Scenario: Open landing page
        Given I am on the landing page
        Then User clicks on login button
        Then User enters email and password
        Then User clicks on login
        Then User validates if login is success
        Then User perform validation on the Home page
        When User clicks on products
        Then User performs the validation on the product listing page
        Then User clicks on view product
        Then User  performs validation on product description page
        Then User clicks on add to cart
        Then User validates the pop up
        When User clicks on view cart
        Then User performs validation on the cart page
        When User clicks on proceed to checkout
        Then User performs validation on the checkout page
        When User clicks on place order button
        Then User enters the payment details
        Then User clicks on pay and confirm button
        Then User validates the order confirmation message


