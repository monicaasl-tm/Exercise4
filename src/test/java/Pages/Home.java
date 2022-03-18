package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	public Home(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(linkText = "Shop")
	public WebElement shopButton;
	
	@FindBy(linkText = "Contact")
	public WebElement contactButton;

	
	
}
