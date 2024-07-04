package Runner;

import org.junit.runner.RunWith; 
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\main\\java\\Features"
		,glue= "stepDefinition",
		 monochrome=true, 
         //tags = "@Login", 
         plugin= {"html:target/cucumber.html"})

public class TestRunner {

}
