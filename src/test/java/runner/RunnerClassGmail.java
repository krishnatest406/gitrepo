package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"C:\\Users\\User\\Desktop\\OnlineCucumber\\gmail_Jenkins\\src\\test\\resources\\gmailfeature\\mailLogin.feature"},				
				glue= {"glucode"},
				monochrome=true,
				plugin= {"pretty","html:target/pass","rerun:target/fail.txt"}
		)
public class RunnerClassGmail extends AbstractTestNGCucumberTests {

}
