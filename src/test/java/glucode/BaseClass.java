package glucode;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.RemoteWebDriver;



import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class BaseClass {
    public RemoteWebDriver driver;
	public int lno=1;
	public static Scenario s;
	@Before
	public void beforeMethod(Scenario s)  {
		System.out.println(s.getName()+" scenario is started");
		
	}
	@BeforeStep
	public void beforeStepMethod(Scenario s) {
		System.out.println(lno+" is started");

	}
	@AfterStep
	public void afterStepStepMethod(Scenario s) {
		s.log("status of current step is: "+s.getStatus().name());
		
		lno++;
	}
	@After
	public void afterMethod(Scenario s) throws Exception  {
		s.log("status of current scenario is: "+s.getStatus().name());		
		
		if(s.isFailed()) {
		    byte[] screenshot =driver.getScreenshotAs(OutputType.BYTES);
			s.attach(screenshot, "image/png",s.getName()); 
		}
		
	}

	
}
