package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contact {
	
	public Contact(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		

		@FindBy(xpath = "//h4[contains(text(),'Address')]")
		public WebElement addressBox;

		@FindBy(xpath = "//h4[contains(text(),'Email')]")
		public WebElement emailBox;

		@FindBy(xpath = "//h4[contains(text(),'Phone')]")
		public WebElement phoneBox;

		@FindBy(xpath = "//h4[contains(text(),'Time')]")
		public WebElement timeBox;

		@FindBy(xpath = "//a[@role='button']")
		public WebElement callUsNow;

		@FindBy(xpath = "//input[@id='evf-277-field_ys0GeZISRs-1']")
		public WebElement nameField;

		@FindBy(xpath = "//input[@id='evf-277-field_LbH5NxasXM-2']")
		public WebElement emailField;

		@FindBy(xpath = "//input[@id='evf-277-field_66FR384cge-3']")
		public WebElement phoneField;

		@FindBy(xpath = "//textarea[@id='evf-277-field_yhGx3FOwr2-4']")
		public WebElement messageField;

		@FindBy(xpath = "//button[@id='evf-submit-277']")
		public WebElement submitButton;

		@FindBy(xpath = "//label[@id='evf-277-field_ys0GeZISRs-1-error']")
		public WebElement nameRequieredMessage;

		@FindBy(xpath = "//label[@id='evf-277-field_LbH5NxasXM-2-error']")
		public WebElement emailRequieredMessage;

		@FindBy(xpath = "//label[@id='evf-277-field_66FR384cge-3-error']")
		public WebElement phoneRequieredMessage;

		@FindBy(xpath = "//div[contains(text(),'Thanks for contacting us! We will be in touch with')]")
		public WebElement thankYouMessage;

	
}

