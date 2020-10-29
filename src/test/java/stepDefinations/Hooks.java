package stepDefinations;

import Cucumber.Automation.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base{
	@Before("@Smoke")
	public void beforeSmokeValidation()
	{
		System.out.println("**********************Before Smoke");
	}
	@After("@Smoke")
	public void afterSmokeValidation()
	{
		System.out.println("**********************After Smoke");
	}
	@After("@Sel")
	public void afterSeleniumValidation()
	{
		driver.close();
	}
}
