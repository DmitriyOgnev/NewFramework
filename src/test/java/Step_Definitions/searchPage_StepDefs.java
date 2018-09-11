package Step_Definitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Pages.GoogleHomePage;
import Utilities.ConfigReader;
import Utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class searchPage_StepDefs {

	WebDriver driver;
	String searchTerm = "test best";
	
	@Given("User is on Home Page")
	public void user_is_on_Home_Page() {
		driver = Driver.getDriver(ConfigReader.getProperty("browser"));
		driver.get(ConfigReader.getProperty("url"));
	}

	@When("User searches for basic term")
	public void user_searches_for_basic_term() {
		
		GoogleHomePage googleHomePage = new GoogleHomePage();
		googleHomePage.searchBox.sendKeys(searchTerm + Keys.ENTER);
	}

	@Then("Title of the page changes to include basic term")
	public void title_of_the_page_changes_to_include_basic_term() {
		String expected = driver.getTitle();
		assertTrue(expected.contains(searchTerm));	
	}

	@When("User searches for basic {string}")
	public void user_searches_for_basic(String string) {
		searchTerm = string;
		user_searches_for_basic_term();
	}
	
	@Then("Title of the page changes to include basic {string}")
	public void title_of_the_page_changes_to_include_basic(String string) {
		searchTerm = string;
		title_of_the_page_changes_to_include_basic_term();
	}
	
}
