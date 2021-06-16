package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

	WebDriver driver;  
	
	@FindBy(xpath = "//*[@title='Search']")

	WebElement searchtextbox;
	
	
	
	public SearchPage(WebDriver driver)

	{

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}	
}

