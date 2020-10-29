package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Cucumber.Automation.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.HomePage;


public class seleniumStepDefination extends Base {

	
	HomePage h;
	
	@Given("^User is on GreenKart Landing page$")
    public void user_is_on_greenkart_landing_page() throws Throwable {
        
		System.out.println("Navegando url");
		driver= Base.getDriver();
			
		  
    }

	   @When("^User search for vegetable (.+) Vegetable$")
	    public void user_search_for_vegetable_vegetable(String vegetable) throws Throwable {
    	
		   h= new HomePage(driver);
		   h.getSearch().sendKeys(vegetable);
		   
		   Thread.sleep(3000);
    }

    @SuppressWarnings("deprecation")
    @Then("^(.+) results are displayed$")
    public void results_are_displayed(String vegetable) throws Throwable {
    	//System.out.println(vegetable);
    Assert.assertTrue(	driver.findElement(By.cssSelector("h4.product-name")).getText().contains(vegetable));
    }
 

    @Then("^Verify selected (.+) are displayed in Check out page$")
    public void verify_selected_are_displayed_in_check_out_page(String vegetable) throws Throwable {
    	Assert.assertTrue(	driver.findElement(By.cssSelector("p.product-name")).getText().contains(vegetable));
    }

    @And("^Added (.+) items to cart$")
    public void added_items_to_cart(int number) throws Throwable {
        while (Integer.parseInt(driver.findElement(By.cssSelector("input.quantity")).getAttribute("value"))<number)
        {
        	driver.findElement(By.cssSelector("a.increment")).click();
        }
        
        driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();;
    }

    @And("^User proceeded to Checkout page to purchase$")
    public void user_proceeded_to_checkout_page_to_purchase() throws Throwable {
    	driver.findElement(By.xpath("//header/div[1]/div[3]/a[4]/img[1]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
    }
}
