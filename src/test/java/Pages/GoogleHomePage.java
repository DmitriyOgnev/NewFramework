package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Driver;

public class GoogleHomePage {
	
	public GoogleHomePage(){
		WebDriver driver = Driver.getDriver("chrome");
        PageFactory.initElements(driver, this);
    }
	
    @FindBy(name = "q")
    public WebElement searchBox;

}
