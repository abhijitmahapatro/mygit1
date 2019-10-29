
Feature: Add to cart in demo webshop
  Alex want to add to cart

  @invalidadd
  Scenario: Invalid add to cart
    Given Alex is registered with Demowebshop app
    
    When it searched for computer  
    And he clicked on shopping cart
    Then no carts is in the shopping cart item found
    

   @validadd
  Scenario: valid add to cart
    Given above Alex is registered with Demowebshop app
    
    When above it searched for computer  
    And  he clicked on add to cart 
    Then  computer is in the shopping cart item
    
