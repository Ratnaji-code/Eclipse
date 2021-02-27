package stepDefination;

import java.util.List;

import com.ecommerce.pageLibrary.CreateAnAccountLibrary;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAnAccount extends CreateAnAccountLibrary {

	CreateAnAccountLibrary account= new CreateAnAccountLibrary();
@Given("user should navigated to {string} website")
public void user_should_navigated_to_website(String string) {
	account.launch();
}

@When("click on Sign in link")
public void click_on_sign_in_link() {
	account.Login();

}

//@Then("enter Email address at AUTHENTICATION site")
//public void enter_email_address_at_authentication_site() {
//	account.yourPersonlInformation(firstName, lastName, email, password, Days, Months, Years);
//}
//
//@Then("click on Create an Account button")
//public void click_on_create_an_account_button() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}
@Then("enter Email address at AUTHENTICATION site and click on Create an Account button")
public void enter_email_address_at_authentication_site_and_click_on_create_an_account_button(io.cucumber.datatable.DataTable emailAddress) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
	
	List<String> data=emailAddress.row(0);
	//account.Authentication(emailAddress);
	
}


@Then("fill the form details with the following data")
public void fill_the_form_details_with_the_following_data() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

}
