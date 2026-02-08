package TestRuner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//features/LoginFeature.feature",
		glue="StepDefinatin",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","html:target/cucumer-report/report1.html"}
	
		
		)

public class Run {

}
