package stepDefination;

import com.ecommerce.pageLibrary.SearchRepository;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SearchFunction {

	SearchRepository sr= new SearchRepository();

@Given("user should navigated to automation site")
public void user_should_navigated_to_automation_site() {
	sr.launch();
  
}

@Then("Enter search criteria and click search button")
public void enter_search_criteria_and_click_search_button() throws Throwable {
	sr.search();
  
}

@Then("Select a product from search results")
public void select_a_product_from_search_results() throws InterruptedException {
	System.out.println("***************Select A Product Method***********");

	sr.selectProduct();
	//System.out.println("***************Product after a select method***********");
}

@Then("Add a prodct to cart")
public void add_a_prodct_to_cart() throws InterruptedException {
	System.out.println("***************User in add2cart method***********");

	sr.addtoCart();
}

}
