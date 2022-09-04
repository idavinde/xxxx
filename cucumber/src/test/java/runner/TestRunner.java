package runner;

import org.junit.runner.RunWith;
import cucumber.*;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Features" , glue= {"glueCode"}, plugin= {"pretty", "html:target/htmlreports"})
public class TestRunner {
	
	
}
