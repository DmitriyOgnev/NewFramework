package Tests;

import static org.junit.Assert.*;


import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.GoogleHomePage;
import Utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class PracticeTest extends TestBase{


	
	@Test
	public void myFirstTest() {
		driver.get("http://www.google.com");
		
		String searchTerm = "test best";
		GoogleHomePage googleHomePage = new GoogleHomePage();
		googleHomePage.searchBox.sendKeys(searchTerm + Keys.ENTER);
		
		String expected = driver.getTitle();
		assertTrue(expected.contains(searchTerm));
	}
	
	
}
