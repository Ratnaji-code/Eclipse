package stepDefination;

import com.ecommerce.pageLibrary.womenDressRepository;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class womenDress {
	
//	TestBase tb= new TestBase();
//	SearchRepository sr= new SearchRepository();
	womenDressRepository wd= new womenDressRepository();
@Given("user should navigate to website")
public void user_should_navigate_to_website() {

wd.launch();
}

@Then("mouse over on Women")
public void mouse_over_on_women() {
  wd.selectWomenDress();
}

@Then("select Blouses")
public void select_blouses() {
   wd.selectBlouses();
}

@Then("select Color")
public void select_color() {
	wd.selectBlouseColor();

}

@Then("select size")
public void select_size() {
    wd.selectSize();
}

@Then("click on Add to cart button")
public void click_on_add_to_cart_button() throws InterruptedException {
  wd.addtoCart();
}

}
