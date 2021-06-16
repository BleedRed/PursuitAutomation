package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage {
WebDriver driver;  
	
	@FindBy(xpath = "//*[@data-hveid='CAEQAw']")

	WebElement newssearchbox;
	
	@FindBy(xpath = "//*[@class='XTjFC WF4CUc']")

	List<WebElement> newsagencies;
	
	public ResultPage(WebDriver driver)

	{

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}	
}

