#Author: brayden.lopera@sophossolutions.com


Feature: Buy product
  As a web user
  i want to use the vivanda web page
  to buy beer

 
  Scenario: Buy a sixpack beer
    Given Brayden was on the page home
    When he searchs the word "Heineken" and add to shopping cart
    Then he can see the product there


