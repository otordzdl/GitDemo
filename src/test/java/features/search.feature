Feature: Search and place order for Vegetable
@Sel
Scenario Outline: Search for items and validate results
Given User is on GreenKart Landing page
When User search for vegetable <Vegetable> Vegetable
Then <Vegetable> results are displayed

Examples:
|Vegetable|
|Cucumber|


@Sel
Scenario Outline: Search for items then move to checkout page
Given User is on GreenKart Landing page
When User search for vegetable <Vegetable> Vegetable
And Added <number> items to cart
And User proceeded to Checkout page to purchase
Then Verify selected <Vegetable> are displayed in Check out page
Examples:
|Vegetable|number|
|Cucumber|2|

