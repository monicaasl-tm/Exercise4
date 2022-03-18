package Tests;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import Steps.Steps;

public class ContactTests extends Steps {
	
	// TC_RQ_-002_001_001
	@Test(groups = {"ContactPage"})
	public void emailBox() {
		this.home.contactButton.click();
		AssertJUnit.assertTrue(this.contact.addressBox.isDisplayed());

	}

	// TC_RQ_-002_001_002
	@Test(groups = {"ContactPage"})
	public void addressBox() {

		this.home.contactButton.click();
		AssertJUnit.assertTrue(this.contact.emailBox.isDisplayed());

	}

	// TC_RQ_-002_001_003
	@Test(groups = {"ContactPage"})
	public void phoneBox() {

		this.home.contactButton.click();
		AssertJUnit.assertTrue(this.contact.phoneBox.isDisplayed());

	}

	// TC_RQ_-002_001_004
	@Test(groups = {"ContactPage"})
	public void timeBox() {

		this.home.contactButton.click();
		AssertJUnit.assertTrue(this.contact.timeBox.isDisplayed());

	}

	// TC_RQ_-002_002_001 FAIL
	@Test(groups = {"ContactPage"})
	public void callUsNow() {

		this.home.contactButton.click();
		this.contact.callUsNow.click();
		AssertJUnit.assertTrue(this.driver.getWindowHandles().size() > 1);

	}

	// TC_RQ_-002_003_001
	@Test(groups = {"ContactPage"})
	public void nameField() throws InterruptedException {
		this.driver.navigate().refresh();
		this.home.contactButton.click();
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(this.contact.emailField));
		this.contact.emailField.sendKeys("example@test.com");
		this.contact.phoneField.sendKeys("6692486367");
		this.contact.messageField.sendKeys("test1");
		this.contact.submitButton.click();
		AssertJUnit.assertTrue(this.contact.nameRequieredMessage.isDisplayed());

	}

	// TC_RQ_-002_003_002
	@Test(groups = {"ContactPage"})
	public void emailField() {

		this.home.contactButton.click();
		this.contact.nameField.sendKeys("Juan Perez");
		this.contact.phoneField.sendKeys("6692486367");
		this.contact.messageField.sendKeys("test1");
		this.contact.submitButton.click();
		AssertJUnit.assertTrue(this.contact.emailRequieredMessage.isDisplayed());

	}

	// TC_RQ_-002_003_003
	@Test(groups = {"ContactPage"})
	public void phoneField() {

		this.home.contactButton.click();
		this.contact.nameField.sendKeys("Juan Perez");
		this.contact.emailField.sendKeys("example@test.com");
		this.contact.messageField.sendKeys("test1");
		this.contact.submitButton.click();
		AssertJUnit.assertTrue(this.contact.phoneRequieredMessage.isDisplayed());

	}

	// TC_RQ_-002_003_004 FAIL
	@Test(groups = {"ContactPage"})
	public void messageField() {

		this.home.contactButton.click();
		this.contact.nameField.sendKeys("Juan Perez");
		this.contact.emailField.sendKeys("example@test.com");
		this.contact.phoneField.sendKeys("6692486367");
		this.contact.submitButton.click();
		AssertJUnit.assertFalse(this.contact.thankYouMessage.isDisplayed());

	}

}
