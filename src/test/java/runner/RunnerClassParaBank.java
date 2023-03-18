package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"C:\\Users\\User\\Desktop\\OnlineCucumber\\parabank.demo\\src\\test\\resources\\parafeatures\\mailLogin.feature"},				
				glue= {"glucode"},
				monochrome=true,
				plugin= {"pretty","html:target/pass","rerun:target/fail.txt"}
		)
public class RunnerClassParaBank extends AbstractTestNGCucumberTests {

}
