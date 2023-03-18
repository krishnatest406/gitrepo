package glucode;


import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import io.cucumber.java.en.When;
import utility.WebSiteUtility;


public class LoginStepDef2 {
	public RemoteWebDriver driver;	 
	public BaseClass bc;
    public WebSiteUtility wu;
    
	public LoginStepDef2(BaseClass bc) {
		this.bc=bc;
	}
		   
	@When("close the site")
	public void closeSite() throws Exception {
		Thread.sleep(4000);
		wu=new WebSiteUtility();
		wu.closeSite(bc.driver);
	}
	
}
