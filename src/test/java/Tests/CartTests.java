package Tests;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import Steps.Steps;

public class CartTests extends Steps{
	
	
	
	//TC_RQ_-003_001_001
	@Test(groups = {"CartPage"})
	public void productsFromCat(){
		
		this.home.shopButton.click();
		this.shop.categoryClothes.click();
		this.shop.addSkirt.click();
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(this.shop.viewCart));
		this.shop.viewCart.click();
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(this.cart.tableCart));
		AssertJUnit.assertTrue(this.cart.tableCart.getText().contains("Skirt"));
	}
	
	//TC_RQ_-003_001_002
	@Test(groups = {"CartPage"})
	public void productsFromSearch() {
		
		this.home.shopButton.click();
		this.shop.searchTextBox.sendKeys("wat");
		this.shop.searchButton.click();
		this.shop.addZurWatch.click();
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(this.shop.viewCart));
		this.shop.viewCart.click();
		AssertJUnit.assertTrue(this.cart.tableCart.getText().contains("Watch"));
	}
	
	//TC_RQ_-003_002_001
	@Test(groups = {"CartPage"})
	public void cartProducts() {
		
		this.home.shopButton.click();
		this.shop.addConverse.click();
		this.shop.addHeadphones.click();
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(this.shop.viewCart));
		this.shop.viewCart.click();
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(this.cart.tableCart));
		AssertJUnit.assertTrue(this.cart.tableProducts.size()>2);

	}
	
	//TC_RQ_-003_003_001
	@Test(groups = {"CartPage"})
	public void removeProduct() {
		
		this.home.shopButton.click();
		this.shop.addConverse.click();
		this.shop.addHeadphones.click();
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(this.shop.viewCart));
		this.shop.viewCart.click();
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(this.cart.tableCart));
		this.cart.removeProduct.click(); 
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(this.cart.removedMessage));
		AssertJUnit.assertTrue(this.cart.removedMessage.getText().contains("removed"));
		
	}
	
	//TC_RQ_-003_004_001
	@Test(groups = {"CartPage"})
	public void checkOut() {
		
		this.home.shopButton.click();
		this.shop.addSkirt.click(); 
		this.shop.addConverse.click();
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(this.shop.viewCart));
		this.shop.viewCart.click();
		this.cart.checkOutButton.click();
		AssertJUnit.assertTrue(this.cart.billingDetails.isDisplayed());
	
	}

}
