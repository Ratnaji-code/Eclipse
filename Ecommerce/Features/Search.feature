Feature: Search field validation

@RegressionTest
  Scenario: Search box validation
    Given user should navigated to automation site
     Then Enter search criteria and click search button
     Then Select a product from search results
     Then Add a prodct to cart
