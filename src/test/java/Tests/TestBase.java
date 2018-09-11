package Tests;

import org.openqa.selenium.WebDriver;

import Utilities.Driver;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class TestBase {

	WebDriver driver;
	
	@org.junit.Before
	public void methodSetUp() {		
		driver = Driver.getDriver("chrome");		
	}

	
	@org.junit.After
	public void testTearDown() {
		driver.close();
	}
}
