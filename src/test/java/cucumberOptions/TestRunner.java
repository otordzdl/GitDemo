package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//Feature


@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",tags="@Sel",
		glue="stepDefinations",monochrome=true,
		plugin= {"pretty","html:target/cucumber.html","json:target/cucumber.json","junit:target/cukes.xml"})


public class TestRunner {

}
