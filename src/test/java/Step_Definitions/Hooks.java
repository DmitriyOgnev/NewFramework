package Step_Definitions;

import org.openqa.selenium.WebDriver;

import Utilities.ConfigReader;
import Utilities.Driver;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	WebDriver driver;
	
	@Before
	public void methodSetUp() {		
		ConfigReader.getProperty("browser");				
	}

	
	@After
	public void testTearDown() {
		Driver.closeDriver();
	}
}
