package stepDefinations;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class miStepDefinations {
	
	  @Given("^Validate initializaion$")
	    public void validate_initializaion() throws Throwable {
	        System.out.println("Init");
	    }

	    @When("^Browser is trigered$")
	    public void browser_is_trigered() throws Throwable {
	       System.out.println("Trigered");
	    }

	    @Then("^check if broser started$")
	    public void check_if_broser_started() throws Throwable {
	       System.out.println("Browser started");
	    }
	
	
	
	@Given("User is on NetBanking landing page")
	public void user_is_on_net_banking_landing_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Usuario en Landing Page");
	}




	@When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_login_into_application_with_something_and_password_something(String strUser, String strPass) throws Throwable {
		System.out.println(strUser +":"+ strPass);
	}

	@Then("Home page is populated")
	public void home_page_is_populated() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Home Page es llenado");
	}
	@And("^Cards displayed is \\\"([^\\\"]*)\\\"$")
	public void cards_are_displayed(boolean flag) {
		// Write code here that turns the phrase above into concrete actions
		if(flag) {
			System.out.println("Tarjetas desplegadas");
		}
		else {
			System.out.println("Tarjetas no desplegadas");
		}
	}

	@When("^User Sign Up with the following$")
	public void user_sign_up_with_the_following(DataTable data) throws Throwable {
		List<List<String>> obj= data.asLists();
		System.out.println(obj.get(0).get(0));
		System.out.println(obj.get(0).get(1));
		System.out.println(obj.get(0).get(2));
		System.out.println(obj.get(0).get(3));
	}

	@When("^User login in to application with (.+) and password (.+)$")
	public void user_login_into_application_with_and_password(String username, String password) throws Throwable {
		System.out.println(username +"-"+password);
	}
	@And("^ValCards displayed is (.+)$")
	public void cards_displayed_is(boolean flag) throws Throwable {
		if(flag) {
			System.out.println("Tarjetas desplegadas");
		}
		else {
			System.out.println("Tarjetas no desplegadas");
		}
	}

}
